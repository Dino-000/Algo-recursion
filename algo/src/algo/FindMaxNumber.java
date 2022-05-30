package algo;

public class FindMaxNumber {
    public static void main(String[] args) {
        System.out.println(MaxNum(1243));
    }
    public static int MaxNum (int number){
        int max = number%10;
       if(number>10) {
            if(number%10< MaxNum(number/10)){
                max = MaxNum(number/10);
            }
        }
        return max;
    }
}
