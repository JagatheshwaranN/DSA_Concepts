package dsa.revise.tree;

@SuppressWarnings("ALL")
public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        root = null;
    }

    public void insertNode(int key) {
        root = insertNodeHelper(root, key);
    }

    public Node insertNodeHelper(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertNodeHelper(root.left, key);
        } else if (key > root.key) {
            root.right = insertNodeHelper(root.right, key);
        }
        return root;
    }

    public Node searchNode(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (key < root.key) {
            return searchNode(root.left, key);
        }
        return searchNode(root.right, key);
    }

    public void deleteNode(int key) {
        root = deleteNodeHelper(root, key);
    }

    public Node deleteNodeHelper(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.key) {
            root.left = deleteNodeHelper(root.left, key);
        } else if (key > root.key) {
            root.right = deleteNodeHelper(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int minValue = minValue(root.right);
                root.key = minValue;
                root.right = deleteNodeHelper(root.right, minValue);
            }
        }
        return root;
    }

    public int minValue(Node root) {
        int minvalue = root.key;
        while (root.left != null) {
            minvalue = root.left.key;
            root = root.left;
        }
        return minvalue;
    }

    public void inorder() {
        inorderHelper(root);
    }

    public void inorderHelper(Node root) {
        if (root != null) {
            inorderHelper(root.left);
            System.out.println(root.key);
            inorderHelper(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertNode(8);
        binarySearchTree.insertNode(4);
        binarySearchTree.insertNode(1);
        binarySearchTree.insertNode(7);
        binarySearchTree.insertNode(12);
        binarySearchTree.insertNode(9);
        binarySearchTree.insertNode(14);
        binarySearchTree.inorder();
        System.out.println(STR."Data you are searching for :: \{binarySearchTree.searchNode(binarySearchTree.root, 1).key}");
        binarySearchTree.deleteNode(12);
        binarySearchTree.inorder();
    }

}
