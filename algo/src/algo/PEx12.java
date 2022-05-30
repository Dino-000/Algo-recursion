package algo;

public class PEx12 {
    public static void main(String[] args) {
        System.out.println(PEx12(2,4,1));
    }

    private static int PEx12(int x, int y , int currentNum){
        if(y==currentNum)
        {
            return x;
        } else {
            return x*PEx12(x,y,currentNum+1);
        }
    }
}
