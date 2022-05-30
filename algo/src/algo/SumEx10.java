package algo;

public class SumEx10 {
    public static void main(String[] args) {
        System.out.println(SumEx10(4,1));
    }

    private static int SumEx10 (int number, int currentNum){
        if(number==currentNum){
            return currentNum;
        } else {
            return currentNum+currentNum*SumEx10(number,currentNum+1);
        }
    }
}
