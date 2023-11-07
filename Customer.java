package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	private String name;
	private String address;
	private String number;
	private double salary;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	private List<loan> Loans = new ArrayList<loan>();
	
	
	
	
	public List<loan> getLoans() {
		return Loans;
	}

	public void setLoans(List<loan> loans) {
		Loans = loans;
	}

	public Customer() {
	}
	
	public Customer(String name, String address, String number, double salary, List<loan>Loans) {
		
		this.name = name;
		this.address = address;
		this.number = number;
		this.salary = salary;
		this.Loans = Loans;
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
