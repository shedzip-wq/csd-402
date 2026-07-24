/*
	* Author: Sheridan Dela Cruz
	* Date: July 24, 2026
	* Module 10.2
	* Desciption: Subclass of Division for divisions located outside the U.S. Adds two extra fields — country and language — and 
	* provides its own version of the display() method.
 */
 
public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, String accountNumber,
                                 String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + divisionName +
                ", Account #: " + accountNumber +
                ", Country: " + country +
                ", Language: " + language);
    }
}
