package Ramin_is_here;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num%2==0){
            System.out.println(num + "Is Even");
        }{
            System.out.println(num+ " is Odd");
        }
    }
}
