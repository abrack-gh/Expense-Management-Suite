package com.abrackgh.ExpenseManagementSuite.Controllers;

import com.abrackgh.ExpenseManagementSuite.Model.Expense;
import com.abrackgh.ExpenseManagementSuite.Service.ExpenseService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Getter
@Setter
public class MasterController {

    @Autowired
    ExpenseService expenseService;

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "list of expenses");
        List<Expense> expenses = expenseService.findAll();
        mav.addObject("expense", expenses);
        return mav;
    }


}
