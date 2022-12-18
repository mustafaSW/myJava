package com.Generics6;

import java.util.ArrayList;
import java.util.List;

abstract class Employee{
    abstract void name();
}
class David extends Employee{

    @Override
    void name() {
        System.out.println("David");
    }
}
class Person extends Employee{

    @Override
    void name() {
        System.out.println("Albert");
    }
}

public class Main {

    public static void employeeName(List<? extends Employee>lists){
        for (Employee employee :lists) {
            employee.name();
        }
    }
    public static void main(String[] args) {

        List<David>m = new ArrayList<David>();
        m.add(new David());
        List<Person>a = new ArrayList<>();
        a.add(new Person());

        employeeName(m);
        employeeName(a);
    }
}
