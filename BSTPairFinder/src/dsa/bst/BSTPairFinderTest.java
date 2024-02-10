package dsa.bst;

public class BSTPairFinderTest {
	public static void main(String[] args) {

		BinarySearchTree bst = BSTUtils.sampleBST();

		BSTPairFinder pairFinder = new BSTPairFinder(bst, 130);

			
		pairFinder.findPairs();

	}

}
