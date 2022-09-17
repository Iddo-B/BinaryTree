public class BinaryTree {

    private Node root;

    public Node search(int key){

        Node x = root;
        
        while(x != null && x.getKey() != key){
            x = x.getLeftChild();
        }

        return x;

    }

    public void delete(Node a){
        if(a.getParent() != null) a.getParent().setLeftChild(a.getLeftChild());
        else root = a.getLeftChild();

        if(a.getLeftChild() != null) a.getLeftChild().setParent(a.getParent());

    }

    // OK if the list is empty, but later.
    public void insert(Node a){
        a.setLeftChild(root);
        if(root != null) root.setParent(a);
        root = a;
        a.setParent(null);


    }
    
}
