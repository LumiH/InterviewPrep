public class IsSubtree {
	/*
		given the roots of two binary search trees, determine if the second tree is a subtree of the first
	*/ 

	// node class for bst
	private static class Node {
		private int val;
		private Node left; 
		private Node right;

		public Node(int val) {
			this.val = val; 
		}
	}

// solution 
	public static boolean isSubtree(Node a, Node b) {
		// null checking 
		if (a == null && b == null) {
			return true; 
		} else if (a == null || b == null) {
			return false; 
		}

		// if same values, check for subtrees. else, use the BST property to look for 
		// b in left or right subtree of a. 
		if (b.val == a.val) {
			return sameTree(a, b); 
		} else if (b.val < a.val) {
			return isSubtree(a.left, b); 
		} else {
			return isSubtree(a.right, b); 
		}
	}

// private function that checks if two trees are equal to each other 
	private static boolean sameTree(Node a, Node b) {
		// null checking. if both null, true. else if one null, false 
		if (a == null && b == null) {
			return true; 
		} else if (a == null || b == null) {
			return false; 
		}

		// neither are null. check values and if necessary, left and right subtrees. 
		if (a.val != b.val) {
			return false; 
		} else {
			return sameTree(a.left, b.left) && sameTree(a.right, b.right); 
		}
	}
}