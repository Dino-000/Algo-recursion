package algo;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseInt(123);
    }
    public static void ReverseInt(Integer number) {
        System.out.print(number%10);
        if(number>10){
        ReverseInt(number/10);
        }
    }


}
