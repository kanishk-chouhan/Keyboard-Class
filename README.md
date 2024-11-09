# Keyboard Class Utility
## _A Refined Version of Java’s Scanner Class for Clean Input Handling_

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://github.com/kanishk-chouhan/Keyboard-Class)

The **Keyboard Class** is a simple and efficient input utility for Java, designed to fix common issues found in the `Scanner` class. Specifically, it handles the `\n` and `\r` characters that linger in the input buffer after reading `String` inputs. The class provides methods to read various data types from the console, including `String`, `int`, `char`, `boolean`, and more.

- Written in **Java**
- Enhances user input handling with cleaner buffer management
- Supports multiple data types: `String`, `char`, `int`, `boolean`, and more

## Features

- Resolves issues with lingering newline and carriage return characters.
- Provides methods for reading `String`, `char`, `int`, `long`, `double`, `float`, `boolean`, and other primitive types.
- Supports optional custom prompt messages for user-friendly inputs.

## Tech

The **Keyboard** class is built purely in Java and offers a clean API for seamless data input handling.

- **Java 8+** compatible
- Provides methods for all common data types
- Handles errors gracefully by returning default values for invalid inputs

## Supported Data Types

The **Keyboard** class includes the following methods for reading various data types:

```java
// Reading a String input
String getString();
String getString(String message);

// Reading a single character
char getCharacter();
char getCharacter(String message);

// Reading an integer
int getInt();
int getInt(String message);

// Reading a long
long getLong();
long getLong(String message);

// Reading a double
double getDouble();
double getDouble(String message);

// Reading a boolean
boolean getBoolean();
boolean getBoolean(String message);
```

Each method includes an optional prompt message to guide the user in entering the correct input.

## Installation

To use the **Keyboard** class in your Java project, clone the repository and add the source files to your project.

```sh
git clone https://github.com/kanishk-chouhan/Keyboard-Class.git
```

Include the **Keyboard.java** file in your project, or use the provided JAR file by adding it to your build path.

## Usage

1. **Import the Keyboard class.**
2. Call the appropriate method for the data type you need, with an optional message.

Example:

```java
import com.thinking.machines.util.Keyboard;

public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();

        // Prompting the user for input
        String name = keyboard.getString("Enter your name: ");
        int age = keyboard.getInt("Enter your age: ");
        boolean isStudent = keyboard.getBoolean("Are you a student? (true/false): ");

        // Displaying the input
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Student Status: " + isStudent);
    }
}
```

## Compilation and Execution

To compile and run your program with the **Keyboard** class:

1. **Compile the source code**:
   ```sh
   javac -d classes src/com/thinking/machines/util/Keyboard.java
   ```

2. **Package the class into a JAR file**:
   ```sh
   jar -cvf dist/Keyboard.jar -C classes com/thinking/machines/util/Keyboard.class
   ```

3. **Compile your program using the JAR file**:
   ```sh
   javac -cp dist/Keyboard.jar:classes YourProgram.java
   ```

4. **Run your program**:
   ```sh
   java -cp dist/Keyboard.jar:classes YourProgram
   ```

## License

Distributed under the MIT License. See the [LICENSE](LICENSE) file for more information.

## Development

Want to contribute? Feel free to fork the repository and submit a pull request with your improvements. All contributions are welcome!

# Contact
##### Gmail: kanishk.chouhan01@gmail.com  
##### LinkedIn: [Kanishk Chouhan](https://www.linkedin.com/in/kanishk-chouhan/)
