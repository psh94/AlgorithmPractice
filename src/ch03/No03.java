package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }

    public static int solution(int n, int k, int[] arr){
        int answer = 0, sum = 0;

        // 초기의 합
        for(int i=0; i<k; i++){
            sum += arr[i];
        }

        // 다음 번은 더하고 이전 번은 빼기
        // 이전 답과 비교해서 더 큰 값을 저장
        for(int i=k; i<n; i++){
            sum += arr[i] - arr[i-k];
            answer = Math.max(answer, sum);
        }
        return answer;
    }

}
