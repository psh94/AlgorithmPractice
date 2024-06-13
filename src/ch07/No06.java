package ch07;

import java.util.*;
/**
 * 자연수 N이 주어지면 1부터 N까지의원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
 */
class No06 {
    static int n;
    static int[] ch;
    public void DFS(int L){
        if(L==n+1){
            String tmp="";
            for(int i=1; i<=n; i++){
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        }
        else{
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }
    }

    public static void main(String[] args){
        No06 T = new No06();
        n=3;
        ch=new int[n+1];
        T.DFS(1);
    }
}
