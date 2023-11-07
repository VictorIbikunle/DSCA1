package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class loan {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String description;
	
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Deposit> deposits = new ArrayList<Deposit>();
	public loan(String id, String description, List<Deposit>deposits) {
		this.id = id;
		this.description = description;
		this.deposits = deposits;
	}

	
	

	


	public List<Deposit> getDeposits() {
		return deposits;
	}







	public void setDeposits(List<Deposit> deposits) {
		this.deposits = deposits;
	}







	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
