package ch06;

import java.util.Scanner;

public class No01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }

    public static int[] solution(int n, int[] arr){
        // 선택정렬 : 가장 작은 것을 선택해서 앞으로 보내는 정렬
        for(int i=0; i<n-1; i++){
            int idx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[idx]){
                    idx = j; // -> 결국 가장 작은 값의 인덱스가 된다.
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp; // -> 가장 작은 값과 i번째 값을 교환
        }
        return arr;
    }

}
