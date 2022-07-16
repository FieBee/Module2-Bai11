import java.util.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi muon check Palindrome: ");
        String str = input.nextLine();
        String[] arr = str.split("");


        Stack <String> stacks = new Stack<>();
        Queue <String> queues = new LinkedList<>();


        System.out.println(pushElementToStack(arr, stacks));
        System.out.println(pushElementToQueue(arr, queues));

//        System.out.println(stacks.peek());
//        System.out.println(queues.peek());

        boolean result = checkPalindrome(stacks, queues);
        System.out.println("Is Palindrome? "+result);

    }

    public static Stack<String> pushElementToStack(String[] arr, Stack<String> stack){
        for (String s : arr) {
            stack.push(s);
        }
        return stack;
    }


    public static Queue<String> pushElementToQueue(String[] arr, Queue<String> queue){
        Collections.addAll(queue, arr);
        return queue;
    }

    public static boolean checkPalindrome(Stack<String> stack, Queue<String> queue){
        boolean checkTheSame = stack.peek().equals(queue.remove());

        while (!stack.isEmpty()){
            if (checkTheSame){
                stack.pop();
            }else {
                return false;
            }
        }
        return true;
    }

}
