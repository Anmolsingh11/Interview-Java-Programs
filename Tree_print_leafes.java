/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_programs;

/**
 *
 * @author Wolf
 */
public class Tree_print_leafes {
  public static void main(String [] args)
  {
     // let's create a binary tree
    TreeNode d = new TreeNode("d");
    TreeNode e = new TreeNode("e");
    TreeNode g = new TreeNode("g");
    TreeNode k = new TreeNode("k");

    TreeNode c = new TreeNode("c", d, null);
    TreeNode h = new TreeNode("h", k, null);

    TreeNode b = new TreeNode("b", c, e);
    TreeNode f = new TreeNode("f", g, h);

    TreeNode root = new TreeNode("a", b, f);

    // print all leaf nodes of binary tree using recursion
    System.out
        .println("Printing all leaf nodes of binary tree in Java (recursively)");
    printLeaves(root); 
  }
  private static class TreeNode {
    String value;
    TreeNode left;
    TreeNode right;

    TreeNode(String value) {
      this.value = value;
    }

    TreeNode(String data, TreeNode left, TreeNode right) {
      this.value = data;
      this.left = left;
      this.right = right;
    }

    boolean isLeaf() {
      return left == null ? right == null : false;
    }
  }
  
   public static void printLeaves(TreeNode node) {
    // base case
    if (node == null) {
      return;
    }

    if (node.isLeaf()) {
      System.out.printf("%s ", node.value);
    }

    printLeaves(node.left);
    printLeaves(node.right);

  }
}


