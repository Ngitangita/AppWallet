package com.app.wellet.DTO.request;

import java.time.LocalDateTime;
import java.util.Objects;

public class AccountRequestDTO {
    private final Float sold;
    private  final String accountType;
    private final LocalDateTime openDate;

    public AccountRequestDTO(Float sold, String accountType, LocalDateTime openDate) {
        this.sold = sold;
        this.accountType = accountType;
        this.openDate = openDate;
    }

    public Float getSold() {
        return sold;
    }

    public String getAccountType() {
        return accountType;
    }

    public LocalDateTime getOpenDate() {
        return openDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountRequestDTO that = (AccountRequestDTO) o;
        return Objects.equals(sold, that.sold) && Objects.equals(accountType, that.accountType) && Objects.equals(openDate, that.openDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sold, accountType, openDate);
    }

    @Override
    public String toString() {
        return "AccountRequestDTO{" +
                "sold=" + sold +
                ", accountType='" + accountType + '\'' +
                ", openDate=" + openDate +
                '}';
    }
}
