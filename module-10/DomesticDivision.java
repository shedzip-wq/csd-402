/*
	* Author: Sheridan Dela Cruz
	* Date: July 24, 2026
	* Module 10.2
	* Desciption: Subclass of Division for divisions within the U.S. Adds one extra field — the state — and 
	* implements the required display() method.
 */
 
public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, String accountNumber,
                            String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName +
                ", Account #: " + accountNumber +
                ", State: " + state);
    }
}
