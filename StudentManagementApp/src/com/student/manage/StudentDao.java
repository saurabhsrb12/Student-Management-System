package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st)
	{
		boolean f =false;
		
		try {
			//jdbc code
			Connection con=CP.createC();
			String q="insert into students(s_name,s_phone,s_city) values(?,?,?)";
			
			//prepared Statement
			PreparedStatement pstmt= con.prepareStatement(q);
			
			// set the value of parameters 
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			//execute..
			
			pstmt.executeUpdate();
			f=true;
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return f;
	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		boolean f =false;		
		try {
			//jdbc code
			Connection con=CP.createC();
			String q="delete from students where s_id=?";
	
			//prepared Statement
			PreparedStatement pstmt= con.prepareStatement(q);
			
			// set the value of parameters 
			pstmt.setInt(1, userId );
			
			//execute..			
			pstmt.executeUpdate();
			f=true;
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return f;			
	}

	public static void showAllStudents() {
		// TODO Auto-generated method stub
		
		try {
			//jdbc code
			Connection con=CP.createC();
			String q="select * from students";	
			
			Statement stmt= con.createStatement();

			stmt.executeQuery(q);
		
			ResultSet set= stmt.executeQuery(q);
			
			while(set.next()) 
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString("s_city");
				
				System.out.println("ID :"+id);
				System.out.println("NAME :"+name);
				System.out.println("PHONE :"+phone);
				System.out.println("CITY :"+city);
				
				System.out.println("+++++++++++++++++++++++=====================");
				
				
			}
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
			
		
	}
}
