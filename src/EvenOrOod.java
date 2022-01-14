import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class EvenOrOod {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number =input.nextInt();

        if(number%2==0)
            System.out.println(number +" is Even.");
        else
            System.out.println(number+" is Odd.");
    }
}
