
package games;
import java.util.Random;
import java.util.Scanner;

public class Games {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random N = new Random();
        Scanner Keyboard = new Scanner (System.in);
        
        
        int x=0,i=0,comp=0,acump=0,comi=0,acumi=0,limit= 0;
        
        System.out.println("Place, Type a randon limit number to genered the list: ");
        limit = Keyboard.nextInt();
        
        for (i=1;i<=limit;i++){
        x=(int)(N.nextDouble()* 10 + 1);
        //System.out.println(x); 
        
        if (x % 2 == 0){
            comp = comp + 1;
            acump = acump + x;
            System.out.println(x + "es par");
        
        } else{
            comi = comi +1 ;
            acumi = acumi +x ;
            System.out.println(x +"es impar"); 
        }
        }

        System.out.println("total pares"+ comp);
        System.out.println("suma pares"+ acump);
        System.out.println("total impares"+ comi);
        System.out.println("suma impares"+ acumi); 
        
        
        //dados
        Random D = new Random();
        int d1= 0, d2 = 0;
        d1=(int)(D.nextDouble()* 6 + 1);
        d2=(int)(D.nextDouble()* 6 + 1);
        System.out.println(d1);
        System.out.println(d2);
    }
    
}
