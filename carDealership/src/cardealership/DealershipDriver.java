/** ****************************************************************************
 * DealershipDriver.java
 * Kevin Bell
 *
 * This class demonstrates the car dealership composition.
 **************************************************************************** */
package cardealership;

public class DealershipDriver {

    public static void main(String[] args) {
        Manager kevin = new Manager("Kevin Bell");
        SalesPerson foxNews = new SalesPerson("Sean Hannity");
        SalesPerson blazeTV = new SalesPerson("Glenn Beck");
        Dealership dealership = new Dealership("Okay Used Cars", kevin);
        
        dealership.addPerson(foxNews);
        dealership.addPerson(blazeTV);
        dealership.addCar(new Car("Toyota"));
        dealership.addCar(new Car("Honda"));
        dealership.addCar(new Car("Nissan"));
        dealership.printStatus();
    } // end main method
} // end DealershipDriver class