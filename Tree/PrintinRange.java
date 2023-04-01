package Tree;

class TreeNode{
    int data;
    TreeNode left,right;

    TreeNode(int data){
        this.data = data;
    }
}


public class PrintinRange {

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
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void printInRange(TreeNode root, int X, int Y){
        if(root == null){
            return;
        }

        if(root.data >=X && root.data<=Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
        }
        else if(root.data>= Y){
            printInRange(root.left, X, Y);
        } else {
            printInRange(root.right, X, Y);
        }
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
        printInRange(root, 3, 8);
  
    }
    
}