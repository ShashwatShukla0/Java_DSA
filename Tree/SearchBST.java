package Tree;

class TreeNode{
    int data;
    TreeNode left,right;

    TreeNode(int data){
        this.data = data;
    }
}


public class SearchBST {

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

    public static boolean search(TreeNode root,int key){
        if(root == null){
            return false;
        }

        if(root.data > key){
            return search(root.left, key);
        }

        else if (root.data == key){
            return true;
        }
        else {
            return search(root.right, key);
        }

    }

    public static void main(String args[]){
        int values[] = {8,5,1,2,11,15,9,4,3,7};
        TreeNode root = null;
        int key = 2;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        System.out.println();
        inOrder(root);
        System.out.println();
        System.out.println(search(root, key));
    }
    
}
