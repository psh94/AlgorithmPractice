package ch05;

import java.util.Scanner;
import java.util.Stack;

public class No02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == ')'){
                while(stack.pop() != '(');
            }
            stack.push(x);
        }
        for(int i=0; i<stack.size(); i++){
            answer += stack.get(i);
        }

        return answer;
    }
}
