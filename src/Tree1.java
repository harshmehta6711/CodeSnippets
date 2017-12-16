public class Node {
	int data=0;
  	Node left,right;
  
  public Node(int num) {
  	data=num;
    left=right=null;
  
  }
}


public class BinaryTree {	
  Node root;
    
  public BinaryTree(int num) {
  	root=new Node(num);
  }
  
  public BinaryTree() {
  	root=null;  
  }  
  
  public static void main(String[] args)
  {
  	BinaryTree bt=new BinaryTree(5);
    bt.root.right=new Node(10);
    bt.root.left=new Node(12);
    System.out.println("Success");
  }
}
