package ch06;

import java.util.Scanner;

public class No02 {

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
        // 버블정렬 : 인접한 두 수를 비교해서 큰 수를 뒤로 보내는 정렬
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp; // -> 두 수를 교환, 큰 수를 뒤로 보냄, 반복하면 뒤에서부터 큰 수가 채워짐
                }
            }
        }
        return arr;
    }

}
