package Tree;
//here we will do with 2 methods, first O(n^2) and then using O(n).


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

    public TreeNode printTree(int arr[]){  //this is O(n^2)
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

class TreeInfo{
    int ht;
    int diam;

    TreeInfo(int ht, int diam){
        this.ht = ht;
        this.diam = diam;
    }
}



public class DiameterTree {

    public static TreeInfo diameter(TreeNode root){

        if(root == null){
            new TreeInfo(0,0);
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int myH = Math.max(left.ht, right.ht)+1;

        int dam1 = left.diam;
        int dam2 = right.diam;
        int dam3 = left.ht + right.ht + 1;
        
        int myDiam = Math.max(Math.max(dam1,dam2), dam3);

        TreeInfo myInfo = new TreeInfo(myH, myDiam);
        return myInfo;
    }

    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftSum = height(root.left);
        int rightSum = height(root.right);

        int maxH = Math.max(leftSum, rightSum)+1;

        return maxH;
    }

    public static int diameterTree(TreeNode root){
        if(root == null){
            return 0;
        }

        int diam1 = diameterTree(root.left);
        int diam2 = diameterTree(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    public static void main(String [] args){
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

         BinaryTree tree = new BinaryTree();
         TreeNode root = tree.printTree(arr);
         System.out.println(height(root));
         System.out.println(diameterTree(root)+" ");

         System.out.println("In less Complexity: ");
         System.out.println(diameter(root).diam);

    }
}

