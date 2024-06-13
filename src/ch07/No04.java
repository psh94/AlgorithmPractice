package ch07;

/**
 * 문제 :
 * 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13이 출력된다.
 */
public class No04 {

    static int[] fibo;
    public static void main(String[] args) {
        int n = 100;
        fibo= new int[n+1];
        solution(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public static int solution(int n) {
        if(fibo[n]>0){
            return fibo[n];
        } // 이미 계산한 값이면 다시 계산하지 말고 저장된 리턴한다. (메모이제이션)

        if (n == 1 || n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = solution(n-1) + solution(n-2);
        }
    }

}
