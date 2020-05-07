public class Node{
    public static int value;
    public Node left, right;

    public Node(int nodeValue){
        this.value = nodeValue;
        left = right = null; 
    }

    public int getValue(){
        return Node.value;
    }
}