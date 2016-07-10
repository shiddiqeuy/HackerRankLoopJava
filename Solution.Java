import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.io.*; 
import java.util.regex.*;

public class Solution {

      
    
    public static void main(String[] args) throws Exception  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //shiddiq started to code 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str; 
            //System.out.println("Enter lines of text."); 
            //System.out.println("Enter 'stop' to quit."); 
        int iteration=0;
        int indexstopper=0;
        List<String> listOfString = new ArrayList<String>();
        List<String> listOfTestcase = new ArrayList<String>();
         System.out.println("=========================================");
         System.out.println("enter first looping");
         System.out.println("=========================================");
       
        try{
            do { 
            str = br.readLine(); 
            //System.out.println(str); 
            if (iteration == 0){
            System.out.println("test case = "+str); 
            }
            listOfString.add(str);
            iteration++;
            } while(str!=null); 
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
        indexstopper=iteration-2;
        System.out.println("number of iteration = "+iteration);
        System.out.println("number of line will be printed = "+indexstopper);
        //second loop
        System.out.println("=========================================");
        System.out.println("enter second looping");
        System.out.println("=========================================");
         try{
            
           for (int i = 0; i < listOfString.size(); i++) {
			//System.out.println(listOfString.get(i));
               if(i!=0 && i<listOfString.size()-1 ){                 
                        //System.out.println("test case = "+listOfString.get(i)); 
                   listOfTestcase.add(listOfString.get(i));
               }
		}
        }catch(Exception e){
            e.printStackTrace();
            
        }
        System.out.println("=========================================");
        System.out.println("enter third looping");
        System.out.println("=========================================");
        System.out.println("number of test case = "+listOfTestcase.size()); 
        try{
            
           for (int i = 0; i < listOfTestcase.size(); i++) {
			//System.out.println(listOfString.get(i));
              // if(i!=0 && i<listOfTestcase.size()-1 ){                 
                        System.out.println("test case = "+listOfTestcase.get(i)+" a = "+listOfTestcase.get(i).split()); 
                   //listOfTestcase.add(listOfString.get(i));
              // }
		}
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
    }
}
