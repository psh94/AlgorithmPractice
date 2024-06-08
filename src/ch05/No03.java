package ch05;

import java.util.Scanner;
import java.util.Stack;

public class No03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int pos : moves){
            for (int i=0; i<board.length; i++){
                if(board[i][pos-1] != 0){
                    char tmp = (char)board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && stack.peek() == tmp){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
