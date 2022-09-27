import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=0, sum=0;
        char ans=' ';

        do {
            //prompt the user to enter a number
            System.out.print("Enter a number: ");

            //the user enter enters a number
            num = scan.nextInt();
            //read enter-key
            scan.nextLine();
            //calculate sum
            sum = sum + num;

            boolean valid=true;
            do {
                //prompt the user if they want to enter next number
                System.out.print("Do you want to enter next number (y-yes, n-no): ");
                //the user enters ans
                ans = scan.nextLine().charAt(0);

                switch (ans) {
                    case 'y','Y','n','N': valid = true; break;
                    default: valid = false;
                        System.out.println("Invalid input. please try again");
                }
                //} while (ans!='y' && ans!='Y' && ans !='n' && ans!='N');
            } while (valid == false);

        } while (ans=='y' || ans=='Y');

        //display sum
        System.out.printf("The sum is %d.\n", sum);
    }
}
