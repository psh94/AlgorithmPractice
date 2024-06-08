package ch05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));

    }

    public static String solution(String str1, String str2){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for(char x : str1.toCharArray()){
            queue.offer(x);
        }
        for(char x : str2.toCharArray()){
            if(queue.contains(x)){
                if(x != queue.poll()){
                    return "NO";
                }
            }
        }
        if(!queue.isEmpty()){
            return "NO";
        }

        return answer;
    }
}
