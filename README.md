# Java Practical Practice Sheet - 02

Object Oriented Programming practical solutions based on the provided **Practical Practice Sheet - 2**.

## Topics Covered

- Multiple inheritance error in Java
- Variable hiding
- Instance initialization blocks
- `super` keyword
- Static initialization blocks
- Constructor execution order
- Runtime polymorphism
- Method overriding
- `super()` constructor call
- Multilevel inheritance

## Project Structure

```text
java-practical-practice-sheet-02/
├── README.md
├── Question01.java
├── Question02.java
├── Question03.java
├── Question04.java
├── Question05.java
├── Question06.java
├── Question07.java
├── Question08.java
├── Question09.java
├── Question10.java
├── Question11.java
└── Question12.java
```

## How to Compile and Run

Open a terminal in this folder.

Compile all programs:

```bash
javac *.java
```

Run a program:

```bash
java Question01
```

Replace `Question01` with the question you want to run.

## Question-wise Summary

| Question | Concept |
|---|---|
| 1 | Multiple inheritance |
| 2 | Variable hiding |
| 3 | Instance initialization blocks |
| 4 | `super` keyword |
| 5 | Static initialization blocks |
| 6 | Constructor chaining |
| 7 | Runtime polymorphism |
| 8 | Method overriding |
| 9 | `super()` constructor |
| 10 | Method overriding with payment classes |
| 11 | Multilevel inheritance |
| 12 | Constructor execution order |

## Expected Outputs

### Q1
The original `class Z extends X, Y` is invalid because Java does not support multiple inheritance using classes. The corrected solution uses interfaces.

### Q2
```text
10
```

### Q3
```text
1
2
3
```

### Q4
```text
Class A
Class B
Class C
```

### Q5
```text
THIRD
SECOND
FIRST
```

### Q6
```text
Class A Constructor
Class B Constructor
Class C Constructor
```

### Q7
Input `2`:
```text
Role: Developer
```

Input `3`:
```text
Role: Manager
```

### Q8
Input `1`:
```text
Car starts with a key.
```

Input `2`:
```text
Bike starts with a button.
```

### Q9
Input:
```text
Ravi
Computer Science
```

Output:
```text
Student Name: Ravi
Course: Computer Science
```

### Q10
Input:
```text
2
1500
```

Output:
```text
Payment method: UPI
Amount: 1500
```

### Q11
Input:
```text
Anita
ST101
Artificial Intelligence
```

Output:
```text
Name: Anita
Student ID: ST101
Research Area: Artificial Intelligence
```

### Q12
```text
Grandparent constructor
Parent constructor
Child constructor
```

## Author

**Amit Japulkar**

Java / OOP Practical Practice Sheet 02
