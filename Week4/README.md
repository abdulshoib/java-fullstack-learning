# Java Full Stack Learning 🚀

## 📅 Week 4 - JDBC (Java Database Connectivity)

### 🎯 Objective

Learn how to connect Java applications with MySQL database and perform CRUD operations.

---

## 📚 Topics Covered

* JDBC Introduction
* Database Connection using Java
* PreparedStatement
* CRUD Operations (Create, Read, Update, Delete)

---

## 💻 Programs

### 1. TestConnection.java

* Establish connection between Java and MySQL
* Confirms successful connectivity

---

### 2. InsertAccount.java

* Inserts new account records into database
* Uses PreparedStatement for safe queries

---

### 3. ViewAccount.java

* Fetches and displays all records from database

---

### 4. UpdateAccount.java

* Updates account balance using account number

---

### 5. DeleteAccount.java

* Deletes account record from database

---

## 🗄️ Database Details

**Database Name:** `bankdb`
**Table Name:** `account`

```sql
CREATE TABLE account (
    accNo INT PRIMARY KEY,
    name VARCHAR(50),
    balance DOUBLE
);
```

---

## ▶️ How to Run

1. Add MySQL Connector JAR file
2. Compile program:

```
javac -cp ".;Mysql.jar" FileName.java
```

3. Run program:

```
java -cp ".;Mysql.jar" FileName
```

---

## 📌 Output Example

```
Enter Account No: 101
Enter Name: Tony Stark
Enter Balance: 5000
Data inserted successfully
```

---

## 🧠 Key Learnings

* Java can interact with databases using JDBC
* PreparedStatement prevents SQL Injection
* CRUD operations are core backend skills

---

## 🔥 Status

✅ JDBC Setup Completed
✅ CRUD Operations Completed

---

## 🚀 Next Step

Convert Bank Application into Database-based project using JDBC
