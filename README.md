# 🗃️ Database Workshop – PostgreSQL

Welcome to this hands-on **Database Workshop Assignment**!  
This exercise will help you understand how to **connect to a PostgreSQL database** and perform the basic **CRUD operations** (Create, Read, Update, Delete) through a simple Java project.

You'll be working with two tables: **Clubs** and **Players**.

## 📁 Project Structure

```bash
.
├── DatabaseManager.java       # Handles PostgreSQL connection and query execution
├── models/
│   ├── player.java       # Player model and related DB operations
│   └── club.java         # Club model and related DB operations
└── main.java             # Entry point to execute all database tasks
```

## 🧩 Your Task – Step-by-Step

### ✅ Step 1: Create Tables

Use the provided model files or your own SQL commands to create two tables:

* `clubs` with fields like `id`, `title`, `manager`
* `players` with fields like `id`, `fullName`, `clubId` (foreign key)

### ➕ Step 2: Insert Clubs

Insert the following two clubs into the `clubs` table:

| Name        | Manager   |
| ----------- | --------- |
| Real Madrid | Ancelotti |
| Liverpool   | Slot      |

### 👥 Step 3: Insert Players

Add the following four players to the `players` table **all at once** (i.e., in a single insert statement):

| Name             | Club        |
| ---------------- | ----------- |
| Jude Bellingham  | Real Madrid |
| Valverde         | Real Madrid |
| Alexander-Arnold | Liverpool   |
| Courtois         | Real Madrid |

### 🔍 Step 4: Select and View Data

Use SELECT statements to print the current data from both `clubs` and `players` tables to verify your inserts.

### 🔁 Step 5: Update Records

* Update **Alexander-Arnold**'s team from **Liverpool** to **Real Madrid**
* Update **Real Madrid**'s manager from **Ancelotti** to **Alonso**

### 🔍 Step 6: Select Again

View the data again to confirm your updates have taken effect.

### ❌ Step 7: Delete Data

* Delete **Jude Bellingham** from the `players` table
* Delete **Liverpool** from the `clubs` table (ensure foreign key constraints are handled)

### 🔍 Step 8: Final Select

Perform one last SELECT on both tables to view the final state of your database.

## 🛠️ Requirements

* Java JDK
* PostgreSQL
* JDBC Driver

## 🧠 Tips

* Wrap database operations in `try-except` blocks for error handling
* Always close your DB connection!

## 🎯 Goal

By the end of this assignment, you should be confident in:

* Structuring code to interact with a database
* Performing all core SQL operations from Java
* Understanding table relationships and foreign keys

## 💬 Questions?

Feel free to open an issue or ask during the workshop!

Happy Coding! 🚀
