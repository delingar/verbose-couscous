
import com.mycompany.lab.Employee;
import com.mycompany.lab.FieldLengthLimitException;
import com.mycompany.lab.IncorrectSalaryException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class EmployeeTest {
    @Test
    public void createEmployeeTest(){
        String name="V";
        String surname = "The Tester";
        int payment = 4500;
        Employee testEMP =null;
        try {
            testEMP=new Employee(name,surname,payment);
        } catch (FieldLengthLimitException ex1) {
            java.util.logging.Logger.getLogger(EmployeeTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex1);
        } catch (IncorrectSalaryException ex2) {
            java.util.logging.Logger.getLogger(EmployeeTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex2);
        }
        assertEquals(testEMP.getName(),name);
    }
    
    @Test
    public void testException(){
        String name="V1111111111111111111111";
        String surname = "The Tester";
        int payment = 4500;
        FieldLengthLimitException thrown = assertThrows(FieldLengthLimitException.class,()->new Employee(name,surname,payment));
        System.out.print(thrown.getMessage());
        assertTrue(thrown.getMessage().contains("Too much symbols in name!"));
        
        String name1="V";
        String surname1 = "The Tester111111111111111";
        int payment1 = 4500;
        FieldLengthLimitException thrown1 = assertThrows(FieldLengthLimitException.class,()->new Employee(name1,surname1,payment1));
        System.out.print(thrown1.getMessage());
        assertTrue(thrown1.getMessage().contains("Too much symbols in surname!"));
        
        String name2="V";
        String surname2 = "The Tester";
        int payment2 = -4500;
        IncorrectSalaryException thrown2 = assertThrows(IncorrectSalaryException.class,()->new Employee(name2,surname2,payment2));
        System.out.print(thrown2.getMessage());
        assertTrue(thrown2.getMessage().contains("Payment is smaller, than 0"));
    }
}
