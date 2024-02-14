package com.driver;

public class Main {

    // Task 1: Create class A with method meth
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    // Task 2: Create class B which extends class A
    public static class B extends A {
        // Task 4: Override method meth in class B
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        // Task 3: Create object of class B and call method meth of class A
        B objB = new B();
        String resultFromA = objB.meth();
        System.out.println(resultFromA);

        // Task 5: Call the overridden method from obj of class B
        B obj = new B();
        String resultFromB = obj.meth();
        System.out.println(resultFromB);
    }


}

