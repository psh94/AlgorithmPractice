package ch01;

import java.util.Scanner;

/**
 * 5. 회문 문자열
 * Q. 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *    문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *    회문을 검사할 때 대소문자를 구분하지 않습니다.
 */
public class No7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }

    public static String solution(String str){
        String answer = "YES";
        //1. 기본 방법
//        str = str.toUpperCase();
//        for(int i=0; i<str.length()/2; i++){
//            if(str.charAt(i) != str.charAt(str.length()-i-1)){
//                answer = "NO";
//            }
//        }

        //2. StringBuilder 사용
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equals(tmp)){
            answer = "NO";
        }
        return answer;
    }
}
