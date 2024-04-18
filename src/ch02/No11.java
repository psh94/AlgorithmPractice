package ch02;

import java.util.Scanner;

/**
 * 11. 임시반장 정하기
 * - 문제 생략 -
 */
public class No11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n+1][6];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<6; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, nums));

    }

    public static int solution(int n, int[][] nums) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            int cnt = 0;
            for (int j = 1; j < n+1; j++) {
                for(int k = 1; k<6; k++){
                    if(nums[i][k] == nums[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt>max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}

