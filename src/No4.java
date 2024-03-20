import java.util.ArrayList;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input = in.nextInt();
        ArrayList<String> strs = new ArrayList<>();
        for(int i=0; i<input; i++){
            String str = in.nextLine();
            strs.add(str);
        }

        System.out.println(solution(input));
    }

    public static void solution(ArrayList<String> strs){

    }
}
