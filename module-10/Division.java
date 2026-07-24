/*
	* Author: Sheridan Dela Cruz
	* Date: July 24, 2026
	* Module 10.2
	* Desciption: Abstract superclass representing a company division. Holds the shared data (division name and account number) 
	* and declares an abstract display() method that all subclasses must implement.
 */
 
 public abstract class Division {
    protected String divisionName;
    protected String accountNumber;

    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}
