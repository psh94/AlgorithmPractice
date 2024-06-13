package ch07;

// 이진트리 DFS
public class No05{
    Node root;
    public static void main(String args[]) {
        No05 tree=new No05();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);
    }
    public void DFS(Node root){
        if(root==null)
            return;
        else{
            // 가지를 새로운 root로 보고 DFS를 수행한다.
            //System.out.print(root.data+" "); // 전위순회
            DFS(root.lt);
            //System.out.print(root.data+" "); // 중위순회
            DFS(root.rt);
            //System.out.print(root.data+" "); // 후위순회
        }
    }
}


