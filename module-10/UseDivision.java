/*
	* Author: Sheridan Dela Cruz
	* Date: July 24, 2026
	* Module 10.2
	* Desciption: Application class containing the main() method. Creates four objects (two international divisions and 
	* two domestic divisions) and calls their display() methods to show their information.
 */
 
public class UseDivision {
    public static void main(String[] args) {

		InternationalDivision intl1 =
				new InternationalDivision("Astra Meridian Group", "INT4512", "Estonia", "Estonian");

		InternationalDivision intl2 =
				new InternationalDivision("Solstice Global Exchange", "INT9827", "Bhutan", "Dzongkha");


        DomesticDivision dom1 =
				new DomesticDivision("Ironwood Systems Division", "DOM3348", "Montana");

		DomesticDivision dom2 =
				new DomesticDivision("Sierra Nexus Operations", "DOM7721", "New Mexico");


        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}
