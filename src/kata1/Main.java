package kata1;

import java.time.LocalDate;

/**
 * Crear una clase Person para el cálculo de la edad.
 * 
 * @author angel
 */

public class Main {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(1999, 11, 24);

        Person person = new Person("Angel",date);
        System.out.println(person.getName() + " nacio el " + person.getBirthdate()
                + " y tiene " + person.getAge() + " años");
    
    }
    
    
}
