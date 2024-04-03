package ch02;

import java.util.Scanner;

/**
 * 1. 큰 수 출력하기
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 */
public class No1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Integer[] numbers = new Integer[count];
        for(int i=0; i<count; i++){
            int number = sc.nextInt();
            numbers[i] = number;
        }
        System.out.println(solution(count, numbers));

    }

    public static String solution(int count, Integer[] numbers){
        String answer = Integer.toString(numbers[0]);
        for(int i=1; i<count; i++){
            if(numbers[i-1]<numbers[i]){
                answer += " " + Integer.toString(numbers[i]);
            }
        }

        return answer;
    }
}
