package UASLP.ingenieria.list;

public class Iterator {
    private Node currentNode;

    public Iterator(Node currentNode) {
        this.currentNode = currentNode;
    }

    public boolean hasNext(){
        return currentNode != null;
    }

    public int next(){
        int data = currentNode.getData();
        currentNode = currentNode.getNext();
        return data;
    }


}
