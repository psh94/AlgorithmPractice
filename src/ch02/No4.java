package ch02;

import java.util.Scanner;

/**
 * 4.가위 바위 보
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 */
public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int x : solution(count)){
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int count){
        int[] answer = new int[count];

        answer[0] = 1;
        answer[1] = 1;
        for(int i=2; i<count; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;
    }
}

