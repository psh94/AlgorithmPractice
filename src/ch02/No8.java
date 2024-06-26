package ch02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 8. 등수구하기
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 */
public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] scores = new int[count];
        for (int i=0; i<count; i++){
            scores[i] = sc.nextInt();
        }

        for(int x : solution(count, scores)){
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int count, int[] scores){
        int[] answer = new int[count];

        for(int i=0; i<count; i++){
            answer[i] += 1;
            for (int j=i; j<count; j++){
                if(scores[i]<scores[j]){
                    answer[i]++;
                } else if(scores[i]>scores[j]){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}

