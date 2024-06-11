package ch06;

import java.util.Scanner;

public class No04 {

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

    public static int[] solution(int n, int m, int[] arr){
        //Least Recently Used
        int[] cache = new int[m];
        for(int x : arr){
            int pos = -1;
            for(int i=0; i<m; i++){
                if(x == cache[i]){
                    pos = i;
                } // -> 캐시에 이미 있는 값이면 그 위치를 기억
            }
            if(pos == -1){
                for(int i=m-1; i>=1; i--){
                    cache[i] = cache[i-1];
                } // -> 캐시에 없는 값이면 뒤로 밀고
            }else{
                for(int i=pos; i>=1; i--){
                    cache[i] = cache[i-1];
                } // -> 캐시에 있는 값이면 그 위치로 이동
            }
            cache[0] = x; // -> 현재 작업은 항상 제일 앞에 온다.
        } // for
        return cache;
    }

}
