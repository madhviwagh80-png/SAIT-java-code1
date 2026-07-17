# Java Lab Programs

Java programs transcribed from handwritten lab notes, organized as a GitHub-ready repo. Each folder is a self-contained program — compile and run independently.

## Contents

| Folder | Program |
|---|---|
| Q1_FunctionOverloading | Function overloading — calculate average of 2 or 3 numbers |
| Q2_MethodAddition | Addition of two numbers using a static method |
| Q3_ConstructorOverloading | Constructor overloading — calculate volume of a box |
| Q4_Inheritance | Student details using inheritance (`Student` → `Result`) |
| Q5_Package | Custom package (`mypackage`) demo |
| Q6_Interface | Interface implementation (`Animal` → `Dog`) |
| Q7_Multithreading | Multithreading using `Thread` |
| Q8_RectangleClass | Simple class with attributes and methods |
| Q9_Palindrome | Check if a string is a palindrome |
| Q10_MaxArray | Find the maximum element in an array |
| Q11_Encapsulation | Encapsulation using private variables |
| Q12_ExceptionHandling | Exception handling with try/catch |

## How to compile & run

Most folders are single-file:
```bash
cd Q1_FunctionOverloading
javac Average.java
java Average
```

`Q4_Inheritance` has two files — compile both, run `Result`:
```bash
cd Q4_Inheritance
javac Student.java Result.java
java Result
```

`Q5_Package` uses a custom package — compile from inside the folder:
```bash
cd Q5_Package
javac mypackage/Message.java
javac -cp . Demo.java
java -cp . Demo
```

## Notes

- Transcribed from handwritten notebook pages; expected outputs are included as comments in each file.
- `Q7_Multithreading`'s console interleaving may vary run to run since thread scheduling isn't deterministic.
