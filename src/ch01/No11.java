package ch01;

import java.util.Scanner;

/**
 * 11. 문자열 압축
 * Q. 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 *    문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 *    단 반복횟수가 1인 경우 생략합니다.
 */
public class No11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String str){
        String answer = "";
        str = str + " ";    // 이렇게 해서 str.length()-1을 해도 끝까지 탐색한다.
        int count = 1;

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            } else {
                answer += str.charAt(i);
                if(count > 1){
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }
        return answer;
    }
    // 나의 답
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println(solution(input));
//    }
//
//    public static String solution(String str){
//        String answer = "";
//        int count = 1;
//
//        for(int i=0; i<str.length(); i++){
//            if(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                count++;
//            } else {
//                if(count == 1){
//                    answer += str.charAt(i);
//                } else {
//                    answer += str.charAt(i) + String.valueOf(count);
//                }
//                count = 1;
//            }
//        }
//        return answer;
//    }
}
