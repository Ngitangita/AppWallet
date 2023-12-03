package com.app.wellet.controller;

import com.app.wellet.DTO.request.DeviseRequestDTO;
import com.app.wellet.DTO.response.DeviseResponseDTO;
import com.app.wellet.service.DeviseService;

import java.util.List;

public class DeviseController {
    private final DeviseService deviseService;

    public DeviseController(DeviseService deviseService) {
        this.deviseService = deviseService;
    }


    public List<DeviseResponseDTO> getDevises() {
        return this.deviseService.findAll();
    }

    public List<DeviseResponseDTO> saveDevises(List<DeviseRequestDTO> toSave) {
        return this.deviseService.saveAll(toSave);
    }

    public List<DeviseResponseDTO> updateDevise(List<DeviseResponseDTO> toUpdate) {
        return this.deviseService.updateAll(toUpdate);
    }

    public DeviseResponseDTO saveDevise(DeviseRequestDTO toSave) {
        return this.deviseService.saveByEntity(toSave);
    }

    public DeviseResponseDTO deleteDevise(DeviseResponseDTO toDelete) {
        return this.deviseService.deleteByEntity ( toDelete );
    }

    public DeviseResponseDTO getDevise(Long id) {
        return this.deviseService.findById(id);
    }

    public DeviseResponseDTO deleteDevise(Long id) {
        return this.deviseService.delete(id);
    }

}
