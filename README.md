# SAIT-java-code1





## Repository structure

| Folder | Description |
|---|---|
| `Array` | Array-based programs and exercises |
| `Class&ObjectAssignment` | Assignment exercises on classes and objects |
| `ClassObject` | Programs demonstrating classes and objects |
| `Collection` | Programs using the Java Collections Framework (`List`, `Set`, `Map`, etc.) |
| `Constructor` | Constructor examples (default, parameterized, overloaded) |
| `ConstructorAssignment` | Assignment exercises on constructors |
| `DecisionMaking` | `if-else`, `switch`, and other decision-making programs |
| `ExceptionHandling/bin` | Exception handling programs (`try`/`catch`/`finally`) |
| `FunctionAssignment` | Assignment exercises on methods/functions |
| `InheritanceAndPolymorphism` | Inheritance and polymorphism programs |
| `JavaProgams` | General-purpose Java programs |
| `LoopsAssignment` | Assignment exercises using `for`, `while`, `do-while` loops |
| `NetBeansProjects/MailSenderApp` | NetBeans project — a mail-sending application |
| `OOPQuesAndInitialize` | OOP concept questions and object initialization examples |
| `OperatorAssignment` | Assignment exercises on Java operators |
| `PrintingEx` | Output formatting / printing exercises |
| `StringAndWrapperClass` | String manipulation and wrapper class programs |
| `java-lab-programs` | Lab practical file — Core Java programs covering OOP, exceptions, multithreading, and more (see its own README for details) |

## Prerequisites

- JDK 8 or later (`javac -version` to check)
- Any terminal, or an IDE such as NetBeans/IntelliJ/Eclipse for the NetBeans project

## How to compile & run

Most folders contain standalone `.java` files. From inside a folder:

```bash
javac ProgramName.java
java ProgramName
```

For folders with a declared `package` statement, compile/run from the folder containing the package root so the structure resolves correctly.

For `NetBeansProjects/MailSenderApp`, open it directly in NetBeans (or another IDE) rather than compiling manually, since it's a full project with its own build configuration.

## Notes

- Folder names generally reflect the topic or assignment they cover.
- `ExceptionHandling/bin` contains compiled output alongside source — safe to ignore `.class` files if you're just reading code.
