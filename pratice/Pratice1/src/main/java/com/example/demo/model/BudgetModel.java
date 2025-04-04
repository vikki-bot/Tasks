package com.example.demo.model;

public class BudgetModel {
	int userId;
	String category;
	double amount;
	String	month;
	
	
	
	public BudgetModel(int userId, String category, double amount, String month) {
		super();
		this.userId = userId;
		this.category = category;
		this.amount = amount;
		this.month = month;
	}
	//getter and setter
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return "BudgetModel [userId=" + userId + ", category=" + category + ", amount=" + amount + ", month=" + month
				+ "]";
	}
	
	
	
	
	
	

}
