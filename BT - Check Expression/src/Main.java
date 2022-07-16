import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap bieu thuc can check");
        String str = input.nextLine();
        String[] arr = str.split("");

        Stack<String> stack = new Stack<>();
        boolean result = checkBrackets(arr, stack);

        System.out.println(stack);
        System.out.println("Correct Expression? " + result);

    }

    public static boolean checkBrackets(String[] arr, Stack<String> stack){
        String a = "(";
        String b = ")";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(a)){
                stack.push(arr[i]);
            } else if (arr[i].equals(b)) {
                if (stack.isEmpty()) return false;
                if (stack.peek().equals(b)) return false;
                stack.pop();
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }





}
