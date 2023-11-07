package main;

import java.util.ArrayList;
import java.util.List;

import dao.CustomerDAO;
import dao.DepositDAO;
import dao.loanDAO;
import entities.Customer;
import entities.Deposit;
import entities.loan;

public class Test {

	public Test() {
		CustomerDAO cDAO = new CustomerDAO();
		DepositDAO dDAO = new DepositDAO();
		loanDAO lDAO = new loanDAO();

		List<Deposit>Deposits = new ArrayList<Deposit>();
		Deposit d1 = new Deposit("1/03/2023", 100);
		Deposit d2 = new Deposit("2/03/2013", 300);
		Deposit d3 = new Deposit("2/05/2053", 106);
		
		dDAO.persist(d1);
		dDAO.persist(d2);
		dDAO.persist(d3);
		
		Deposits.add(d1);
		Deposits.add(d2);
		Deposits.add(d3);
		
		
		

	

		
		
		loan loan1 = new loan("123","once off", Deposits);
		lDAO.persist(loan1);
		List<loan>lists = new ArrayList<loan>();
		lists.add(loan1);

		// Add customer
		Customer customer = new Customer("Victor", "Chapel Walk", "12345", 0.1, lists);
		cDAO.persist(customer);

		// View all subscribers
		ArrayList<Customer> customers = (ArrayList<Customer>) cDAO.getAllCustomers();
		for (Customer c : customers) {

			System.out.println("Customer name is " + c.getName());

		}

	}

	public static void main(String[] args) {
		new Test();
	}

}
