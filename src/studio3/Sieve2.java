package studio3;
import java.util.Scanner;

public class Sieve2 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("How many numbers are you going to calculate?");
        int n = scan.nextInt();

        boolean[] isPrime= new boolean [n];
        for (int i=0; i<n; i++)
        {
            isPrime[i]=true;
            //System.out.println(isPrime[i]);
        }
        
        for (int i=2; i<=n+1; i++)
        {
            for (int j=i*2; j<=n+1; j=j+i)
            {
                isPrime[j]=false;   
            }
            
        }
        for (int i=0; i<n; i++)
        {
            if (isPrime[i]=true){
                System.out.println(i+1);
            }
        }

    }
}