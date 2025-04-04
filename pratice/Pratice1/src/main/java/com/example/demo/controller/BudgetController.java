package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BudgetModel;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/budget")
public class BudgetController {
	
	List<BudgetModel> budgetList = new ArrayList<>();
	
	
	
	
    @GetMapping("/all")
	public List<BudgetModel> getAllBudget(){
		
		return budgetList;
	}
    
    @PostMapping("/add")
    public BudgetModel addBudget(@RequestBody  BudgetModel budget) {
    	budgetList.add(budget);
    	return budget;
    	
    }
    
    @PutMapping("update/{id}")
    public BudgetModel updateBudget(@PathVariable ("id") int id, @RequestParam double amount,@RequestParam String month  ) {
    	BudgetModel bud=null;
    	for(BudgetModel budget: budgetList) {
    		if(id == budget.getUserId()) {
    			budget.setAmount(amount);
    			budget.setMonth(month);
    			budget=bud;
    	
    		}
    	}
    	return bud;
    }

}
