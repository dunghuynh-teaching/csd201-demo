package com.fptuni.csd201;

import com.fptuni.csd201.bookservice.BookServer;
import com.fptuni.csd201.bookservice.BookServiceImpl;
import com.fptuni.csd201.bookservice.BookService;

public class Main {
    
    
    
    public static void testBookService()
    {
        
        for (int i = 1; i<= 7; i++){
            BookServer server = new BookServer();
            BookService service = new BookServiceImpl();
            
            server.setService(service);
            System.out.println("===TEST " + i);
            server.process(i);
            
        }
    }
    
    public static void main(String[] args) {


        //testBookService();
    }
}
