package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Crear una clase Person para el cálculo de la edad.
 * 
 * @author angel
 */

public class Main {

    public static void main(String[] args) {
        
        //Person person = new Person("Angel", new Date(99,8,24)); 
        Calendar date = GregorianCalendar.getInstance();
        date.set(1999,8,24);
        
        Calendar date2 = GregorianCalendar.getInstance();
        date2.set(1997,11,24);
        
        Person person = new Person("Angel",date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    
        Person person2 = new Person("Pepe",date2);
        System.out.println(person2.getName() + " tiene " + person2.getAge() + " años");
    }
    
    
}
