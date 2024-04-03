package ch02;

import java.util.Scanner;

/**
 * 2.보이는 학생
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 */
public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] students = new int[count];
        for(int i=0; i<count; i++){
            students[i] = sc.nextInt();
        }
        System.out.println(solution(count, students));

    }

    public static int solution(int count, int[] students){
        int answer = 1;
        int t = students[0];

        for (int i=1; i<count; i++) {
            if(t < students[i]){
                t= students[i];
                answer++;
            }
        }
        return answer;
    }
}

