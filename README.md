# Student-Management-System
Student Management App
Welcome to the Student Management App! This Java application allows you to perform various operations related to managing student information. You can add, delete, display, and update student records using this app. It utilizes a MySQL database to store and retrieve student data.

Prerequisites==================================================================================
Before running the application, make sure you have the following software installed on your system:

Java Development Kit (JDK)
MySQL Server

Setup==========================================================================================
Clone the repository or download the project files.
Import the project into your preferred Java IDE.
Make sure to include the necessary external libraries, such as the JDBC driver for MySQL. You can download the driver from the MySQL website.
Configure the database connection settings in the CP.java file located in the com.student.manage package. Modify the url, user, and password variables to match your MySQL database configuration.

Usage==========================================================================================
Run the Start.java file to start the application.
The application will display a menu with several options:
Press 1 to add a student: Enter the student's name, phone number, and city to add them to the database.
Press 2 to delete a student: Enter the student ID to remove them from the database.
Press 3 to display all students: View a list of all students and their details.
Press 4 to update a student: Enter the student ID and update their name, phone number, and city.
Press 5 to exit the application.

Database Schema=================================================================================
The application uses a MySQL database named student_manage. The database contains a single table named students with the following columns:

s_id (INT): Student ID (primary key)
s_name (VARCHAR): Student name
s_phone (VARCHAR): Student phone number
s_city (VARCHAR): Student city
