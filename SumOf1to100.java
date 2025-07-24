public class SumOf1to100 {
    public static void main(String[] args){
     int i , num = 100;
     int sum = 0;
     for(i = 1; i <= num; i++)
     {
        sum = sum + i;
    }
    System.out.println("Sum of first 100 num is :" +sum);
}
}