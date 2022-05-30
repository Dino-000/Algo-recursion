package algo;

public class GreatestCommonDivisor {

    private static int GCD (int numberA,int numberB){
        if(numberB==0){
            return numberA;
        }
        if (numberA%numberB ==0){
            return numberB;
        }
        return GCD(numberB,numberA%numberB);
    }

    public static void main(String[] args) {
        System.out.println(GCD(4,6));
    }
}
