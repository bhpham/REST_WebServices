package net.mv.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="STOCK_PERSON")
public class Person {
	@Id
	@Column(name="P_ID")
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment") 
	private int p_id;
	@Column
	private String p_name;
	@Column
	private float balance;
	
	private String operation;
	
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public Person(){}
	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", p_name=" + p_name + ", balance="
				+ balance + ", operation=" + operation + "]";
	}
	public Person(String p_name, float balance, String operation) {
		super();
		this.p_name = p_name;
		this.balance = balance;
		this.operation = operation;
	}
	
	
	
	
}
