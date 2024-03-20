import java.util.ArrayList;
import java.util.Scanner;

/**
 * 3. 문장 속 단어
 * Q. 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분됩니다.
 */
public class No3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String str){

        /* 1. spilt로 풀기 */
        String answer = "";
        String[] words = str.split(" ");
        int length = Integer.MIN_VALUE;

        for(String word : words){
            if(word.length()>length){
                length = word.length();
                answer = word;
            }
        }

        /* 2. indexOf로 풀기 */
//        String answer = "";
//        int m = Integer.MIN_VALUE, pos; // pos는 구분자의 위치
//        while((pos = str.indexOf(' ')) != -1){ // indexOf가 -1이 나오는 경우는 찾을 수 없을 때
//            String word = str.substring(0, pos); // 한 단어
//            int len = word.length();
//            if(len>m){
//                m=len;
//                answer=word;
//            }
//            str = str.substring(pos+1);
//        }


        return answer;
    }
}
