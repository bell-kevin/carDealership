/** ****************************************************************************
 * SalesPerson.java
 * Kevin Bell
 *
 * This class implements a car salesperson.
 **************************************************************************** */
package cardealership;

class SalesPerson {

    private String name;
    private double sales = 0.0; // sales to date
//******************************************************************************

    public SalesPerson(String name) {
        this.name = name;
    }
//******************************************************************************

    public String getName() {
        return name;
    } // end getName method
} // end SalesPerson class
