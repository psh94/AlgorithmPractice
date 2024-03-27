import java.util.Scanner;

/**
 * 10. 가장 짧은 문자거리
 * Q. 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 */
public class No10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : solution(str,c)){
            System.out.print(x+" ");
        }
    }

    public static int[] solution(String str, char c){
        int[] answer = new int[str.length()];
        int p = 1000;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c){
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        p = 1000;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == c){
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;

    }
}
