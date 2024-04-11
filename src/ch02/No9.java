package ch02;

import java.util.Scanner;

/**
 * 9. 격자판 최대합
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 */
public class No9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] nums = new int[count][count];
        for(int i=0; i<count; i++){
            for(int j=0; j<count; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(count, nums));

    }

    public static int solution(int count, int[][] nums) {
        int answer = 0;
        int sum1, sum2;
        for(int i=0; i<count; i++){
            sum1 = 0;
            sum2 = 0;
            for(int j=0; j<count; j++) {
                sum1 += nums[i][j];
                sum2 += nums[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 =0;
        for(int i=0; i<count; i++){
            sum1 = nums[i][i];
            sum2 = nums[i][count-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}

