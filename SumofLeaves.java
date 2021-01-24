import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{   
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    static int sum;
    static void sumofLeaves(Node root){
        if (root==null){
            return;
        }
        if(root.left==null && root.right==null){
            sum+=root.data;
        }
        sumofLeaves(root.left);
        sumofLeaves(root.right);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Node root =new Node(1);
		root.left =new Node(2);
		root.right =new Node(3);
		root.left.left =new Node(4);
		root.left.right =new Node(5);
		sum=0;
		sumofLeaves(root);
		System.out.println(sum);
	}
}
//TC->O(N)
