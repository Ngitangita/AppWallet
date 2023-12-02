package com.app.wellet.repository;

import com.app.wellet.DTO.request.DeviseRequestDTO;
import com.app.wellet.DTO.response.DeviseResponseDTO;


import java.util.List;

public class DeviseRepository implements RepositoryCrudOperations<
        DeviseResponseDTO, DeviseRequestDTO, Long
> {

    @Override
    public List<DeviseResponseDTO> findAll() {
        return null;
    }

    @Override
    public List<DeviseResponseDTO> saveAll(List<DeviseRequestDTO> toSave) {
        return null;
    }

    @Override
    public List<DeviseResponseDTO> updateAll(List<DeviseRequestDTO> toUpdate) {
        return null;
    }

    @Override
    public DeviseResponseDTO saveByEntity(DeviseRequestDTO toSave) {
        return null;
    }

    @Override
    public DeviseResponseDTO deleteByEntity(DeviseRequestDTO toDelete) {
        return null;
    }

    @Override
    public DeviseResponseDTO updateByEntity(DeviseRequestDTO toUpdate) {
        return null;
    }

    @Override
    public DeviseResponseDTO findByEntity(DeviseRequestDTO toFind) {
        return null;
    }

    @Override
    public DeviseResponseDTO update(Long id) {
        return null;
    }

    @Override
    public DeviseResponseDTO delete(Long id) {
        return null;
    }

    @Override
    public DeviseResponseDTO findById(Long id) {
        return null;
    }
}
