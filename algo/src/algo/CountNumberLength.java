package algo;

public class CountNumberLength {
    public static int CountLength (int number){

        int length =1;
        if(number>=10){
            length+= CountLength(number/10);
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.print(CountLength(1));
    }
}
