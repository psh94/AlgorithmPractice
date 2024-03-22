import java.util.Scanner;

/**
 * 5. 특정 문자 뒤집기
 * Q. 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *    특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */
public class No5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer;
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while (lt < rt) {
            if(!Character.isAlphabetic(chars[lt])) lt++;
            else if (!Character.isAlphabetic(chars[rt])) rt--;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;

                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }
}
