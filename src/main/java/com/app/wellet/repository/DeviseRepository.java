package com.app.wellet.repository;

import com.app.wellet.DTO.request.DeviseRequestDTO;
import com.app.wellet.DTO.response.DeviseResponseDTO;
import com.app.wellet.config.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeviseRepository implements RepositoryCrudOperations<DeviseResponseDTO, DeviseRequestDTO, Long>{
    @Override
    public List<DeviseResponseDTO> findAll() {
        String sql = "SELECT id, rate_change, devise_symbol FROM \"devise\"";
        try (Connection con = DatabaseConnection.getConnection ();
             Statement stmt = con.createStatement ();
             ResultSet rs = stmt.executeQuery ( sql)
        ){
            return this.fromDeviseList (rs);
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
    }

    @Override
    public List<DeviseResponseDTO> saveAll(List<DeviseRequestDTO> toSave) {
        String sql = "INSERT INTO \"devise\"(rateChange, deviseSymbol) VALUES (?, ?)";
        List<DeviseResponseDTO> savedDevises = new ArrayList<> ();
        try (Connection connection = DatabaseConnection.getConnection ();
             PreparedStatement stmt = connection.prepareStatement ( sql)
        ){
            for (DeviseRequestDTO deviseResponseDTO : toSave){
                this.SetDeviseParameters(stmt, deviseResponseDTO);
                ResultSet resultSet = stmt.executeQuery ( );
                if (resultSet.next ()){
                    savedDevises.add ( this.fromDeviseResponse ( resultSet ) );
                }
            }
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
        return savedDevises;
    }

    @Override
    public List<DeviseResponseDTO> updateAll(List<DeviseResponseDTO> toUpdate) {
        List<DeviseResponseDTO> updatedDevises = new ArrayList<> ();
        String sql = "UPDATE \"devise\" SET rateChange = ?, deviseSymbol = ? WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection ();
            PreparedStatement statement = connection.prepareStatement ( sql)
        ){
            for (DeviseResponseDTO updatedDevise : toUpdate){
                statement.setFloat ( 1, updatedDevise.rateChange () );
                statement.setString ( 2, updatedDevise.deviseSymbol () );
                int affectedRows = statement.executeUpdate ();
                if (affectedRows > 0){
                    updatedDevises.add ( updatedDevise );
                }
            }
        } catch ( SQLException e ) {
            throw new RuntimeException ( e );
        }
        return updatedDevises;
    }

    @Override
    public DeviseResponseDTO saveByEntity(DeviseRequestDTO toSave) {
        return null;
    }

    @Override
    public DeviseResponseDTO deleteByEntity(DeviseResponseDTO toDelete) {
        return null;
    }

    @Override
    public DeviseResponseDTO findByEntity(DeviseResponseDTO toFind) {
        return null;
    }

    @Override
    public DeviseResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public DeviseResponseDTO delete(Long id) {
        return null;
    }

    private void SetDeviseParameters(PreparedStatement stmt, DeviseRequestDTO deviseRequestDTO) throws SQLException{
        stmt.setFloat ( 1, deviseRequestDTO.rateChange () );
        stmt.setString ( 2, deviseRequestDTO.deviseSymbol () );
    }

    private List<DeviseResponseDTO> fromDeviseList(ResultSet rs) throws SQLException{
        List<DeviseResponseDTO> deviseResponseDTOS =new ArrayList<> ();
        while (rs.next ()){
            deviseResponseDTOS.add ( this.fromDeviseResponse ( rs ) );
        }
        return deviseResponseDTOS;
    }

    private DeviseResponseDTO fromDeviseResponse(ResultSet rs) throws SQLException{
        return new DeviseResponseDTO (
                rs.getInt ( "id"),
                rs.getFloat ( "rateChange" ),
                rs.getString ( "deviseSymbol" )
        );
    }
}
