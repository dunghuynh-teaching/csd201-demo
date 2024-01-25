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

        
        Writer f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fname), "UTF-8"));

        if (choice > 0 && choice <= 10){
            SpaceShip ss = new SpaceShip();
            MessagePackageLinkedList msgrec = new MessagePackageLinkedList();
            ss.start(choice); // Start test case 1-10
            while (!ss.isEmpty()) {
                msgrec.receive(ss.next());
            }
            
            f.write(msgrec.getMessage()); 
            f.close();
            viewFile(fname);
            
        } else if (choice > 10 && choice <= 15) {
            
            SpaceShip ss = new SpaceShip();
            MessagePackageLinkedList msgrec = new MessagePackageLinkedList();
            ss.start(choice); // Start test case 1-10
            while (!ss.isEmpty()) {
                msgrec.receive(ss.next());
            }
            
            int [] mi = msgrec.getMissingIndex();
            if (mi != null){                
                for (int j = 0 ; j < mi.length; j++){
                    f.write(mi[j] + " ");
                }
            }
            f.write("\n");
            f.write("Checking missing: " + (ss.setMissingPackages(msgrec.getMissingIndex()) ? "Correct" : "Incorrect") + "\n");
            while (!ss.isEmpty()) {
                msgrec.receive(ss.next());
            }

            f.write(msgrec.getMessage());               
            f.close();
            viewFile(fname);
            
        }  else if (choice > 15 && choice <= 20) {
            
            SpaceShip ss = new SpaceShip();
            MessagePackageLinkedList msgrec = new MessagePackageLinkedList();
            ss.start(choice); // Start test case 1-10
            while (!ss.isEmpty()) {
                msgrec.receive(ss.next());
            }
            
            f.write(msgrec.getMessage()); 
            f.close();
            viewFile(fname);
            
        }   
            
        
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
        System.out.println("8. Test f8 (1 mark)");
        System.out.println("9. Test f9 (1 mark)");
        System.out.println("10. Test f10 (1 mark)");
        System.out.println("11. Test f11 (1 mark)");
        System.out.println("12. Test f12 (1 mark)");
        System.out.println("13. Test f13 (1 mark)");
        System.out.println("14. Test f14 (1 mark)");
        System.out.println("15. Test f15 (1 mark)");
        System.out.println("16. Test f16 (1 mark)");
        System.out.println("17. Test f17 (1 mark)");
        System.out.println("18. Test f18 (1 mark)");
        System.out.println("19. Test f19 (1 mark)");
        System.out.println("20. Test f20 (1 mark)");
        System.out.println("0. Exit");
        System.out.println("==============================");
        System.out.print("Enter your choice [0 --> 20]: ");
    }
}
