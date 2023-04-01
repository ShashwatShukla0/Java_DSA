package Tree;
import java.util.*;

//this is done by iteration rather than recursion and queue is used because of fifo;

class TreeNode{

    int data;
    TreeNode left,right;

    TreeNode(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}

class BinaryTree{
    int idx = -1;

    public TreeNode printTree(int arr[]){
        idx++;
        if(arr[idx]== -1){
            return null;
        }

        TreeNode newNode = new TreeNode(arr[idx]);
        newNode.left = printTree(arr);
        newNode.right = printTree(arr);

        return newNode;
    }
}

public class LevelOrder {

    public static void levelOrder(TreeNode root){
        if(root == null ){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data+" ");
                if(curr.left!= null){
                    q.add(curr.left);
                }
                if(curr.right!= null){
                    q.add(curr.right);
                }
            }

        }
    }

    public static void main(String [] args){
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

         BinaryTree tree = new BinaryTree();
         TreeNode root = tree.printTree(arr);
         System.out.println(root.data+" ");

         levelOrder(root);
    }
}

