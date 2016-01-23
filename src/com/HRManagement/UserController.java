package com.HRManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserController {
	
	protected Connection conn;
	
	public UserController(){
		conn = MySQL.connectDB();
	}

	public String getPermission(String username){
		String division = "";
		
		String query = "Select * from users where username = '"+username+"'";
		ResultSet rs = MySQL.executeQuery(query, conn);
		try {
			if (!rs.next() ) {
			    //System.out.println("no data");
			} else {

			    do {
			    	division = rs.getString(3); //get division
			    } while (rs.next());
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(division.matches("Proistamenos")){
			return "Proistamenos";
		}else if(division.matches("HR")){
			return "HR";
		}
		return "";
	}
	
	public boolean checkUser(String username,String password){

		String verifiedPassword = "";
		
		String query = "Select * from users where username = '"+username+"'";
		ResultSet rs = MySQL.executeQuery(query, conn);
		
		try {
			
			if (!rs.next() ) {
			    //System.out.println("no data");
			} else {

			    do {
			    	verifiedPassword = rs.getString(2);
			    } while (rs.next());
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if(verifiedPassword.matches(password)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
}
