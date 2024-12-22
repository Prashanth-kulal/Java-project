🏥 Hospital Management System💉💉🛌🏼

📜 Overview

The Hospital Management System is a comprehensive desktop application designed to efficiently manage the day-to-day operations of a hospital. This system provides various modules for managing patient information, employee records, room allocations, and other hospital-related functionalities. It helps hospital staff quickly retrieve and update data, ensuring smooth operations and improved patient care.

This project is built using Java with a MySQL backend for database management. It features a graphical user interface (GUI) using Swing components, providing an easy-to-use platform for hospital administration.

🛠️ Features
1.Login System 🔑

▫️Secure login with username and password to authenticate users.
▫️On successful login, the user gains access to the hospital management modules.

2.Patient Management 🏥

▫️Add new patients with their personal details and medical conditions.
▫️View all patient information, including their room number, disease, and deposit.
▫️Discharge patients and update their room status to available.

3.Employee Management 👨‍⚕️👩‍⚕️

▫️Manage employee details including name, age, phone number, salary, email, and Aadhar number.
▫️View detailed information for all employees working in the hospital.

4.Room Management 🛏️

▫️Display all rooms in the hospital with details like room number, availability, price, and room type.
▫️Update room availability status when a patient is assigned or discharged.

5.Department Management 🏢

▫️Manage hospital departments with information like department name and contact number.

6.Patient Discharge 🚶‍♀️🚶‍♂️

▫️Discharge a patient by selecting their patient ID.
▫️Update room availability to available when a patient is discharged.

📂 Database Structure

The system uses the following tables to store and manage data:
1.EMP_INFO:
▫️Contains information about hospital employees.

CREATE TABLE emp_info (
    Name varchar(50) DEFAULT NULL,
    Age int DEFAULT NULL,
    Phone_Number varchar(15) DEFAULT NULL,
    Salary decimal(10,2) DEFAULT NULL,
    Gmail varchar(100) DEFAULT NULL,
    Aadhar_Number varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

2.Department:

▫️Stores department names and their contact numbers.

CREATE TABLE `department` (
    `Department` varchar(100) DEFAULT NULL,
    `Phone_no` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

3.Login:

▫️Contains login credentials for hospital staff and administrators.

CREATE TABLE `login` (
    `ID` varchar(20) DEFAULT NULL,
    `PW` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

4.Patient_Info:

▫️Stores patient details including ID, name, gender, disease, room number, and deposit.

CREATE TABLE `patient_info` (
    `ID` varchar(20) DEFAULT NULL,
    `Number` varchar(40) DEFAULT NULL,
    `Name` varchar(20) DEFAULT NULL,
    `Gender` varchar(20) DEFAULT NULL,
    `Patient_Disease` varchar(28) DEFAULT NULL,
    `Room_Number` varchar(20) DEFAULT NULL,
    `Time` varchar(100) DEFAULT NULL,
    `Deposite` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

5.Room:

▫️Stores details about hospital rooms including room number, availability, price, and room type.

CREATE TABLE `room` (
    `room_no` varchar(20) DEFAULT NULL,
    `Availability` varchar(20) DEFAULT NULL,
    `Price` varchar(20) DEFAULT NULL,
    `Room_Type` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

💻 Technologies Used

▫️Java: For building the application logic and user interface.
▫️MySQL: For database management and data storage.
▫️Swing: For creating the GUI components of the system.

🛠️ Modules in the System

1.Login: A login page where users (admins or staff) can authenticate using their credentials.
2.Add New Patient: Allows staff to add a new patient to the system, assign them a room, and capture important details.
3.All Employee Info: Displays detailed employee information in a table.
4.Patient Info: Displays all patient information including their disease, room, and deposit status.
5.Patient Discharge: Enables the discharge of patients and room status updates.
6.Room Availability: Displays room availability status, allowing staff to check room occupancy.
7.Update Patient Info: Allows updates to patient information (such as room number, payment details).

🛠️ Setup and Installation

1.Install MySQL: Ensure MySQL server is installed and running.

2.Create Database: Create a database in MySQL using:
CREATE DATABASE hospital_management_system;

3.Execute SQL Scripts: Run the provided SQL scripts to create necessary tables in the database.

4.Configure Database Connection: Set up the conn.java file with your database credentials (username, password, database name).

5.Run the Java Application: Run the main Java application to start the hospital management system.

