package com.training.apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Invoice;
import com.training.daos.*;
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= new ClassPathXmlApplicationContext("bean.xml");
		InvoiceDaoImpl obj=ctx.getBean("dao",InvoiceDaoImpl.class);
Invoice inv = ctx.getBean("invoice",Invoice.class);
		
		inv.setInvoiceNumber(104);
		inv.setCusomerName("Suresh");
		inv.setAmount(4500.00);
		
		//boolean result = obj.add(inv);
		
		//System.out.println("Row added: " + result); 
		Invoice inv2=obj.find(101);
		System.out.println(inv2);
		List<Invoice> inv3=obj.findAll();
		System.out.println(inv3);
		ctx.close();
	}

}
