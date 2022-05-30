package algo;

public class SumEx9 {
    public static void main(String[] args) {
        System.out.println(SumNegativePositiveN(3, 1));
    }


    public static int SumNegativePositiveN(int number, int currentNumber) {
        if (currentNumber == number * (Math.pow(-1,number+1))) {
            return currentNumber;
        } else {
            if (currentNumber > 0) {
                return currentNumber + SumNegativePositiveN(number, (currentNumber + 1) * (-1));
            } else {
                return currentNumber + SumNegativePositiveN(number, (currentNumber - 1) * (-1));
            }
        }
    }
}

