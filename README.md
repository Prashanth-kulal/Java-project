# 💉🏥 **Hospital Management System** 💻📊

Welcome to the **Hospital Management System**, an innovative Java-based application designed to streamline hospital operations, including patient management, employee records, room tracking, and more. This system leverages Java Swing for the user interface and MySQL for robust data management.

---

## 🎯 **Features**
- User-friendly interface for hospital staff and administrators.  
- Manage patients, employees, rooms, and departments with ease.  
- Effortless addition, update, and discharge of patients.  
- Dynamic database integration for real-time data updates.  
- Secure login system for authorized access.  

---

## 🖥 **Software Requirements**
- **Java Version**: Java 8 or above  
- **Database**: MySQL  
- **Libraries**: JDBC for database connectivity  
- **IDE**: IntelliJ IDEA, Eclipse, or NetBeans  

---

## 📂 **Project Structure**
The project consists of the following classes:  

### 🛠 **Classes and Interfaces**

#### **1️⃣ Login.java**  
- **Attributes**:  
  - `String username`  
  - `String password`  

- **Methods**:  
  - `validateCredentials()`: Authenticates user credentials against the database.  
  - `openReception()`: Opens the main navigation menu after successful login.  

---

#### **2️⃣ Reception.java**  
- **Attributes**:  
  - `JButton[] buttons`: Buttons for accessing various system functionalities.  
  - `JPanel panel`: Panel to organize the layout of the buttons.  

- **Methods**:  
  - `openNewPatientForm()`: Navigates to the Add New Patient window.  
  - `viewRoomDetails()`: Opens the Room Information window.  
  - `logout()`: Logs the user out and returns to the Login screen.  

---

#### **3️⃣ NEW_PATIENT.java**  
- **Attributes**:  
  - `String patientID`  
  - `String name`  
  - `String gender`  
  - `String disease`  
  - `String roomNumber`  
  - `Timestamp checkInTime`  
  - `double deposit`  

- **Methods**:  
  - `addPatient()`: Inserts new patient details into the database.  
  - `populateRoomChoices()`: Fetches and displays available rooms.  

---

#### **4️⃣ Room.java**  
- **Attributes**:  
  - `String roomNumber`  
  - `String availability`  
  - `double price`  
  - `String bedType`  

- **Methods**:  
  - `fetchRoomDetails()`: Retrieves room data from the database.  
  - `updateRoomStatus()`: Updates the availability of rooms in the database.  

---

#### **5️⃣ ALL_Patient_Info.java**  
- **Attributes**:  
  - `Object[][] patientData`: Data array for storing patient details.  
  - `JTable patientTable`: Table to display patient data.  

- **Methods**:  
  - `fetchPatientData()`: Retrieves patient information from the database and displays it.  

---

#### **6️⃣ patient_discharge.java**  
- **Attributes**:  
  - `String patientID`  
  - `String roomNumber`  
  - `Timestamp checkInTime`  
  - `Timestamp dischargeTime`  

- **Methods**:  
  - `dischargePatient()`: Removes patient records and updates room availability.  
  - `fetchPatientDetails()`: Retrieves patient information based on the selected ID.  

---

#### **7️⃣ SearchRoom.java**  
- **Attributes**:  
  - `String availabilityCriteria`: Filter for Available or Occupied rooms.  
  - `JTable roomTable`: Table to display room information.  

- **Methods**:  
  - `filterRooms()`: Filters and displays rooms based on availability.  

---

#### **8️⃣ Employee_info.java**  
- **Attributes**:  
  - `String employeeName`  
  - `String contactNumber`  
  - `String email`  
  - `double salary`  

- **Methods**:  
  - `fetchEmployeeInfo()`: Retrieves employee data from the database.  

---

#### **9️⃣ Department.java**  
- **Attributes**:  
  - `String departmentName`  
  - `String contactNumber`  

- **Methods**:  
  - `fetchDepartmentDetails()`: Retrieves and displays department details.  

---

## **📽️🎥project demo video**:
[Watch my YouTube video](https://www.youtube.com/watch?v=JA1ud343osc)


## **Contributors**:
- [Prakhyath Nayak](https://github.com/PrakhyathNayak/Project-java)
- [Prithesh R shetty](https://github.com/Prithesh-R-Shetty/Java.git)
- [Poorvik acharya](https://github.com/Poorvik-acharya/java1)
- [Prashanth kulal](https://github.com/Prashanth-kulal)

---

## 🗂 **Database Structure**
The **Hospital Management System** uses the following tables:  
 
```sql
1️⃣ Patient_Info 
CREATE TABLE Patient_Info (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    gender VARCHAR(10),
    disease VARCHAR(100),
    room_number VARCHAR(10),
    check_in_time TIMESTAMP,
    deposit DOUBLE
);



2️⃣Room
CREATE TABLE room (
    room_number VARCHAR(10) PRIMARY KEY,
    availability VARCHAR(10) NOT NULL,
    price DOUBLE NOT NULL,
    bed_type VARCHAR(20) NOT NULL
);



3️⃣Emp_info
CREATE TABLE emp_info (
    name VARCHAR(100),
    age INT,
    phone_number VARCHAR(15),
    salary DOUBLE,
    gmail VARCHAR(100),
    aadhar_number VARCHAR(20)
);



4️⃣Departement
CREATE TABLE department (
    department VARCHAR(100),
    phone_number VARCHAR(15)
);



5️⃣Login
CREATE TABLE login (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50) NOT NULL
);



6️⃣Ambulance
CREATE TABLE ambulance (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ambulance_no VARCHAR(15) NOT NULL,
    driver_name VARCHAR(100),
    phone_number VARCHAR(15),
    availability VARCHAR(15)
);



7️⃣Patient_discharge
CREATE TABLE patient_discharge (
    patient_id INT PRIMARY KEY,
    discharge_time TIMESTAMP,
    room_number VARCHAR(10),
    amount_paid DOUBLE
);



8️⃣Room_search
CREATE TABLE room_search (
    room_number VARCHAR(10),
    availability VARCHAR(10),
    price DOUBLE,
    bed_type VARCHAR(20)
);



9️⃣Department_Details
CREATE TABLE department_details (
    department_id INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(100),
    contact_number VARCHAR(15)
);



🔟Ambulance_details
CREATE TABLE ambulance_details (
    ambulance_id INT PRIMARY KEY AUTO_INCREMENT,
    ambulance_no VARCHAR(15) NOT NULL,
    driver_name VARCHAR(100),
    phone_number VARCHAR(15),
    availability VARCHAR(15)
);

---

