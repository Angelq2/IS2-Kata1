package kata1;

import java.util.Date;

/**
 * Crear una clase Person para el cálculo de la edad.
 * 
 * @author angel
 */

public class Main {

    public static void main(String[] args) {
        
        Person person = new Person("Angel", new Date(99,8,24)); 
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
        
    }
    
    
}
