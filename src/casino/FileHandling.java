
package casino;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileHandling {
    public static String folderDirectory = System.getProperty("user.dir")+ "\\AccountList.txt";
    
    public static void writeFile(ArrayList<Account> AccountList){
        try{
            FileWriter writeToFile = new FileWriter(folderDirectory,false);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for(int i = 0; i < AccountList.size(); i++){
                printToFile.println(AccountList.get(i).toString());
                
            }
            printToFile.close();
            writeToFile.close();
            
        }
        catch (Exception e){
            System.out.println("Error " + e);
            
        }
    }
    public static ArrayList<Account> readFile(){
        ArrayList<Account> AccountList = new ArrayList<>();
        String lineFromFile;
        try{
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
            while((lineFromFile = read.readLine()) != null){
                String[] accountDetails = lineFromFile.split(", ");
                
                Account account = new Account(accountDetails[0], accountDetails[1], Double.parseDouble(accountDetails[2]));
                AccountList.add(account);
                
                
            }
            read.close();
        }
        catch (Exception e){
            System.out.println("Error " + e);
            
        }
        return AccountList;
    }
    
    
    
    
}
