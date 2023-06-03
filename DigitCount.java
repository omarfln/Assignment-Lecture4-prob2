// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DigitCount {


    public static void main(String[] args) {
        int digitCount = countDigitsRec(613809);
        System.out.println("Digit count is: " + digitCount);
    }

    public static int countDigitsRec(int n){
        if (n==0){
            return 0;
        }
        return 1 + countDigitsRec(n/10);
    }


}