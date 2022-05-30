package algo;

public class SumN {
    public static void main(String[] args) {
        System.out.println(SumN(2,1));
    }

    public static int SumN (int number, int currentNumber){
        if (currentNumber== number*2+1)
        return currentNumber;
        else
            return number + SumN(number,currentNumber+2);
    }
}
