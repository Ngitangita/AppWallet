package com.app.wellet.repository;

import com.app.wellet.DTO.request.TransactionRequestDTO;
import com.app.wellet.DTO.response.TransactionResponseDTO;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.app.wellet.config.DatabaseConnection.*;

public class TransactionRepository  implements RepositoryCrudOperations<
        TransactionResponseDTO, TransactionRequestDTO, Long
>{
    @Override
    public List<TransactionResponseDTO> findAll() {
        String sql = "SELECT * FROM \"transaction\"";
        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)
        ) {
            return this.fromTransactionList(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<TransactionResponseDTO> saveAll(List<TransactionRequestDTO> toSave) {
        String sql = "INSERT INTO \"transaction\" (amount, type, transaction_date) VALUES (?, ?, ?) RETURNING *";
        List<TransactionResponseDTO> savedTransactions = new ArrayList<>();
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)
        ) {
            for (TransactionRequestDTO transactionRequestDTO : toSave) {
                this.setTransactionParameters(stmt, transactionRequestDTO);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    savedTransactions.add(this.fromTransactionResponse(rs));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return savedTransactions;
    }

    @Override
    public List<TransactionResponseDTO> updateAll(List<TransactionResponseDTO> toUpdate) {
        List<TransactionResponseDTO> updatedTransactions = new ArrayList<>();
        String sql = "UPDATE \"transaction\" SET amount = ?, type = ?, transaction_date = ?  WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)
        ) {
            for (TransactionResponseDTO updatedTransaction : toUpdate) {
                stmt.setFloat(1, updatedTransaction.amount());
                stmt.setString(2, updatedTransaction.type());
                stmt.setObject(3, updatedTransaction.transactionDate());
                stmt.setInt(4, updatedTransaction.id());
                int affectedRows = stmt.executeUpdate();
                if (affectedRows > 0) {
                    updatedTransactions.add(updatedTransaction);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return updatedTransactions;
    }

    @Override
    public TransactionResponseDTO saveByEntity(TransactionRequestDTO toSave) {
        String sql = "INSERT INTO \"transaction\" (amount, type, transaction_date) VALUES (?, ?, ?)";
        try(Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            this.setTransactionParameters(stmt, toSave);
            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        return fromTransactionResponse(generatedKeys);
                    } else {
                        throw new SQLException("Creating transaction failed, no ID obtained.");
                    }
                }
            } else {
                throw new SQLException("Creating transaction failed, no rows affected.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public TransactionResponseDTO deleteByEntity(TransactionResponseDTO toDelete) {
        String deletedTransaction = "DELETE FROM \"transaction\" WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(deletedTransaction)
        ) {
            stmt.setInt(1, toDelete.id());
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                return toDelete;
            } else {
                throw new SQLException("Removing transaction failed, no rows affected.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public TransactionResponseDTO findById(Long id) {
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(
                     "SELECT * FROM \"account\" WHERE id IN (?)"
             )){
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return this.fromTransactionResponse(rs);
            } else {
                throw new SQLException("looking for transaction failed, no rows affected.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public TransactionResponseDTO delete(Long id) {
        TransactionResponseDTO deletedTransaction = this.findById(id);
        String deleted = "DELETE FROM \"transaction\" WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(deleted)
        ) {
            stmt.setLong(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                return deletedTransaction;
            } else {
                throw new SQLException("Removing transaction failed, no rows affected.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private void setTransactionParameters(PreparedStatement stmt, TransactionRequestDTO transactionRequestDTO) throws SQLException {
        stmt.setFloat(1, transactionRequestDTO.amount());
        stmt.setString(2, transactionRequestDTO.type());
        stmt.setObject(3, transactionRequestDTO.transactionDate());
    }

    private List<TransactionResponseDTO> fromTransactionList(ResultSet rs) throws SQLException {
        List<TransactionResponseDTO> transactionResponseDTOS = new ArrayList<>();
        while (rs.next()) {
            transactionResponseDTOS.add(this.fromTransactionResponse(rs));
        }
        return transactionResponseDTOS;
    }

    private TransactionResponseDTO fromTransactionResponse(ResultSet rs) throws SQLException {
        return new TransactionResponseDTO(
                rs.getInt("id"),
                rs.getFloat("amount"),
                rs.getString("type"),
                rs.getObject("transaction_date", LocalDateTime.class)
        );
    }
}
