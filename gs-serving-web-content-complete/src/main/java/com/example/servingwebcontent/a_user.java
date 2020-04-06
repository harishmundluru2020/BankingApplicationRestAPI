package com.example.servingwebcontent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class a_user {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private static Integer user_id;
    private String user_name;
    private String pass_word;
    private Integer num_of_accts;
    
	public static Integer getuser_id() { return user_id; }
	public void setuser_id(Integer user_id) { this.user_id = user_id; }
	
	public String getuser_name() { return user_name; }
	public void setuser_name(String user_name) { this.user_name = user_name; }
	
	public String getpass_word() { return pass_word; }
	public void setpass_word(String pass_word) { this.pass_word = pass_word; }

	public Integer getnum_of_accts() { return num_of_accts; }
	public void setnum_of_accts(Integer num_of_accts) { this.num_of_accts = num_of_accts; }
    
}
