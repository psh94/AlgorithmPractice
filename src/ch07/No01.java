package ch07;

/**
 * 문제: 자연수 이입력되면재귀함수를 이용하여 부터 까지를 출력하는 프로그램을 작성하세요
 */
public class No01 {
    public static void main(String[] args) {
        solution(3);
    }

    public static void solution(int n) {
        if (n == 0) {
            return;
        } else {
            solution(n - 1);
            System.out.print(n + " ");
        }
    }
}
