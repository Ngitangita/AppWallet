package com.app.wellet.DTO.request;

import java.util.Objects;

public class DeviseRequestDTO {
    private final Float rateChange;
    private final String deviseSymbol;

    public DeviseRequestDTO(Float rateChange, String deviseSymbol) {
        this.rateChange = rateChange;
        this.deviseSymbol = deviseSymbol;
    }

    public Float getRateChange() {
        return rateChange;
    }

    public String getDeviseSymbol() {
        return deviseSymbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviseRequestDTO that = (DeviseRequestDTO) o;
        return Objects.equals(rateChange, that.rateChange) && Objects.equals(deviseSymbol, that.deviseSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rateChange, deviseSymbol);
    }

    @Override
    public String toString() {
        return "DeviseRequestDTO{" +
                "rateChange=" + rateChange +
                ", deviseSymbol='" + deviseSymbol + '\'' +
                '}';
    }
}
