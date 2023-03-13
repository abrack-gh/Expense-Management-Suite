package com.abrackgh.ExpenseManagementSuite.Model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tbl_expenses")
@Setter
@Getter
@ToString
public class Expense {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="description")
    private String expenseName;

    private BigDecimal amount;

    private String note;

    @Column(name="created_at")
    private Long createdAt;

}
