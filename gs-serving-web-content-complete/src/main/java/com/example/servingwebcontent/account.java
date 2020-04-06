package com.example.servingwebcontent;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class account {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer account_id;
    private String user_id;
    private Integer balance;
    private Integer owed;

	public Integer getaccount_id() { return account_id; }
	public void setaccount_id(Integer account_id) { this.account_id = account_id; }
	
	public String getuser_id() { return user_id; }
	public void setuser_id(String user_id) { this.user_id = user_id; }

	public Integer getbalance() { return balance; }
	public void setbalance(Integer balance) { this.balance = balance; }
	
	public Integer getowed() { return owed; }
	public void setowed(Integer owed) { this.owed = owed; }
	//Getter/Setters for rest of fields, etc...
}
