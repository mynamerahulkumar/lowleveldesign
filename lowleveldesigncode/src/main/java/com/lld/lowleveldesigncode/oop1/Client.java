package com.lld.lowleveldesigncode.oop1;

public class Client {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Rahul";
        student.psp=87;
        // both object are independent of each other and seperate memory(we can see in debug)
        Student student1=new Student();
        System.out.println(student1);//check the attribute state in debug mode
        student1.name="Kumar";
        student1.psp=98;
        System.out.println(student1);
    }
}
