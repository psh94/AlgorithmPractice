package ch06;

import java.util.Arrays;
import java.util.Scanner;

public class No05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }

    public static String solution(int n, int[] arr){
        String answer = "U";
        // 중복 확인
        for(int i=0; i<n-1; i++){
            Arrays.sort(arr);
            if(arr[i] == arr[i+1]) {
                return "D";
            }
        }
        return answer;
    }

}
