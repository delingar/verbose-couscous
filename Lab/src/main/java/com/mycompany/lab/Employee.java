/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

/**
 *
 * @author user
 */
public class Employee {
    private int ID;
    private static int nextID=0;
    private String name;
    private String surname;
    private int payment;
    
    public Employee(String name, String surname, int payment) throws FieldLengthLimitException, IncorrectSalaryException{
        this.ID= nextID++;
        if (name.length()>15){throw new FieldLengthLimitException("Too much symbols in name!");}
        else {this.name = name;}
        if (surname.length()>20){throw new FieldLengthLimitException("Too much symbols in surname!");}
        else {this.surname = surname;}
        if (payment<0){throw new IncorrectSalaryException("Payment is smaller, than 0");}
        else {this.payment = payment;}
    }
    
    public void show_info(){
        System.out.println("ID: "+ID+" Name: "+name+" "+surname+". Salary:"+payment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
    
}
