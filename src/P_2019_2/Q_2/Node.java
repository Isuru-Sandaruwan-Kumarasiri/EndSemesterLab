package P_2019_2.Q_2;

public class Node {

    private String id;
    private String className;
    private String tag;



    Node next;

    public Node(String tag,String className,String id) {
        this.id = id;
        this.className = className;
        this.next=null;
        this.tag = tag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
