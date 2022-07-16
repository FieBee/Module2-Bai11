import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so can chuyen");
        int number = input.nextInt();

//        Stack stack = new Stack();
//        getStack(stack, number);
//        System.out.println(stack);

//        String result = getBinary(stack);
//        System.out.println(result);

        System.out.println(getCecimal(number));
    }

    public static Stack getStack(Stack stack,int number){
        int track1 ;
        int track2;
        while (number != 0){
            track2 = number / 2;
            track1 = number % 2;
            if (track1 == 0){
                stack.push(track1);

            }else {
                stack.push(track1);
            }
            number = track2;
        }
        return stack;
    }

    public static String getBinary(Stack stack){
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()){
            str.append(stack.peek());
            stack.pop();
        }
        return str.toString();
    }

    public static int getCecimal(int binary){
        int result;
        result = Integer.parseInt(String.valueOf(binary),2);
        return result;
    }
}
