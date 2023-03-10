package com.abrackgh.ExpenseManagementSuite.Service;

import com.abrackgh.ExpenseManagementSuite.Model.Expense;
import com.abrackgh.ExpenseManagementSuite.Repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;


    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }
}
