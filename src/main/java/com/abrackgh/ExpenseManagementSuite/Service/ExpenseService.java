package com.abrackgh.ExpenseManagementSuite.Service;

import com.abrackgh.ExpenseManagementSuite.Model.Expense;
import com.abrackgh.ExpenseManagementSuite.Repository.ExpenseRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ExpenseService {

    List<Expense> findAll();
}
