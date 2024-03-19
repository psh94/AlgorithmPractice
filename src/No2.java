import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2.대소문자 변환
 * Q.대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 */
public class No2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "";
        // for(char x : str.toCharArray()){} 로도 가능
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)) == true){
                answer += Character.toLowerCase(str.charAt(i));
            } else {
                answer += Character.toUpperCase(str.charAt(i));
            }
        }
        return answer;
    }
}

