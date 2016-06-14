
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST btree=new BST();
		btree.insert(3);
		btree.insert(1);
		btree.insert(2);
		btree.insert(5);
		btree.insert(4);
		btree.inorderTraversal(btree.root);
		//System.out.println((btree.findNode(4)!=null)?true:false);
		//System.out.println("Predecessor of 3:"+ btree.predecessor(btree.findNode(3)).data);
		//System.out.println("Predecessor of 1:"+ btree.predecessor(btree.findNode(1)));
		//System.out.println("Predecessor of 2:"+ btree.predecessor(btree.findNode(2)).data);
		//System.out.println("Predecessor of 5:"+ btree.predecessor(btree.findNode(5)).data);
		//System.out.println("Predecessor of 4:"+ btree.predecessor(btree.findNode(4)).data);

		//System.out.println("successor of 3:"+ btree.successor(btree.findNode(3)).data);
		//System.out.println("successor of 1:"+ btree.successor(btree.findNode(1)).data);
		//System.out.println("successor of 2:"+ btree.successor(btree.findNode(2)).data);
		//System.out.println("successor of 5:"+ btree.successor(btree.findNode(5)));
		//System.out.println("successor of 4:"+ btree.successor(btree.findNode(4)).data);
		
		System.out.println("After deleting...");
		btree.deleteNode(btree.findNode(2));
		btree.inorderTraversal(btree.root);
	}

}
