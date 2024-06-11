package ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }

    public static ArrayList<Integer> solution(int n, int[] arr){
        // 장난꾸러기
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<n; i++){
            if(arr[i] != tmp[i]){
                answer.add(i+1);
            }
        }
        return answer;
    }

}
