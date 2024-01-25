public class MessagePackageLinkedList implements MessageReceiver{

    private MessagePackageNode head, tail;
    
    public MessagePackageLinkedList() {
        head = null;
        tail = null;

    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
        tail = null;
    }
 
    public void addToHead(MessagePackage x) {
        
    }

    public void addToTail(MessagePackage x) {
        
        
    }

    public void addAfter(MessagePackageNode p, MessagePackage x) {
        
    }

    public String traverse(){
        
        String content = "";        
        return content;
    }
    

    public String getMessage() {
                      
        return traverse();
    }

    public int[] getMissingIndex(){
               
        return null;
    }

    
    public void receive(MessagePackage pck) {
        addToTail(pck);
    }
    

}
