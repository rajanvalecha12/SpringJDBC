package com.training.entity;

import org.springframework.stereotype.Component;

@Component("invoice")
public class Invoice {
 private int invoiceNumber;
 private String cusomerName;
 private double amount;
public int getInvoiceNumber() {
	return invoiceNumber;
}
public void setInvoiceNumber(int invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
}
public String getCusomerName() {
	return cusomerName;
}
public void setCusomerName(String cusomerName) {
	this.cusomerName = cusomerName;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public Invoice(int invoiceNumber, String cusomerName, double amount) {
	super();
	this.invoiceNumber = invoiceNumber;
	this.cusomerName = cusomerName;
	this.amount = amount;
}
public Invoice() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Invoice [invoiceNumber=" + invoiceNumber + ", cusomerName=" + cusomerName + ", amount=" + amount + "]";
}
 
}
