import java.util.Scanner;

public class restoscreen{
    public static void main (String [] args){
        Scanner inp = new Scanner (System.in);

        int choice, cho, ice;


        do{

          choice = 0;
          cho = 1;
          ice = 0;

          System.out.print("========================================================\n");
          System.out.println("            Welcome to DineFlow Restaurant \n           your dining experience, organized\n");
          System.out.print("                      [1] Dine in \n\n                      [2]Booking\n\n                      [3]Check Reviews\n");
          System.out.print("========================================================\n");
          choice = inp.nextInt();
            if(choice == 0 || choice > 3){
                System.out.println(" ");
                System.out.println("Please only select the right numbers, thank you.");
            }
            else{
                cho = 0;
            }

       }while(cho != ice);



        
    }

}


