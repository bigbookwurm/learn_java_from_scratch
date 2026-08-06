# ☕ Practical Java Course Workspace

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Udemy](https://img.shields.io/badge/Udemy-A435F0?style=for-the-badge&logo=udemy&logoColor=white)](https://www.udemy.com/course/practical-java-course/learn)

Welcome to my personal learning repository for the **[Practical Java Course](https://www.udemy.com/course/practical-java-course/learn)** on Udemy!

This repository serves as a workspace for code examples, hands-on exercises, mini-projects, and notes created while completing the course.

---

## 📌 Repository Structure

```text
Udemy_PracticalJava/
├── docs/                   # Notes, summaries, and cheatsheets
├── src/                    # Java source files organized by topic/section
│   ├── section_01_basics/  # Variables, Data Types, Control Flow
│   ├── section_02_oop/     # Classes, Objects, Inheritance, Polymorphism
│   ├── section_03_collections/# Lists, Sets, Maps, Streams
│   ├── section_04_exceptions/# Exception Handling & Debugging
│   └── projects/           # Hands-on capstone projects & exercises
└── README.md               # Repository documentation
```

*(Note: Feel free to adjust the directory layout as you progress through the course sections!)*

---

## 🛠️ Prerequisites & Setup

### Required Tools
* **Java Development Kit (JDK):** Version 17+ or 21+ (LTS recommended).
* **IDE:** [IntelliJ IDEA](https://www.jetbrains.com/idea/) (Recommended), [VS Code](https://code.visualstudio.com/) with Java Extension Pack, or [Eclipse](https://www.eclipse.org/).
* **Git:** For version control.

### Verify Java Installation
Open a terminal or PowerShell window and run:
```bash
java -version
javac -version
```

---

## 🚀 Getting Started & How to Run

### 1. Compiling and Running via Command Line
To compile and run a standalone Java file:
```bash
# Navigate to source directory
cd src/section_01_basics

# Compile Java file to bytecode
javac Main.java

# Run compiled Java class
java Main
```

### 2. Running in an IDE (IntelliJ IDEA / VS Code)
1. Open this folder as a project in your IDE.
2. Ensure your JDK SDK is configured (Java 17+ recommended).
3. Navigate to any `.java` file containing a `public static void main(String[] args)` method and click **Run**.

---

## 🎯 Learning Progress Tracker

- [ ] **Section 1:** Course Introduction & Java Environment Setup
- [ ] **Section 2:** Java Basics (Variables, Data Types, Operators)
- [ ] **Section 3:** Control Flow (If-Else, Switch, Loops)
- [ ] **Section 4:** Object-Oriented Programming (OOP) Fundamentals
- [ ] **Section 5:** Advanced OOP (Interfaces, Abstract Classes, Inheritance)
- [ ] **Section 6:** Data Structures & Java Collections Framework
- [ ] **Section 7:** Exception Handling & File I/O
- [ ] **Section 8:** Functional Programming & Java Streams
- [ ] **Section 9:** Hands-on Projects & Exercises

---

## 💡 Quick Java Cheatsheet & Naming Conventions

* **Entry Point:** Every executable Java application starts with a `main` method:
  ```java
  public class Main {
      public static void main(String[] args) {
          System.out.println("Hello, Java!");
      }
  }
  ```
* **Naming Conventions:**
  * `Classes / Interfaces`: `PascalCase` (e.g., `BankAccount`)
  * `Variables / Methods`: `camelCase` (e.g., `calculateTotal`)
  * `Constants`: `UPPER_SNAKE_CASE` (e.g., `MAX_RETRY_COUNT`)
  * `Packages`: `lowercase` (e.g., `com.course.basics`)

---

## 🔗 Useful Links

* 📚 [Practical Java Course on Udemy](https://www.udemy.com/course/practical-java-course/learn)
* 📖 [Official Oracle Java Documentation](https://docs.oracle.com/en/java/)
* ☕ [JetBrains Java Tutorials](https://www.jetbrains.com/guide/java/)

---
*Happy Coding! 🚀*