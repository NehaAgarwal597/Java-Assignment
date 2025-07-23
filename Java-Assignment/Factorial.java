public class Factorial {
    public static void main(String[] args) {
        int i , num;
    //loop for 1 to 4
     for(num = 1; num<=4; num++){
         int fact = 1;
     //calculate factorial of current num
        for(i = 1; i<=num; i++){
            fact*=i;
        }
        System.out.println("Factorial of "+ num +"=" + fact);
        }
    }
}
