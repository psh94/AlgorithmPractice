package ch07;

/**
 * 문제 : 자연수 N이 입력되면 N!를구하는프로그램을 작성하세요
 */
public class No03 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * solution(n - 1);
        }
    }

}
