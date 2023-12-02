package com.app.wellet.service;

import com.app.wellet.DTO.request.DeviseRequestDTO;
import com.app.wellet.DTO.response.DeviseResponseDTO;

import java.util.List;

public class DeviseService implements ServiceCrudOperations<
        DeviseResponseDTO, DeviseRequestDTO, Long
>{
    @Override
    public List<DeviseResponseDTO> findAll() {
        return null;
    }

    @Override
    public List<DeviseResponseDTO> saveAll(List<DeviseRequestDTO> toSave) {
        return null;
    }

    @Override
    public List<DeviseResponseDTO> updateAll(List<DeviseResponseDTO> toUpdate) {
        return null;
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
}
