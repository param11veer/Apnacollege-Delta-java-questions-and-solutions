import java.util.*;

public class quesfunc{

    //!Average of three numbers
    public static int average(int a, int b, int c){
        return (a+b+c)/3;
    }

    //!ODD EVEN
    public static boolean isEven(int n){
        return n%2==0;
    }

    //!Find palindrome
    public static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp/=10;
        }
        return n==rev;
    }

    //!Sum of digits in an integer
    public static int sumofdigits(int n){
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println();

            // System.out.println("Enter three numbers");
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int c = sc.nextInt();
            // System.out.println("Average of three numbers is " + average(a,b,c));

            // System.out.println("Enter a number : ");
            // int n = sc.nextInt();
            // System.out.println("Is " + n + " even? " + isEven(n));


            // System.out.println("Enter a number to check if it's a palindrome or not :- ");
            // int n = sc.nextInt();
            // System.out.println("Is " + n + " a palindrome? " + isPalindrome(n));
        
            
            System.out.println("Enter a number:-");
            int n = sc.nextInt();
            System.out.println("Sum of digits in " + n + " is " + sumofdigits(n));
        }

    }
}