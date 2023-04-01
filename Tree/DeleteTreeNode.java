package Tree;

class TreeNode{
    int data;
    TreeNode left,right;

    TreeNode(int data){
        this.data = data;
    }
}


public class DeleteTreeNode {

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

    public static TreeNode delete(TreeNode root, int key){

        if(root.data>key){
            root.left = delete(root.left, key);
        } else 
        if(root.data<key){
            root.right = delete(root.right, key);
        } 
        else {
            //case 1- no child
            if(root.left == null && root.right==null){
                return null;
            }

            //case2- 1 child
            if(root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            }

            //Case3- 2 child- first find inorder successor
            TreeNode IS = inorderSuccessor(root.right);
            root.data = IS.data;
            delete(root.right,IS.data);
        }

        return root;
    }

    public static TreeNode inorderSuccessor(TreeNode root){
        while(root.left!= null){
            root = root.left;
        }
        return root;
    }

    public static void main(String args[]){
        int values[] = {5,1,2,4,3,7};
        TreeNode root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        System.out.println();
        inOrder(root);
        System.out.println();
        delete(root,4);
        inOrder(root);
    }
    
}
