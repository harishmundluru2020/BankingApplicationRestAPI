package com.example.servingwebcontent;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class transaction {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer transaction_id;
    private Integer account_id;
    private Integer amount;
    private Boolean done;

	public Integer gettransaction_id() { return transaction_id; }
	public void settransaction_id(Integer transaction_id) { this.transaction_id = transaction_id; }
	
	public Integer getaccount_id() { return account_id; }
	public void setaccount_id(Integer account_id) { this.account_id = account_id; }

	public Integer getamount() { return amount; }
	public void setbalance(Integer amount) { this.amount = amount; }
	
	public Boolean getdone() { return done; }
	public void setdone(Boolean done) { this.done = done; }
}
