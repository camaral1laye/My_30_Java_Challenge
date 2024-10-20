# My_30_Java_Challenge
    #Anatomy_of_Java:
                              _ _  _ _
                            |CAR      |
                            |Object   |
                             -  -  - - 
                                 | 
                                 |
                                 \/
            ---------       --------           --------
            |  CAR  |      |FACTORY |          |CAR   |
            | Object|------|Class   |----------|Object|
            |-------|      ----------           -------


### Day 01: **HelloWorld Program**

#### Code:

```java
package Day01;

public class HelloWorld {
    public static void main(String[] args) {
        
        //output
        System.out.println("Hello, World!");
        System.out.println("Here my first Java program");
    }
}
```

#### Explanation for Beginners:

Let’s imagine you have never written a single line of code before. This simple program is like your first "hello" to the computer, telling it to say something back to you!

1. **What is a program?**
   A program is like a set of instructions you give to a computer, and the computer will follow them exactly.

2. **Breaking down the code:**
   
   - **`package Day01;`**: This is like saying, "Put this code inside a folder called 'Day01'." It helps you organize your programs. Imagine you have a drawer for school papers; this is like one of the labels on a folder inside that drawer.

   - **`public class HelloWorld`**: This is like naming your program "HelloWorld." It’s the main part of your code where everything happens. Think of it as a box where you keep all your instructions.

   - **`public static void main(String[] args)`**: This is where the magic begins. This line is very important because it’s where the computer starts reading your instructions. Imagine it’s the starting point of a recipe – like the first step when cooking.

     - **`public`**: This means that everyone (or any other part of your code) can see and use this part.
     - **`static`**: Don’t worry too much about this right now, but it just means this part doesn’t change.
     - **`void`**: This means it doesn’t give anything back (just tells the computer to do something, but doesn’t expect anything in return).
     - **`main`**: This is the main function (or main instruction) that runs your program.
     - **`String[] args`**: Just imagine this as a way for the program to accept extra information if needed (but for now, we don’t need to use it).

   - **`System.out.println("Hello, World!");`**: 
     This is the instruction that tells the computer, **"Show the text 'Hello, World!' on the screen."** 
     - **`System.out`**: Think of it like a way to talk to the computer screen.
     - **`println`**: It means "print this, and then go to a new line."
     - **`"Hello, World!"`**: This is the message we want to show on the screen.

   - **`System.out.println("Here my first Java program");`**: 
     This is just another instruction that tells the computer to show the message **"Here my first Java program."** It works the same way as the first line, but with different text.

3. **What happens when you run this?**
   When you run this program, the computer will follow your instructions and show two lines of text:
   - **Hello, World!**
   - **Here my first Java program**

#### Output:
```
Hello, World!
Here my first Java program
```

This is one of the simplest programs you can write, and it helps you understand how to tell the computer to show some text. It’s like learning to say "hello" in a new language – in this case, the language is Java!

### Day 02: **Calling Methods from Another Class**

#### Code: 

**Laye.java**
```java
package Day02;

public class Laye {
    public static void main(String[] args) {
        
        //output
        sayHi();
        sayHello();
    
    }
    public static void sayHi() {
        System.out.println("sayHi: Congratualations!\n");
    }
    private static void sayHello() {
        System.out.println("Hi From SayHello");
    }
}
```

**Main.java**
```java
package Day02;

public class Main {
    public static void main(String[] args) {
        
        //output
        System.out.println("Main: Hello, World!");
        System.out.println("Main: Here my first Java program");
        Laye.sayHi();
    }
}
```

#### Explanation for Beginners:

On Day 2, we are learning how to break up our code into different pieces, also known as **methods** or **functions**, and how to call them from other classes. It's like organizing your tasks and telling someone else to help you finish them.

Let’s break this down:

---

### **Laye.java**

1. **`public class Laye`**: This is the name of our new class called `Laye`. It's where we will create some methods that other classes (like `Main.java`) can use.
   
2. **`public static void sayHi()`**:
    - **public**: This means other parts of the program (other classes) can use this method.
    - **static**: The method doesn’t change based on an instance of the class.
    - **void**: This means it doesn’t return any value.
    - **sayHi**: This is the name of our method, and it will print out **"Congratualations!"**.
    - Inside the method, we have **`System.out.println("sayHi: Congratualations!\n");`** which prints the message.

3. **`private static void sayHello()`**:
    - **private**: This means only this class (`Laye.java`) can use this method. Other classes cannot call it.
    - This method prints **"Hi From SayHello"** when called.
   
4. In the `main()` method of `Laye.java`, we call both **`sayHi()`** and **`sayHello()`**, which means both methods will run when we run this class.

---

### **Main.java**

1. **`public class Main`**: This is another class called `Main`, which will call the **`sayHi()`** method from `Laye.java`.
   
2. Inside the **`main()`** method:
    - We first print two lines using **`System.out.println()`** to display **"Hello, World!"** and **"Here my first Java program"**.
    - Then, we use **`Laye.sayHi();`**. Here’s what’s happening:
        - **Laye**: This is the class `Laye` we created earlier.
        - **sayHi()**: We are calling the **`sayHi()`** method from the `Laye` class.
        - This will run the code inside the **`sayHi()`** method of `Laye.java`, printing **"Congratualations!"**.

   However, notice that we **can’t call** the **`sayHello()`** method from the `Main` class because it’s marked as `private` in `Laye.java`. Only the `Laye` class can use it.

---

### What happens when you run these?

1. If you run **`Laye.java`**, it will print:
    ```
    sayHi: Congratualations!

    Hi From SayHello
    ```

2. If you run **`Main.java`**, it will print:
    ```
    Main: Hello, World!
    Main: Here my first Java program
    sayHi: Congratualations!
    ```

---

### Summary:
- **`public`** methods can be used anywhere in your program, like calling **`sayHi()`** from another class.
- **`private`** methods are only used inside the class where they are created.
- We are learning how to organize our code into methods and how to use them across different classes, like using tools from a toolbox!

### Day 03: **Calling Methods from Another Class and Same Class**

#### Code:

**Main.java**
```java
package Day03;

public class Main {
    public static void main(String[] args) {
        Me.sayName();
        Me.sayAge();
    }
}
```

**Me.java**
```java
package Day03;

public class Me {
    public static void main(String[] args) {
        sayName();
        sayAge();
    }
    
    public static void sayName() {
        System.out.println("My name: Laye Camara");
    }
    
    public static void sayAge() {
        System.out.println("My age: 25");
    }
}
```

---

### Explanation for Beginners:

On **Day 3**, we are learning how to reuse methods in multiple classes. In this example, there are two files: `Main.java` and `Me.java`. These two files work together to print the name and age, using methods from one file inside another.

Let’s break this down:

---

### **Me.java**

1. **`public class Me`**: This is a new class named `Me`. Inside this class, we will create methods to print the name and age.

2. **Methods**:
    - **`sayName()`**: This method prints **"My name: Laye Camara"** when called.
    - **`sayAge()`**: This method prints **"My age: 25"** when called.
  
3. **Inside the `main()` method of `Me.java`**:
    - We call **`sayName()`** and **`sayAge()`**.
    - This will display **Laye Camara's name and age** when the `Me.java` file is run.

---

### **Main.java**

1. **`public class Main`**: This is another class called `Main`. Instead of printing directly, it uses the methods from the **`Me` class**.
  
2. **Inside the `main()` method of `Main.java`**:
    - We use **`Me.sayName();`** to call the **`sayName()`** method from the **`Me`** class.
    - We also use **`Me.sayAge();`** to call the **`sayAge()`** method from the **`Me`** class.
    - This means we are using the methods defined in `Me.java` without rewriting them in `Main.java`.

---

### What Happens When You Run These?

1. If you run **`Me.java`**, it will print:
    ```
    My name: Laye Camara
    My age: 25
    ```

2. If you run **`Main.java`**, it will also print:
    ```
    My name: Laye Camara
    My age: 25
    ```

---

### Key Lessons:
- **Methods**: Methods are blocks of code that perform specific tasks. In this case, we created `sayName()` and `sayAge()` to print the name and age.
- **Calling Methods from Another Class**: We are calling methods from the `Me` class in `Main.java` by using **`Me.methodName()`**.
- This approach helps keep code organized and reusable. Instead of writing the same code twice, we can simply call it from another class.

### Day 04: **Introduction to Constants in Java**

#### Code:

```java
package Day04;

public class Constant {
    public static void main(String[] args) {
        
        final String myName = "Laye Camara";
        //myName = "Another Name"; // This line would cause an error if uncommented.

        System.out.println(myName);
        System.out.println(myName);
        System.out.println(myName);
        System.out.println(myName);
        System.out.println(myName);
    }
}
```

---

### Explanation for Beginners:

On **Day 4**, we're learning about **constants** in Java.

#### Key Concept: **Constants**
- A **constant** is a value that cannot change once it has been set.
- In Java, we use the keyword **`final`** to make a variable a constant.

---

### Breakdown of the Code:

1. **`final String myName = "Laye Camara";`**
   - **`final`**: This keyword makes `myName` a **constant**. Once we set `myName` to **"Laye Camara"**, it **cannot be changed**.
   - **`myName = "Another Name";`**: This line is commented out. If you try to change the value of `myName` after declaring it with **`final`**, you will get an **error**. In this case, you are not allowed to assign a new value like `"Another Name"`.

2. **`System.out.println(myName);`**
   - We are printing the **value of `myName`** five times. Since `myName` is a constant, it will print **"Laye Camara"** each time.

---

### What Happens When You Run This?

The output will be:
```
Laye Camara
Laye Camara
Laye Camara
Laye Camara
Laye Camara
```

Each time we print `myName`, it shows **"Laye Camara"**, as the value of a constant does not change.

---

### Why Use Constants?

1. **Prevent Accidental Changes**: When you want to make sure a variable doesn't get changed by mistake, you declare it as **`final`**. This is helpful for values like **names, fixed numbers (like PI), or settings** that should remain the same throughout the program.
  
2. **Easier to Manage**: If you ever need to use the same value in many places in your code (like the name "Laye Camara"), it's better to declare it as a constant. If you need to update it later, you only change it in one place.

---

### Key Lesson:
- The **`final`** keyword is used to make constants in Java, ensuring that the value of a variable cannot be changed after it is set.