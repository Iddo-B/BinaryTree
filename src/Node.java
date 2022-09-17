import javax.print.event.PrintEvent;

public class Node {
    private Node parent;
    private Node lchild;
    private Node rchild;
    private int key;

    public Node(int _key){
        key = _key;
    }

    public int getKey(){
        return key;
    }

    public void setParent(Node _parent){
        parent = _parent;
    }

    public void setLeftChild(Node _lchild){
        lchild = _lchild;
    }

    public void setRightChild(Node _rchild){
        rchild = _rchild;
    }

    public Node getLeftChild(){
        return lchild;
    }

    public Node getRightChild(){
        return rchild;
    }

    public Node getParent(){
        return parent;
    }
}
