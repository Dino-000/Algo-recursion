package algo;

public class SumEx11 {
    public static void main(String[] args) {
        System.out.println(SumEx11(4,1));
    }

    private static double SumEx11(int number, int currentNum){
        if(number==currentNum){
            return Math.pow(currentNum,2);
        } else {
            return Math.pow(currentNum,2 )+ SumEx11(number,currentNum+1);
        }
    }
}
