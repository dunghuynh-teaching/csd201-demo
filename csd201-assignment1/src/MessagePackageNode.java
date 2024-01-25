public class MessagePackageNode {

    MessagePackage info;
    MessagePackageNode next = null;

    MessagePackageNode() {
    }

    MessagePackageNode(MessagePackage info, MessagePackageNode nextNode) {
        this.info = info;
        next = nextNode;
    }

    MessagePackageNode(MessagePackage info) {
        this(info, null);
    }

    public MessagePackage getInfo() {
        return info;
    }

    public void setInfo(MessagePackage info) {
        this.info = info;
    }

    public MessagePackageNode getNext() {
        return next;
    }

    public void setNext(MessagePackageNode next) {
        this.next = next;
    }
}
