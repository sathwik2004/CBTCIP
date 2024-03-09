import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        Guess();
    }
    public static void Guess(){
        Scanner input = new Scanner(System.in);
        int guessnumber =  1 + (int) (100  * Math.random());
        int trails, usernumber;
        System.out.print("Enter How many Trails dou you want ? ");
        trails = input.nextInt();
        int i;
        for(i=0; i<trails; i++){
            System.out.print("Enter the number : ");
            usernumber = input.nextInt();
            System.out.println();
            System.out.println("Hold on for a second Let the computer checks the entered number");
            System.out.println();
            if(usernumber == guessnumber){
                System.out.println("Wonderful, You have guessed the number!");
                break;
            } else if(usernumber > guessnumber && i!= trails - 1){
                System.out.println("Your Number is higher than the  guessed number Let's try again");
            } else if(usernumber < guessnumber && i!= trails - 1){
                System.out.println("Your Number is smaller than the  guessed number Let's try again");
            }
        }
        if(i == trails){
            System.out.println("Your have reached the maximum trails.");
            System.out.println("The number you was supposed to be guess is : " + guessnumber);
        }
        System.out.println("Thank you for playing");
    }
}