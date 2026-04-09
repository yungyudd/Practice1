package node;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("a");
        first.next = new Node("b");
        first.next.next = new Node("c");

        System.out.println(first);

        System.out.println("1. 모든 노드 탐색하기");
        printAll(first);
        System.out.println("2. 마지막 노드 조회하기");
        Node lastNode = getLastNode(first);
        System.out.println("lastNode= "+lastNode);

        System.out.println("3. 특정 index의 노드 조회하기");
        int index = 2;
        Node index2Node = getNode(first,index);
        System.out.println("index2Node ="+index2Node.item);

        System.out.println("4. 데이터 추가하기");
        add(first, "D");
        System.out.println(first);

        add(first, "E");
        System.out.println(first);
    }
    private static void printAll(Node node){
        Node x = node;
        while (x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }
    //마지막 노드 찾기  마지막 노드 null
    private static Node getLastNode(Node node){
        Node x = node;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }
    // 특정 index 노드 찾기
    private static Node getNode(Node node, int index){
        Node x= node;
        for(int i =0; i<index; i++){
            x = x.next;
        }
        return x;
    }
    // 마지막에 데이터 추가 add
    private static void add(Node node, String param){
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
}
