package com.company;

public class Main {

    public static void main(String[] args) {
        employee e = new employee();
        e.name = "Suryansh";
        e.age = 19;
        e.city = "Mumbai";
        e.Display();

        employee a = new employee();
        a.name = "Vikas";
        a.age = 20;
        a.city = "Mumbai";
        a.Display();



    }

public static class employee{
        String name;
        int age;
        String city;
    void Display(){
        System.out.println("The Name is "+ this.name);
        System.out.println("The Age is "+ this.age);
        System.out.println("The City is "+ this.city);
    }
    }
}
