
package javaapplication61;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication61 {

    public static void main(String[] args) {
         ArrayList<String> enemys_name=new ArrayList<>();
        ArrayList<String> enemys_gate=new ArrayList<>();
        FileInputStream fis=null;
        int b=0;
        int a=0;
        char[][] number_array=new char[11][13];
        try(Scanner scanner=new Scanner(new FileReader("harita.txt"))){
            while(scanner.hasNextLine()){
                String row=scanner.nextLine();
                String[]test=row.split(":");
                if(test[0].equals("Karakter")){
                     String[] enemys=row.split(":");
                    //System.out.println(enemys[1]);
                    String [] enemys1=enemys[1].split(",");
                    enemys_name.add(enemys1[0]);
                    enemys_gate.add(enemys[2]);
                }else{
                    String[] number=row.split(" ");
                    String[] number1=number[0].split(" ");
                    String text=number1[0];
                        for(int i=0;i<text.length();i++){
                            if(text.charAt(i)=='0' || text.charAt(i)=='1'){                               
                                number_array[a][b]=text.charAt(i);
                                b++;
                            }
                        }
                    a++;
                    b=0;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("dosya bulunamadi");
        }
        
        for(int i=0;i<11;i++){
            for(int j=0;j<13;j++){
                System.out.print(number_array[i][j]);
            }
            System.out.println("\n");
        }
        try{
            fis = new FileInputStream("harita.txt");
            int deger;
            String s="";
            String[][] array=new String[11][13];
            int i,j=0;
            while ((deger =  fis.read()) != -1) {
                
                if((char) deger=='0' || (char) deger=='1'){
                    
                } 
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        for(int i=0;i<enemys_name.size();i++){
            System.out.println(enemys_name.get(i));
            System.out.println(enemys_gate.get(i));
        }
        
        deneme deneme=new deneme(number_array,enemys_name,enemys_gate);
        deneme.start();
        deneme.setVisible(true);

    }
    
}
