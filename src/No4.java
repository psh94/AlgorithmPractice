import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. 단어 뒤집기
 * Q. N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 */
public class No4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int count = in.nextInt();
        String[] words = new String[count];
        for(int i=0; i<count; i++){
            words[i] = in.next();
        }

        for(String word : solution(count, words)){
            System.out.println(word);
        }
    }

    public static ArrayList<String> solution(int count, String[] words){
        ArrayList<String> answer = new ArrayList<>();

        //----------------------------------------------------
        // 1. StringBuilder의 reverse 메서드를 이용
//        for(String word : words){
//            String tmp = new StringBuilder(word).reverse().toString();
//            answer.add(tmp);
//        }
        //----------------------------------------------------

        //----------------------------------------------------
        // 2. 하나씩 자리 바꾸기
        for(String word : words){
            char[] chars = word.toCharArray(); // 문자배열
            int lt = 0;
            int rt = word.length()-1;

            // lt, rt를 교환하고 lt는 +1, rt는 -1자리로 이동
            while(lt<rt){
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(chars);
            answer.add(tmp);
        }
        //----------------------------------------------------
        return answer;
    }
}
