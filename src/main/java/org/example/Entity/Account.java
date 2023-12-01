package org.example.Entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Account {
    private Integer id;
    private Float sold;
    private String accountType;
    private LocalDateTime openDate;
    private Long accountNumber;
    private Devise devise;
    private List<Transaction> transactions;
}
