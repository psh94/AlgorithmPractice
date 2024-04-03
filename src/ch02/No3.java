package ch02;

import java.util.Scanner;

/**
 * 3.가위 바위 보
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 */
public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] a = new int[count];
        int[] b = new int[count];
        for(int i=0; i<count; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<count; i++){
            b[i] = sc.nextInt();
        }
        for (char x : solution(count, a, b)){
            System.out.println(x);
        }
    }

    public static char[] solution(int count, int[] a, int[] b){
        char[] answer = new char[count];

        for (int i=0; i<count; i++) {
            if(a[i] == b[i]){
                answer[i] = 'D';
            } else {
                if((a[i] == 1 && b[i] == 3) || // A가 가위
                    (a[i] == 2 && b[i] == 1) ||
                    (a[i] == 3 && b[i] == 2)){
                    answer[i] = 'A';
                } else {
                    answer[i] = 'B';
                }
            }
        }
        return answer;
    }
}

