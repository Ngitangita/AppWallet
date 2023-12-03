package com.app.wellet.service;

import com.app.wellet.DTO.request.DeviseRequestDTO;
import com.app.wellet.DTO.response.DeviseResponseDTO;
import com.app.wellet.repository.DeviseRepository;

import java.util.List;

public class DeviseService implements ServiceCrudOperations<
        DeviseResponseDTO, DeviseRequestDTO, Long
>{
    private final DeviseRepository deviseRepository;

    public DeviseService(DeviseRepository deviseRepository) {
        this.deviseRepository = deviseRepository;
    }

    @Override
    public List<DeviseResponseDTO> findAll() {
        return this.deviseRepository.findAll();
    }

    @Override
    public List<DeviseResponseDTO> saveAll(List<DeviseRequestDTO> toSave) {
        return this.deviseRepository.saveAll(toSave);
    }

    @Override
    public List<DeviseResponseDTO> updateAll(List<DeviseResponseDTO> toUpdate) {
        return this.deviseRepository.updateAll(toUpdate);
    }

    @Override
    public DeviseResponseDTO saveByEntity(DeviseRequestDTO toSave) {
        return this.deviseRepository.saveByEntity(toSave);
    }

    @Override
    public DeviseResponseDTO deleteByEntity(DeviseResponseDTO toDelete) {
        return this.deviseRepository.deleteByEntity(toDelete);
    }

    @Override
    public DeviseResponseDTO findById(Long id) {
        return this.deviseRepository.findById(id);
    }

    @Override
    public DeviseResponseDTO delete(Long id) {
        return this.deviseRepository.delete(id);
    }
}
