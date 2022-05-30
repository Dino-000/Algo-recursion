package algo;

public class FirstNumber {
    private static int FirstNumber (int number){
        if(number<10){
            return number;
        }
        return FirstNumber(number/10);
    }

    public static void main(String[] args) {
        System.out.println(FirstNumber(345));
    }
}
