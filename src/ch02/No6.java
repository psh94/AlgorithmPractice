package ch02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. 뒤집은 소수
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 */
public class No6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] nums = new int[count];
        for (int i=0; i<count; i++){
            nums[i] = sc.nextInt();
        }
        for (int x: solution(count, nums)){
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> solution(int count, int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<count; i++){
            int tmp = nums[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }
        return answer;
    }

    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

