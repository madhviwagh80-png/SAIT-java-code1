# Java Practical File

17 Java programs from the practical file, organized as a GitHub-ready repo — one folder per program.

## Contents

| Folder | Program |
|---|---|
| 01_SumOfTwoNumbers | Accept two numbers and print their sum |
| 02_MethodPrototyping | Addition of two numbers using method prototyping |
| 03_FunctionOverloading_Average | Function overloading — average of 2 or 3 numbers |
| 04_ConstructorOverloading_BoxVolume | Constructor overloading — box/cube volume |
| 05_Inheritance_StudentDetails | Inheritance — student details (`Person` → `Student`) |
| 06_Package | Custom package (`mypack`) demo |
| 07_Interface_SquareCube | Interface with `square()` and `cube()` |
| 08_ExceptionHandling_DivisionByZero | try/catch/finally for division by zero |
| 09_Multithreading | Two named threads running concurrently |
| 10_MultilevelInheritance | Multilevel inheritance (`Animal` → `Dog` → `Puppy`) |
| 11_MethodOverloading_Multiply | Method overloading — multiply 2 or 3 numbers |
| 12_FanClass | `Fan` class with speed/on-off status |
| 13_ATMClass | `ATM` class with PIN-verified balance check |
| 14_MovieTicketClass | `MovieTicket` class with price and seat count |
| 15_CarClass | `Car` class tracking speed and fuel level |
| 16_EmployeeClass | `Employee` class computing gross salary from basic |
| 17_SmartLightClass | `SmartLight` class managing brightness level |

## How to compile & run

Most folders are single-file:
```bash
cd 01_SumOfTwoNumbers
javac Program1.java
java Program1
```

`06_Package` uses a custom package — compile/run from inside that folder:
```bash
cd 06_Package
javac mypack/Program6.java
java mypack.Program6
```

## Notes

- Transcribed from the "Java Practical File" document; expected outputs are included as comments in each file.
- `09_Multithreading`'s console interleaving may vary run to run since thread scheduling isn't deterministic.
