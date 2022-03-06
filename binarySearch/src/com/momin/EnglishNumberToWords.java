import java.text.DecimalFormat;
import java.util.Scanner;

public class EnglishNumberToWords {

    private static final String[] tensNames = {
            "",
            "",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };

    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private EnglishNumberToWords() {}

    private static String convertFrom20To99(int number) {
        String soFar;

            soFar = numNames[number % 10];
            number /= 10;

            soFar = tensNames[number % 10] + soFar;
            number /= 10;

            return soFar;
    }


    public static String convert(int number) {
        if (number == 0) { return "zero"; }
        String result;
        result = convertFrom20To99(number);
        return result;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int choice=1;
        do
        {
            if (choice == 1) {
                System.out.print("Enter a number: ");
                int n = in.nextInt();
                System.out.println(EnglishNumberToWords.convert(n));
            } else {
                System.exit(0);
            }
            System.out.print("click 1 to run again, anything else to exit:  ");
            choice=in.nextInt();
        }
        while(true);
    }
}