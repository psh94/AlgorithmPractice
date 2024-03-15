import java.util.Scanner;

/**
 * 1. 문자 찾기
 * Q.한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 */
public class no1 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char c = in.next().charAt(0);

        System.out.println(solution(str, c));
    }

    public static int solution(String str, char c){
        int count = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(int i=0; i<str.length(); i++){
            Character strChar = str.charAt(i);
            if(strChar.equals(c)){
                count++;
            }
        }
//        -> toCharArray를 이용해도 가능
//        for(char x : str.toCharArray()){
//            if(x == c){
//                count++;
//            }
//        }

        return count;
    }

}