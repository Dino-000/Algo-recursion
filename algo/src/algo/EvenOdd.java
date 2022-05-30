package algo;

public class EvenOdd {
    public static void main(String[] args) {
        checkEvenOdd(10);
    }

    static void checkEvenOdd (int num){
        if(num==1){
            System.out.println("Odd");
        } if(num==2){
            System.out.println("Even");
        } else {
            checkEvenOdd(num-2);
        }
    }
}
