import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();
        int end = sc.nextInt();
        for (int i = begin; i <= end; i++) {
            if (i % 3 == 0 && i % 5 != 0){
                System.out.println("Fizz");
            } else
            if (i % 3 != 0 && i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }

        }
    }
}

