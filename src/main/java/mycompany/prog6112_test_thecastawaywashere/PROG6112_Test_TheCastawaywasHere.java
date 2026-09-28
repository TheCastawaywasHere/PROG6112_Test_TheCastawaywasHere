
package mycompany.prog6112_test_thecastawaywashere;

import java.util.Scanner;

public class PROG6112_Test_TheCastawaywasHere {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------");
        System.out.println("\t \t \t" + "PS5" + "\t" + "XBOX" + "\t" + "SWITCH");
        
        System.out.println("CAPE TOWN");
        String CTPS5 = UserInput.nextLine();
        String CTXbox = UserInput.nextLine();
        String CTSwitch = UserInput.nextLine();
        
        System.out.println("PORT ELIZABETH");
        String PEPS5 = UserInput.nextLine();
        String PEXbox = UserInput.nextLine();
        String PESwitch = UserInput.nextLine();
        
        System.out.println("PRETORIA");
        String PRPS5 = UserInput.nextLine();
        String PRXbox = UserInput.nextLine();
        String PRSwitch = UserInput.nextLine();
        
        System.out.println("----------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------");
        
        System.out.println("CAPE TOWN");
        
        int CTXboxnumber = Integer.parseInt(CTXbox);
        int CTPS5number = Integer.parseInt(CTPS5);
        int CTSwitchnumber = Integer.parseInt(CTSwitch);
        int CTsum = CTXboxnumber + CTPS5number + CTSwitchnumber;
        System.out.println(CTsum);     
        
        System.out.println("PORT ELIZABETH");
        
        int PEXboxnumber = Integer.parseInt(PEXbox);
        int PEPS5number = Integer.parseInt(PEPS5);
        int PESwitchnumber = Integer.parseInt(PESwitch);
        int PEsum = PEXboxnumber + PEPS5number + PESwitchnumber;
        System.out.println(PEsum); 
        
        System.out.println("PRETORIA");
        
        int PRXboxnumber = Integer.parseInt(PRXbox);
        int PRPS5number = Integer.parseInt(PRPS5);
        int PRSwitchnumber = Integer.parseInt(PRSwitch);
        int PRsum = PRXboxnumber + PRPS5number + PRSwitchnumber;
        System.out.println(PRsum); 
        
        System.out.println("CITY WITH THE MOST SALES");
        System.out.println("----------------------------------------");
    }
}
