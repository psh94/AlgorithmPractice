package ch06;

import java.util.Arrays;
import java.util.Scanner;

public class No09 {

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

    public static int solution(int n, int m, int[] arr){
        // 뮤직비디오(결정알고리즘)
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // 최소 크기
        int rt = Arrays.stream(arr).sum(); // 최대 크기
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= m){
                answer = mid;
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }
        return answer;
    }

    private static int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0; // cnt : DVD 개수, sum : 비디오 용량 합
        for(int x : arr){
            if(sum + x > capacity){ // 용량 초과
                cnt++;              // DVD 개수 증가
                sum = x;            // 새로운 DVD에 x를 넣는다.
            }else{
                sum += x;
            }
        }
        return cnt;
    }
}
/*
예시
-----------------------
9 3
1 2 3 4 5 6 7 8 9
-----------------------
DVD 한 장의 용량은 최소 9, 최대 45
[1] DVD 용량 : 27, 1 2 3 4 5 6 / 7 8 9 -> 2 용량 줄여!
[2] DVD 용량 : 14, 1 2 3 4 / 5 6 / 7 / 8 / 9 -> 5 용량 늘려!
[3]

 */