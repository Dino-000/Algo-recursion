package algo;

public class Pn {
    public static int P(int n, int multiplier,int result){
        if((2*n+1)==multiplier)
        {
            return result*(2*n+1);
        }
        return result * (multiplier * P(n, multiplier + 2, result));
    }

    public static void main(String[] args) {
        System.out.println(P(2,1,1));;
    }
}
