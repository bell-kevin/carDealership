/** ****************************************************************************
 * DealershipDriver.java
 * Kevin Bell
 *
 * This class represents an auto retail sales organization.
 **************************************************************************** */
package cardealership;

import java.util.ArrayList;

public class Dealership {

    private String company;
    private Manager manager;
    private ArrayList<SalesPerson> people = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
//******************************************************************************

    Dealership(String company, Manager manager) {
        this.company = company;
        this.manager = manager;
    }
//******************************************************************************

   public void addCar(Car car) {
        cars.add(car);
    } // end addCar method 

    public void addPerson(SalesPerson person) {
        people.add(person);
    } // end addPerson method
//******************************************************************************

    void printStatus() {
        System.out.println(company + "\t" + manager.getName());
        for (SalesPerson person : people) {
            System.out.println(person.getName());
        } // end for loop
        for (Car car : cars) {
            System.out.println(car.getMake());

        } // end for loop
    } // end printStatus method
} // end Dealership class
