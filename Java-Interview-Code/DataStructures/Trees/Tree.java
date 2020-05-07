import java.lang.System.*;

public class Tree{
    Node root;

    public Tree(int nodeValue){
        root = new Node(nodeValue);
    }

    public Tree(){
        root = null;
    }

    public static void main(String[] args){
        Tree binaryTree = new Tree(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right.right = new Node(6);
        binaryTree.root.right.left = new Node(7);

        int rightmost = binaryTree.root.right.left.getValue();

        System.out.print("This is the rightmost value in the tree: " + rightmost);
    }
}