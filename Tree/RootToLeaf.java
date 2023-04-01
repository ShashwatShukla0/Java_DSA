package Tree;

import java.util.ArrayList;

class TreeNode{
    int data;
    TreeNode left,right;

    TreeNode(int data){
        this.data = data;
    }
}


public class RootToLeaf {

    public static TreeNode insert(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
    
        if(root.data>val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
    
        return root;
    }
    
    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
    
        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(TreeNode root, ArrayList<Integer> path){

        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right==null){
            printPath(path);
        } else {
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String args[]){
        int values[] = {5,1,2,9,6,14,4,3,11,7};
        TreeNode root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        System.out.println();
        inOrder(root);
        System.out.println();
        printRoot2Leaf(root, new ArrayList<>());
  
    }
    
}