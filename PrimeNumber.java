public class PrimeNumber {
    public static void main(String[] args) {
      int i , num = 11;
      boolean isPrime = true;
       if(num <= 1)
       {
        isPrime = false;
       } else{
        for(i = 2; i < num; i++)
        {
            if(num % i == 0) 
           {
            isPrime = false;
            break;  
           }
         }
       }
       if(isPrime) {
        System.out.println(num + "is a Prime Number");
       } else {
        System.out.println(num + "is not Prime Number");
       }
    }
}
