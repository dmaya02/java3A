
package parcial;

import java.util.Scanner;

public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     int i=1, con = 0, a=0,n;
        char x,y;
        n=nombre.getText();
        z=letra.getText();
        y = z.charArt(0);
        System.out.println(" "+y);
        a= n.length();
        System.out.println(" "+a);
        for (i=1 ; i<=a ; i++){
        x =n.charArt(i-1);
        if (x==y){
            con++;
            String sobra = n.substring(0,i);
            
            principal= sobra + "xyz"+;
            fin=principal;
            
        }
        }
}