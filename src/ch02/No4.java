package ch02;

import java.util.Scanner;

/**
 * 2.가위 바위 보
 * Q.A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 *   가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
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

