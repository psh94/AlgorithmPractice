package ch06;

import java.util.Arrays;
import java.util.Scanner;

public class No10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    public static int solution(int n, int m, int[] arr) {
        // 마굿간 정하기(결정 알고리즘)
        Arrays.sort(arr);
        int answer = 0;
        int lt = 1;
        int rt = arr[n-1];
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) >= m){
                answer = mid;
                lt = mid + 1;
            }else{
                rt = mid - 1;
            }
        }
        return answer;
    }

    public static int count(int[] arr, int dist){
        int cnt = 1;
        int ep = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] - ep >= dist){ //
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}