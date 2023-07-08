import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Our Student Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO EXIT APP");
			
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				//ADD STUDENT
				System.out.println("ENTER USER NAME :");
				String name=br.readLine();
				
				System.out.println("ENTER USER PHONE :");
				String phone=br.readLine();
				
				System.out.println("ENTER USER CITY :");
				String city=br.readLine();
				
				//create student object to store student
				
				Student st=new Student(name,phone,city);
				
				boolean answer=StudentDao.insertStudentToDB(st);
				if (answer ) {
					System.out.print("STUDENT IS SUCCESFULLY ADDED");
				}
				else {
					System.out.print("SOMETHING WENT WRONG.......TRY AGAIN");	
				}
				
				System.out.println();
				System.out.print(st);
				System.out.println();
				
			}
			else if(c==2) 
			{
				//DELETE STUDENT
				
				System.out.println("ENTER STUDENT ID TO DELETE");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				
				if (f) {
					System.out.print("STUDENT IS SUCCESFULLY DELETE BY USING ID");
				}
				else {
					System.out.print("SOMETHING WENT WRONG.......TRY AGAIN");	
				}
				
				System.out.println();
			}
			else if(c==3) 
			{
				//DISPLAY STUDENT
				StudentDao.showAllStudents();
				
				
				
			}
			else if(c==4) 
			{
				//EXIT
				break;
			}
			else 
			{
				System.out.print("ENTER VALID INPUT");
			}
			
			
		}
		System.out.print("THANK YOU FOR USING APP");
		
		
		
	}

}
