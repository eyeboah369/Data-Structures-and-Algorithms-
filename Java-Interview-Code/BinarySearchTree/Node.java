import java.util.*;

public class Node{
    Node left, right;   //left and right nodes of the tree
    int data;   
    Node next;        //data to be stored inside of each new node

    public Node(int data){  //constructor that initializes a new node
        this.data = data;   //data assigned to new node
        left = null;
        right = null;
    }

    public void insert(int value){  //insert function into a tree
        if(value <= data){          //if the value trying to be inserted is less than the value of data in current node
            if(left == null){       //and if the node containing data has no left child
                left = new Node(value); //place value in a new node at the left position
            }
            else{
                left.insert(value); //otherwise recursively call insert on the newfound left node
            }
        }
        else{                   //if value is greater than data at current node
            if(right == null){  //if value to right of current node is null
                right = new Node(value);    //insert value into new node on the right of the node containing data
            }
            else{
                right.insert(value);    //otherwise if current node with data has a right node call insert on that right node. 
            }
        }
    }

    public boolean contains(int value){
        if(value == data){
            return true;
        }
        else if(value < data){
            if(left == null){
                return false;
            }
            else{
                left.contains(value);
            }
        }
        else{
            if(right == null){
                return false;
            }
            else{
                right.contains(value);
            }
        }
    }

    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        System.out.print(data + " ");
        if(right != null){
            right.printInOrder();
        }
    }
}