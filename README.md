Keyboard Class Utility
The Keyboard class is an enhanced input utility in Java that simplifies console input handling and resolves common issues with Java's Scanner class. Unlike Scanner, the Keyboard class effectively clears newline and carriage return characters from the input buffer, making it ideal for applications that require clean, sequential input.

Project Structure
src/: Contains the source code within the package com.thinking.machines.util.
classes/: Stores compiled .class files in a structured package format.
dist/: Contains the distributable JAR file Keyboard.jar.
testcases/: Includes test files to validate the functionality of the Keyboard class.
Features
Reliable Buffer Management: Resolves the issue of lingering \n and \r characters after inputs.
Comprehensive Data Type Support: Reads various data types, including String, int, double, boolean, and more.
Custom Prompt Messages: Methods support optional prompt messages to enhance the user experience.
Getting Started
Prerequisites
Java Development Kit (JDK) 8 or higher.
Installation
Clone the repository:
sh
Copy code
git clone https://github.com/kanishk-chouhan/Keyboard-Class.git
Compile the source files and package the JAR file following the steps below.
Compilation and Execution
Compile the Source Files

sh
Copy code
javac -d classes src/com/thinking/machines/util/Keyboard.java
Create the JAR File

sh
Copy code
jar -cvf dist/Keyboard.jar -C classes com/thinking/machines/util/Keyboard.class
Compile and Run Test Cases

Compile the test case files:
sh
Copy code
javac -cp classes:dist/Keyboard.jar -d testcases testcases/TestKeyboard.java
Run the tests:
sh
Copy code
java -cp classes:dist/Keyboard.jar:testcases TestKeyboard
Usage Example
To use the Keyboard class in your code, import it and call its methods to read inputs of various data types. Here’s a basic example:

java
Copy code
import com.thinking.machines.util.Keyboard;

public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        
        // Reading user inputs
        String name = keyboard.getString("Enter your name: ");
        int age = keyboard.getInt("Enter your age: ");
        
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
Method Overview
getString() / getString(String message): Reads a line of text with an optional prompt.
getCharacter() / getCharacter(String message): Reads a single character with an optional prompt.
getInt() / getInt(String message): Reads an integer with an optional prompt.
Additional Methods: Similar methods exist for other data types such as long, short, byte, double, float, and boolean.
