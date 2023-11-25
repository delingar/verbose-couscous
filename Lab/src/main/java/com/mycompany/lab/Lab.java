 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab;

/**
 *
 * @author user
 */
public class Lab {

    public static void main(String[] args) {
        try{
            Employee emp=new Employee("V","The Tester", 4500);
            emp.show_info();
        }
        catch(FieldLengthLimitException ex1){
            System.out.println(ex1.getMessage());
        }
        catch(IncorrectSalaryException ex2){
            
            System.out.println(ex2.getMessage());
        }
        
        try{
            Employee emp=new Employee("V1111111111111111111111111","The Tester", 4500);
            emp.show_info();
        }
        catch(FieldLengthLimitException ex1){
            System.out.println(ex1.getMessage());
        }
        catch(IncorrectSalaryException ex2){
            
            System.out.println(ex2.getMessage());
        }
        
        try{
            Employee emp=new Employee("V","The Tester111111111111111111", 4500);
            emp.show_info();
        }
        catch(FieldLengthLimitException ex1){
            System.out.println(ex1.getMessage());
        }
        catch(IncorrectSalaryException ex2){
            
            System.out.println(ex2.getMessage());
        }
        try{
            Employee emp=new Employee("V","The Tester", -4500);
            emp.show_info();
        }
        catch(FieldLengthLimitException ex1){
            System.out.println(ex1.getMessage());
        }
        catch(IncorrectSalaryException ex2){
            
            System.out.println(ex2.getMessage());
        }
    }
}
