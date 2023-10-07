/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author user
 */

public class Employee {
    private int ID;
    private static int nextID=0;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) throws FieldLengthException,  IncorrectSalaryException{
        this.ID = nextID++;
        if(name.length()>15){
            throw new FieldLengthException("Too many symbols in name");
        }
        else {this.name = name;}
        if(surname.length()>30){
            throw new FieldLengthException("Too many symbols in surname");
        }
        else{this.surname = surname;}
        if(salary<=0){
            throw new IncorrectSalaryException("Salary is negative or equeals 0");
        }
        else{this.salary = salary;}
    }

    void show_info(){
        System.out.println("ID: "+ID+"\n Full name: "+surname+" "+name+"\n Salary: "+salary);
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}

