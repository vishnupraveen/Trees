package binarytree;

import java.util.Scanner;

public class BTreeImpl {

    public static void main(String[] args) {

        BTree b=new BTree();
        Scanner sc=new Scanner(System.in);
        for (int i = 10; i <=70 ; i+=10) {
        b.insert(i);
           }
        System.out.println("Pre Traversal is");
        b.preOrder(b.root);
        System.out.println("\nIn Traversal is");
        b.inOrder(b.root);
        System.out.println("\nPost Traversal is");
        b.postOrder(b.root);
        System.out.println("\nLevel Traversal is");
        b.levelOrder(b.root);

    }
}
