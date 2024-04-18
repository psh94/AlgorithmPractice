package ch02;

import java.util.Scanner;

/**
 * 12. 멘토링
 * 현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.
 * 멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.
 * 선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
 * 만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.
 * M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.
 */
public class No12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, m, arr));

    }

    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;

        /**
         * 1,2,3,4번의 총 4명의 학생들, 3번의 시험이 있다고 해보자.
         * 1번 학생과 1,2,3,4번 학생의 등수를 시험 횟수만큼 비교해야 한다.
         * 2, 3, 4번 학생도 마찬가지로 반복한다.
         *
         * 3번 학생과 1번 학생을 비교한다고 해보자. (첫번째 반복문 i=2, 두번째 반복문 j=0)
         * 3번 학생과 1번 학생의 등수를 찾아서 비교하기 위해 반복문이 한번 더 돌고(0부터 3까지)
         * 시험 횟수만큼 더 반복해야 하기 때문에 반복문이 한번 더 돈다(0부터 2까지)
         */

        // 학생 번호는 1부터 시작한다.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) {
                            pi = s;
                        }
                        if (arr[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }
}

