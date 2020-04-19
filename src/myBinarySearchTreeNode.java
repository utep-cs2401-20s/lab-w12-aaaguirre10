class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;

  myBinarySearchTreeNode(int inValue){
    // created a new node with empty child pointers
    myValue = inValue;
    left = null;
    right = null;
  }

  myBinarySearchTreeNode(int[] A){
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.
    myValue = A[0]; //This is initializing the root of tree
    //iteration of the array
    for(int i = 1; i < A.length; i++){
      this.insert(A[i]);
    }

  }

  public void insert(int inValue) {
    // This method takes a new integer as input and decides
    // if it should be place:
    //    * as the left child,
    //    * as the right child,
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken.
    if(inValue > myValue) {//this is for the right side of the tree
      if(right == null) {
        right = new myBinarySearchTreeNode(inValue);
      } else {
        right.insert(inValue);
      }
    } else if(inValue < myValue) {//this is for the left side of the tree
      if(left == null) {
        left = new myBinarySearchTreeNode(inValue);
      } else {
        left.insert(inValue);
      }
    } else {//If the value already exists in the tree
      System.out.println("Value already exists in the tree");
    }
  }

  public int height() {
    // This method recursively calculates the height of the entire (sub)tree.
    // This method will take O(n) time
    int RH = 0;
    int LH = 0;
    if(right != null) {
      RH = right.height() + 1;
    }
    if( left != null) {
      LH = left.height() + 1;
    }
    if(RH < LH) {
      return LH;
    } else {
      return RH;
    }
  }

  public int depth(int search){
    // This method recursively calculates the depth of a given search value.
    // If the given value is not in the tree, this method returns -1.
    // Note that if the tree is a proper BST, this method should complete in O(log n) time.
    // Additionally, remember that the depth is the number of nodes on the path from a node to the root
    // (i.e. the number of the recursive calls).
    if(search < myValue) {
      if(left == null) {
        return -1;
      }
      return left.depth(search) + 1;
    }
    if(search > myValue) {
      if(right == null) {
        return -1;
      }
      return right.depth(search) + 1;
    }
    if(search == myValue) {
      return 0;
    }
    return -1;
  }
  // This method recursively calculates the number of nodes in the (sub)tree.
  public int size() {
    int sum = 0;
    //recursive call
    if(left != null) {
      sum+= left.size();
    }
    if(right != null) {
      sum+= right.size();
    }
    return sum + 1;
  }

  // Utility function included so you can debug your solution.
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }

}
