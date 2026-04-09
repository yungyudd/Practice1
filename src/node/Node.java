package node;

public class Node {
    //저장할 데이터
    Object item;

    //연결할 노드의 참조
    Node next;

    public Node(Object item){
        this.item = item;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");

        while(x != null){
            sb.append(x.item);
            if(x.next != null){
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
