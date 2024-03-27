import java.util.Scanner;

/**
 * 9. 숫자만 추출
 * Q. 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 *    만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 *    추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 */
public class No9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static int solution(String str){
        int answer = 0;
        str = str.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(str);

        return answer;

        //Character.isDigit(str)로도 가능능


       //아스키 코드로도 가능 : 48(0)~57(9)
//        int answer = 0;
//        for(char x : str.toCharArray()){
//            if(x>=48 && x<=57){
//                answer = answer * 10 + (x-48); // 10을 곱해서 앞의 숫자를 뒤로 민다.
//            }
//        }
//        return answer;
    }
}
