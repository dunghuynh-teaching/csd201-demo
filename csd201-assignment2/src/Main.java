// =========================================================
// Do NOT modify this file 
// =========================================================

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    
     static void viewFile(String fname) throws Exception {
         
        
         
        File g = new File(fname);
        if(!g.exists()) {//check whether or not the file fname exists
            System.out.println(" The file " + fname + " does not exist!");
            return;
        }
        
        Reader reader =  new InputStreamReader( new FileInputStream(fname),"UTF-8");
        BufferedReader f = new BufferedReader(reader);
        String s;
        
        System.out.println(" Content of the file " + fname + ":");
        
        while((s = f.readLine()) != null )  
            System.out.println("  " + s);
        
        f.close();
    }
    
    public static void main(String args[]) throws Exception {
                
        //Display the menu contains a list of possibble choices
        printMenu();
        Scanner sca = new Scanner(System.in);
        int choice = sca.nextInt();
        sca.nextLine();
        
        String fname = "f" + Integer.toString(choice) + ".txt";            
        File checkfile = new File(fname);
        if(checkfile.exists()) checkfile.delete();

        BookServer server = new BookServer();
        BookServiceImpl service = new BookServiceImpl();
        
        server.setService(service);
        server.setFile(fname);        
        server.process(choice);                   
        viewFile(fname);
        
        
    }  
    
    private static void printMenu() {
        System.out.println("=============MENU=============");
        System.out.println("1. Test f1 (1 mark)");
        System.out.println("2. Test f2 (1 mark)");
        System.out.println("3. Test f3 (1 mark)");
        System.out.println("4. Test f4 (1 mark)");
        System.out.println("5. Test f5 (1 mark)");
        System.out.println("6. Test f6 (1 mark)");
        System.out.println("7. Test f7 (1 mark)");        
        System.out.println("0. Exit");
        System.out.println("==============================");
        System.out.print("Enter your choice [0 --> 20]: ");
    }
}
