/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        try{
            Employee emp=new Employee("V", "The Tester", 1450.00);
            emp.show_info();
        }catch(FieldLengthException ex){
            System.out.println(ex.getMessage());
        }catch(IncorrectSalaryException ex2){
            System.out.println(ex2.getMessage());
        }finally{}

        try{
            Employee emp=new Employee("V11111111111111111111111111111",  "The Tester", 1450.00);
            emp.show_info();
        }catch(FieldLengthException ex){
            System.out.println(ex.getMessage());
        }catch(IncorrectSalaryException ex2){
            System.out.println(ex2.getMessage());
        }finally{}

        try{
            Employee emp=new Employee("V",  "The Testeriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 1450.00);
            emp.show_info();
        }catch(FieldLengthException ex){
            System.out.println(ex.getMessage());
        }catch(IncorrectSalaryException ex2){
            System.out.println(ex2.getMessage());
        }finally{}
        
        try{
            Employee emp=new Employee("V", "The Tester", -1450.00);
            emp.show_info();
        }catch(FieldLengthException ex){
            System.out.println(ex.getMessage());
        }catch(IncorrectSalaryException ex2){
            System.out.println(ex2.getMessage());
        }finally{}

        try{
            Employee emp=new Employee("V",  "The Tester", 0);
            emp.show_info();
        }catch(FieldLengthException ex){
            System.out.println(ex.getMessage());
        }catch(IncorrectSalaryException ex2){
            System.out.println(ex2.getMessage());
        }finally{}
    }
}

