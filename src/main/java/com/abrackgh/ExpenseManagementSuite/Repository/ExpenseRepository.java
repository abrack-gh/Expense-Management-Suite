package com.abrackgh.ExpenseManagementSuite.Repository;

import com.abrackgh.ExpenseManagementSuite.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {



}
