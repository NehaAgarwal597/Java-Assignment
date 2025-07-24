public class Fibonacci {
    public static void main(String[] args) {
        int i, num1 = 0, num2 = 1, num3 = 1;
    
      for(i = 1; i <=100; i++){
       System.out.println(num1 + ",");
        num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
     }
   }
}
