package algo;

public class BinaryConvert {
    public static void main(String[] args) {
        ConvertToBinary(71);
    }

    public static void ConvertToBinary (int number){
        if(number>=2){
            ConvertToBinary(number/2);
        }
        System.out.print(number%2); ;
    }
}
