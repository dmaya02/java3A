
package juego_f;

import java.util.Scanner;


public class Juego_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entradas y validacion de jugadores
        int num_jugadores=3,opcion,j=0,numcasillas=0,i=0,suma=0;
        int[ ] sump = new int[4];
       
        String respuesta_U="";
        //char[]num_jugadores=new char[num_jugadores];
        //Random dados_aleatorios=new Random();
        //dado1= (int)(Math.random()*6);
        //int dado2= 1 + dados_aleatorios.nextInt(6);
        //suma_dados=dado_1+dado_2;
        
        Scanner reader=new Scanner(System.in);
        do {
                System.out.println("#######################################");
                System.out.println("");
                System.out.println("############  CARRERA NUMERICA  ###########");
                System.out.println("##################PLAY#################");
                System.out.println("");
                System.out.println("INGRESE NUMERO DE JUGADORES            ");
                System.out.println("");
                
                if(num_jugadores>4 || num_jugadores<2){
                System.out.println("---------------------------------------");
                System.out.println("//////////////////////////////////////////////////////////////////");    
                System.out.println("░░░░░░░░░░░░░  ADVERTENCIA ░░░░░░░░░░░ ▓");
                System.out.println("▓El numero minimo de jugadores es de dos▓");
                System.out.println("▓y el maximo de jugadores es cuatro.    ▓");
                System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"); 
                }
        


        num_jugadores=reader.nextInt();
        
        }while(num_jugadores<2 || num_jugadores>4); //ciclo do-while
      
        //Menú
        do{
        System.out.println("#######################################");
        System.out.println("");
        System.out.println("************CARRERA NUMERICA***********");
        System.out.println("********** NIVEL DE DIFICULTAD*********");
        System.out.println("");     
        System.out.println("Principiante:        1");
        System.out.println("Intermedio:          2");
        System.out.println("Avanzado:            3");
        System.out.println("");  
        System.out.println("#######################################");

        opcion=reader.nextInt();
        switch(opcion){
            case 1:
                System.out.println("---------------------------------------");
                System.out.println("***************************************"); 
                System.out.println("♥ ♥ ♥ ♥ ♥ Nivel Principiante ♥ ♥ ♥ ♥ ♥ ");
                System.out.println("***************************************");
                System.out.println("---------------------------------------");                
                numcasillas=20;
                
                break;
            case 2:
                System.out.println("---------------------------------------");
                System.out.println("***************************************"); 
                System.out.println("↑ ↑ ↑ ↑ ↑ ↑ Nivel Intermedio  ↑ ↑ ↑ ↑ ↑");
                System.out.println("***************************************");
                System.out.println("---------------------------------------");                
                numcasillas=30;
                break;
            case 3:
                System.out.println("---------------------------------------");
                System.out.println("***************************************"); 
                System.out.println("⚡ ⚡ ⚡ ⚡ ⚡ ⚡ Nivel Avanzado ⚡ ⚡ ⚡ ⚡ ⚡ ⚡ ");
                System.out.println("***************************************");
                System.out.println("---------------------------------------");                
                numcasillas=50;
                break;
            default:
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");   
                System.out.println("▓⚠ ⚠ ⚠ ⚠ ⚠ OPCION INCORRECTA⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ▓");
                System.out.println("▓ DATO NO VALIDO, POR FAVOR INTENTE DE  ▓");
                System.out.println("▓ NUEVO, GRACIAS.                       ▓");
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");                

                break;
            }
        }while(opcion > 3); //ciclo do-while (2)

        
        do{
            
            do{
                
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.println("************CARRERA NUMERICA***********");
            System.out.println("");
            
            do{
                    for (i=1;i<=num_jugadores;i++){
                    int punp1d1 = (int)(Math.random()*6+1);
                    int punp1d2= (int)(Math.random()*6+1);
                    System.out.println("player "+i+": "+"Dado 1: "+punp1d1+"||Dado 2: "+punp1d2);
                    suma=punp1d1+punp1d2;
                    suma=suma+sump[i];
                    }    
            }while (sump[i]<=numcasillas);

                
                if(sump[i]>=numcasillas){
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");   
                System.out.println("▓♥ ♥ ♥ ♥ ♥ ♥ ♥  GAME OVER ♥ ♥ ♥ ♥ ♥ ♥ ♥ ▓");
                System.out.println("▓        ¿QUIERE SEGUIR JUGANDO?        ▓");
                System.out.println("▓       S/s                   N/n       ▓");
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
                respuesta_U=reader.nextLine();
                }
            }while(sump[i]>=numcasillas);
        }while(respuesta_U.equals("N") || respuesta_U.equals("n"));

    }
   }
