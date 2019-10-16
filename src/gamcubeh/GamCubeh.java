/*
This program should multiply a number inputted by itself, however many times this person wishes
 */

package gamcubeh;

import java.util.Scanner;

/**
 *
 * @author hayou1838
 */
public class GamCubeh {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\nThe Super Sincere Singular Shy Strong Stylish Stupendous Exponent Machine");
        System.out.println("Input below SVP");
        Scanner StringInput = new Scanner(System.in);
        int choice;
        int number = 2;
        choice = StringInput.nextInt(); 
        System.out.println(choice);
       
        switch(choice){
            case 1:
                while (number != 4)
                    number = number * 2;
                        System.out.println(number);
                break;
            case 2:
                 while (number != 8)
                    number = number * 2;
                        System.out.println(number);
                break;
            case 3:
                System.out.println("Number to be multiplied...");
                Scanner UserBase = new Scanner(System.in);
                int base;
                base = keyedInput.nextInt();
             
                System.out.println("Number that determines how many times the previous number will be multiplied...");
            Scanner UserInput = new Scanner(System.in);
                int power;
                power = keyedInput.nextInt();
                for (int i=0; i<(power - 1); i++);
                {
                    base = base*base;
                    System.out.println(base);
                }
                break;
            case 4:
                System.out.println("Exiting...");
                break;
    }
    
}
}
