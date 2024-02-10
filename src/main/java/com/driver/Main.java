package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create object of class B and call method meth of class A
        B objB = new B();
        String resultFromA = objB.meth();
        System.out.println(resultFromA);

        // Task 5: Call the overridden method from obj of class B
        String resultFromB = objB.meth();
        System.out.println(resultFromB);
    }
}

// Task 1: Create class A with method meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create class B which extends class A
class B extends A {
    // Task 4: Override method meth in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
