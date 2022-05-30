package algo;

public class SumEx13 {
    public static void main(String[] args) {
        System.out.printf("%.2f",SumEx13(4,1));
    }

    private static double SumEx13(int number, int currentNum){
        if(number==currentNum){
            return 1;
        }
            return (1/currentNum)+ SumEx13(number,currentNum+1);

    }
}
