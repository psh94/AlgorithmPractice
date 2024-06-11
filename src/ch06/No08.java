package ch06;

import java.util.Arrays;
import java.util.Scanner;

public class No08 {

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
        // 이분검색
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n-1;

        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(arr[mid] == m){
                answer = mid+1; // 인덱스에 1을 더해야 몇 번째인지 나온다.
                break;
            }
            if(arr[mid] > m){
                rt = mid - 1; // 중간값이 찾는 값보다 크면 오른쪽을 줄인다. arr[mid] == m 인 경우는 위에서 처리했으므로 mid - 1이다.
            }else{
                lt = mid + 1; // 중간값이 찾는 값보다 작으면 왼쪽을 줄인다. arr[mid] == m 인 경우는 위에서 처리했으므로 mid + 1이다.
            }
        }
        return answer;
    }
}

/*

-------- 예시 ---------------
8 32
23 87 65 12 57 32 99 81
-----------------------------

[1] 12 23 32 57 65 81 87 99
[2] 12 23 32
[3] 32


 */

