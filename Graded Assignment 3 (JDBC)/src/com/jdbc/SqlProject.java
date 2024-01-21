package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SqlProject {
	
	public static void main(String []args) {
		try {
		String url="jdbc:mysql://localhost:3306/GL";
		String username="root";
		String password="4121992";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection(url,username,password);
		System.out.println("connection established");
		
		String query = "create table employee(id int primary key,name varchar(50),Email_id varchar(50),phone_number varchar(20))";
		
		String query1 = "insert into employee(id,name,email_id,phone_number) values(1,'kavi','kavi2002','2579145254'),"
				
				+ "(2,'laksh','laksh2001','3497518624'),(3,'priya','priya2681','9547861243'),(4,'moni','moni2013','6457812895')"
				
				+ ",(5,'ashu','ashu1922','6845217947')";
		
		String query2 = "alter table employee modify column email_id varchar(30) not null";
		
		String query3 = "insert into employee values(6,'kousi','kousi2002','7954552452'),(7,'gayatri','gayatri524','5478951535')";
		
		String query4 = "update employee SET Name = 'Karthik', Phone_Number = '1234567890'" + "WHERE Id = 3;"; 
		
		String query5 = "delete from employee where id in(3,4)";
		
		String query6 = "delete from employee";
		
		Statement st=connect.createStatement();
		
		st.execute(query);
		st.execute(query1);
		st.execute(query2);
		st.execute(query3);
		st.execute(query4);
		st.execute(query5);
		st.execute(query6);
		
		st.close();
		connect.close();
		}
		catch(Exception e) {
		e.printStackTrace();
		}
	}

}
