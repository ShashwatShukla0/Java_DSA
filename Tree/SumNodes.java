package Tree;


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

public class SumNodes {

    public static int sumNode(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftSum = sumNode(root.left);
        int rightSum = sumNode(root.right);

        return leftSum+rightSum+root.data;
    }

    public static void main(String [] args){
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

         BinaryTree tree = new BinaryTree();
         TreeNode root = tree.printTree(arr);
         System.out.println(sumNode(root)+" ");
    }
}
