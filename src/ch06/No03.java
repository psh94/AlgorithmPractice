package ch06;

import java.util.Scanner;

public class No03 {

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
        // 삽입정렬 : 각 숫자를 적절한 위치에 삽입하는 정렬
        for(int i=1; i<n; i++){
            int tmp = arr[i]; // 앞에서부터 정렬하고 싶은 숫자
            int j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > tmp){
                    arr[j+1] = arr[j]; // 뒤에서부터 너 얘보다 크냐? 크면 뒤로 가
                }else{
                    break; // 아니요 작은데요? 하면 멈추고 빠져나온다.
                }
            }
            arr[j+1] = tmp; // 작은 숫자를 만나면 그 다음에 넣어준다.
        }
        return arr;
    }

}
