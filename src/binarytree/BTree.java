package binarytree;


import java.util.LinkedList;
import java.util.Queue;

public class BTree {

    Node root;

   public void insert(int val)
   {

       if(root==null)
       {
           root=new Node(val);
       }
        else
       {
           Queue<Node> queue=new LinkedList<>();
           queue.add(root);
           while(!queue.isEmpty())
           {
               Node temp=queue.poll();
               if(temp.left==null)
               {
                   temp.left=new Node(val);
                   break;
               }
               else
               {
                   queue.add(temp.left);
               }
               if(temp.right==null)
               {
                   temp.right=new Node(val);
                   break;
               }
               else
               {
                   queue.add(temp.right);
               }
           }
       }
       System.out.println(val+" Inserted into Binary Tree");
   }


   public void preOrder(Node root)
   {
       if(root==null)
           return;
       System.out.print(root.val+" ");
       preOrder(root.left);
       preOrder(root.right);
   }
    public void postOrder(Node root)
    {
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public void inOrder(Node root)
    {
        if(root==null)
            return;

        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public int height(Node root)
    {
        if(root==null)
            return 0;
        else
        {
            int lh= height(root.left);
            int rh=height(root.right);

            int max=lh>rh?lh+1:rh+1;
            return max;
        }
    }
    public void levelOrder(Node root)
    {

        for(int i=0;i<height(root);i++)
        {
            printLevel(root,i);
        }
    }
    public void printLevel(Node root,int level)
    {
        if(root==null) return;
        if(level==0)
            System.out.print(root.val+" ");
        else
        {
            printLevel(root.left,--level);
            printLevel(root.right,level);

        }

    }

}
