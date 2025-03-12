package library;

import java.util.*;

//complete this class - 3.5 pt
public class BST<T extends Comparable<T>>  { //your code
  
  private static class BSTNode<T> {
      private T data;
      private BSTNode<T> leftChild;
      private BSTNode<T> rightChild;
      
      public BSTNode(T data) {
          this.data = data;
          leftChild = rightChild = null;
      }
      
      public String toString() {
          return data.toString();
      }
  }
  
  private BSTNode<T> root;
  
  //Setup for insertion
  public void insert(T d) {
      root = recursiveInsert(root,d);
  }
  //inserting recursively by comparing
  private BSTNode<T> recursiveInsert(BSTNode<T> node, T d) {
	  if (node == null) {
	        return new BSTNode<>(d);
	  }
	        if (d.compareTo(node.data) < 0) {
	        	node.leftChild = recursiveInsert(node.leftChild,d);
	   
	        } else {
	      
	        	node.rightChild = recursiveInsert(node.rightChild, d);
	        }
	return node;
	}
	  
  

 

  //BST traversal that creates an arraylist of sorted nodes' data
  public ArrayList<T> bstTraversal() {
	  
	  ArrayList<T> sortedData = new ArrayList<T>();
	  recursiveTraversal (root, sortedData);
	  return sortedData;
	  
  }
  
  //Recursive transversal of arraylist and node 
  private void recursiveTraversal(BSTNode<T> node, ArrayList<T> sortedData) {
	if (node != null) { 
		recursiveTraversal(node.leftChild, sortedData);
        sortedData.add(node.data);
        recursiveTraversal(node.rightChild, sortedData);
	}
  }  
}


