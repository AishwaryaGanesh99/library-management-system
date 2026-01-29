Library Management System (Java)
================================

A Java-based command-line Library Management System built using Object-Oriented Programming (OOP) principles.
The system supports book management, role-based access control, and persistent storage using file serialization.


Features
--------

- Add, View, Update, and Delete Books (CRUD operations)
- Issue and Return Books
- Role-Based Access Control (Admin vs User)
- Persistent data storage using Java Serialization
- Menu-driven Command Line Interface
- Modular and clean project structure


Technologies Used
-----------------

- Java (JDK 17+)
- Object-Oriented Programming (OOP)
- Java Collections Framework
- File Handling and Serialization
- IntelliJ IDEA
- Git and GitHub


Project Structure
-----------------

src/
└── library/
├── model/
│   ├── Book.java
│   └── User.java
├── service/
│   └── LibraryService.java
├── util/
│   └── FileUtil.java
└── Main.java


User Roles
----------

Admin:
- Add books
- Update book details
- Delete books
- View all books

User:
- View available books
- Issue books
- Return books

Note:
Authentication is simulated. The project demonstrates role-based authorization logic
and can be extended to real authentication systems.


How to Run the Project
----------------------

1. Clone the repository:

   git clone https://github.com/AishwaryaGanesh99/library-management-system.git

2. Open the project in IntelliJ IDEA

3. Navigate to:
   src/library/Main.java

4. Run Main.java


Data Persistence
----------------

- Book data is stored using Java Serialization
- Data persists across application restarts
- The serialized data file (library_data.ser) is ignored in Git


Access Control Design
---------------------

- Uses a User model with roles (ADMIN and USER)
- Admin-only operations are protected using role checks
- Demonstrates Role-Based Access Control (RBAC)


Future Enhancements
-------------------

- Real user authentication (username/password)
- Multiple users and user-specific book issuance
- Search and filter functionality
- GUI enhancements
- Database integration (MySQL / PostgreSQL)


Author
------

Aishwarya
GitHub: https://github.com/AishwaryaGanesh99


License
-------

This project is open-source and intended for learning purposes.
