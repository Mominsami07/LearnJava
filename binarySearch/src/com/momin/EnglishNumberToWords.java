import java.text.DecimalFormat;

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
        System.out.println(EnglishNumberToWords.convert(1));
        System.out.println(EnglishNumberToWords.convert(0));
        System.out.println(EnglishNumberToWords.convert(22));
        System.out.println(EnglishNumberToWords.convert(44));
        System.out.println(EnglishNumberToWords.convert(33));
        System.out.println(EnglishNumberToWords.convert(23));
        System.out.println(EnglishNumberToWords.convert(93));

    }
}