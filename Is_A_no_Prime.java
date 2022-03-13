import java.util.*;
  
  public class Is_A_no_Prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();
      int flag = 0;
      for(int i = 2; i*i<num; i++){
        if(num%i == 0){
            flag = 1;
        }
      }
      if(flag == 0){
          System.out.println("prime");
      } else{
          System.out.println("not prime");
      }
   }
  }

// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.