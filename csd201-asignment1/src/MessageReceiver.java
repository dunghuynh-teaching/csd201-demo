interface MessageReceiver {
    void receive(MessagePackage pck);  
    String getMessage();  // Q1,2
    int[] getMissingIndex(); // Q3
    
}
