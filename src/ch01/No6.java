package ch01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. 중복 문자 제거
 * Q. 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *    중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */
public class No6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }

    public static String solution(String str){
        String answer = "";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }
}
