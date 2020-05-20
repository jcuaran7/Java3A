package juego_taller;

import java.util.Scanner;


public class Juego_taller {
    

    public static void main(String[] args) {
        
        Scanner datos;
        int player =0, ops=0,j1=0,j2=0,dado=0,sum=0,i=0,num=0;
        datos = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println(".:::::::: NUMERO DE JUGADORES :::::::.");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("Selecione la cantidad de jugadores: ");
        System.out.println("Minimo [2] y maximo [4]");
        player = datos.nextInt();
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println(".::::::::::: DIFICULTAD :::::::::::::.");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("Selecione la dificultad:"); 
        System.out.println("Nivel basico     [1]");
        System.out.println("Nivel intermedio [2]");
        System.out.println("Nivel avanzado   [3]");
        ops = datos.nextInt();
        
        //areglar cantidad de jugadores cundo es mayor
        if(player>=4 || player<=2){
            
            while(player!=4 && player!=2 && player!=3){
               System.out.println("");
               System.out.println("--------------------------------------");
               System.out.println("---------------- ERROR ---------------");
               System.out.println("--------------------------------------");
               System.out.println("");
               System.out.println("NO SE PUEDEN ["+player+"] "+"JUGADORES");
               System.out.println("");
               System.out.println("Selececione una cantidad valida: ");
               System.out.println("Minimo [2] y maximo [4]");
               player = datos.nextInt();
            }
            
        }
        if (player>=2 && player<=4){
            
            System.out.println(""); 
            System.out.println("--------------------------------------");
            System.out.println("---------- CARRERA NUMERICA ----------");
            System.out.println("--------------------------------------");
            System.out.println("");
            if (player==2 && ops==1){
                
                System.out.println("Nivel [BASICO]");
                System.out.println("Numero de jugadores: ["+player+"]");
                System.out.println("");
                while(j1!=20 && j2!=20){
                    
                    if(j1<=14){
                        System.out.println("------------------------------------------");    
                        System.out.println("------------ TURNO JUGADOR 1 -------------");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=0; i<=1; i++){
                            num = (int) (Math.random()*6+1);
                            System.out.println("NUMERO: "+num);
                            j1=j1+num;
                        }
                        System.out.println("EL JUGADOR 1 AVANSO "+j1+" CASILLAS");

                    }else if(j1<20 && j1>=14){
                        
                        System.out.println("------------------------------------------");    
                        System.out.println("------------ TURNO JUGADOR 1 -------------");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            
                           num= (int) (Math.random()*6+1);
                           System.out.println("NUMERO: "+num);
                           
                            if(j1<20){ 
                             j1=j1+num;
                            }else{
                                System.out.println("No se puede avanzar");
                            }
                            
                           
                        }
                        System.out.println("EL JUGADOR 1 ESTA EN LA CASILLA ["+j1+"]");
                    }
                    if(j2<=14){
                        
                        System.out.println("Valor de p1: "+j1);
                        System.out.println(""); 
                        System.out.println("------------------------------------------");
                        System.out.println("------------- TURNO JUGADOR 2 ------------");
                        System.out.println("------------------------------------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        sum++;
                        j2=sum+2;
                        System.out.println("Valor de p2: "+j2);
                        System.out.println("");
                        
                    }else if(j2<20 && j2>=14){
                        
                        System.out.println("Valor de p1: "+j1);
                        System.out.println(""); 
                        System.out.println("------------------------------------------");
                        System.out.println("------------- TURNO JUGADOR 2 ------------");
                        System.out.println("------------------------------------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        sum++;
                        j2=sum+2;
                        System.out.println("Valor de p2: "+j2);
                        System.out.println("");
                    }
                }

                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                if (j1==20){
                    System.out.println("------------------------------------------");
                    System.out.println("El ganador es: [EL JUGADOR 1]");
                    System.out.println("------------------------------------------");
					
		}else{ 
                    if(j2==20){
                    System.out.println("------------------------------------------");
                    System.out.println("El ganador es: [EL JUGADOR 2]");
                    System.out.println("------------------------------------------");
                    }
                }
                
                
                
                
            }else if(player==3 && ops==1){
                System.out.println("NIVEL [BASICO]");
                System.out.println("NUMERO DE JUGADORES: ["+player+"]");
                System.out.println("Op 2 bien");
            }
        }
    }
    
}

/* jeferson mauricio cuaran narvaez*/