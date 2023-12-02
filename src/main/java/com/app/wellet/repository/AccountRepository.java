package com.app.wellet.repository;

import com.app.wellet.DTO.request.AccountRequestDTO;
import com.app.wellet.DTO.response.AccountResponseDTO;
import com.app.wellet.config.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository implements RepositoryCrudOperations<
        AccountResponseDTO, AccountRequestDTO, Long
>{
    @Override
        public List<AccountResponseDTO> findAll() {
            List<AccountResponseDTO> accountResponseDTOS = new ArrayList<>();
            Connection con = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM \"account\"";
            try (Connection connection = con;
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    float sold = resultSet.getFloat("sold");
                    String accountType = resultSet.getString("account_type");
                    LocalDateTime openDate = resultSet.getObject("open_date", LocalDateTime.class);
                    AccountResponseDTO account = new AccountResponseDTO(id, sold, accountType, openDate);
                    accountResponseDTOS.add(account);
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            return accountResponseDTOS;
        }

    @Override
    public List<AccountResponseDTO> saveAll(List<AccountRequestDTO> toSave) {
        return null;
    }

    @Override
    public List<AccountResponseDTO> updateAll(List<AccountResponseDTO> toUpdate) {
        return null;
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
}
