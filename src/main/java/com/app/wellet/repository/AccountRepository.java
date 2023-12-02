package com.app.wellet.repository;

import com.app.wellet.DTO.request.AccountRequestDTO;
import com.app.wellet.DTO.response.AccountResponseDTO;
import com.app.wellet.config.DatabaseConnection;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository implements RepositoryCrudOperations<
        AccountResponseDTO, AccountRequestDTO, Long
>{
    @Override
    public List<AccountResponseDTO> findAll() {
        String sql = "SELECT id, sold, account_type, open_date, account_number FROM \"account\"";
        try (Connection con = DatabaseConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)
        ) {
            return this.fromAccountList(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<AccountResponseDTO> saveAll(List<AccountRequestDTO> toSave) {
        String sql = "INSERT INTO \"account\" (sold, account_type, open_date, account_number) VALUES (?, ?, ?, ?) RETURNING *";
        List<AccountResponseDTO> savedAccounts = new ArrayList<>();
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)
        ) {
            for (AccountRequestDTO accountRequestDTO : toSave) {
                this.setAccountParameters(stmt, accountRequestDTO);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    savedAccounts.add(this.fromAccountResponse(rs));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return savedAccounts;
    }



    @Override
    public List<AccountResponseDTO> updateAll(List<AccountResponseDTO> toUpdate) {
        List<AccountResponseDTO> updatedAccounts = new ArrayList<>();

        String sql = "UPDATE \"account\" SET sold = ?, account_type = ?, open_date = ?, account_number = ? WHERE id = ?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)
        ) {
            for (AccountResponseDTO updatedAccount : toUpdate) {
                stmt.setFloat(1, updatedAccount.sold());
                stmt.setString(2, updatedAccount.accountType());
                stmt.setObject(3, updatedAccount.openDate());
                stmt.setLong(4, updatedAccount.accountNumber());
                stmt.setInt(5, updatedAccount.id());
                int affectedRows = stmt.executeUpdate();
                if (affectedRows > 0) {
                    updatedAccounts.add(updatedAccount);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return updatedAccounts;
    }

    @Override
    public AccountResponseDTO saveByEntity(AccountRequestDTO toSave) {
        return null;
    }

    @Override
    public AccountResponseDTO deleteByEntity(AccountRequestDTO toDelete) {
        return null;
    }

    @Override
    public AccountResponseDTO findByEntity(AccountRequestDTO toFind) {
        return null;
    }

    @Override
    public AccountResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public AccountResponseDTO delete(Long id) {
        return null;
    }


    private void setAccountParameters(PreparedStatement stmt, AccountRequestDTO accountRequestDTO) throws SQLException {
        stmt.setFloat(1, accountRequestDTO.sold());
        stmt.setString(2, accountRequestDTO.accountType());
        stmt.setObject(3, accountRequestDTO.openDate());
        stmt.setLong(4, accountRequestDTO.accountNumber());
    }

    private List<AccountResponseDTO> fromAccountList(ResultSet rs) throws SQLException {
        List<AccountResponseDTO> accountResponseDTOS = new ArrayList<>();
        while (rs.next()) {
            accountResponseDTOS.add(this.fromAccountResponse(rs));
        }
        return accountResponseDTOS;
    }

    private AccountResponseDTO fromAccountResponse(ResultSet rs) throws SQLException {
        return new AccountResponseDTO(
                rs.getInt("id"),
                rs.getFloat("sold"),
                rs.getString("account_type"),
                rs.getObject("open_date", LocalDateTime.class),
                rs.getLong("account_number")
        );
    }
}
