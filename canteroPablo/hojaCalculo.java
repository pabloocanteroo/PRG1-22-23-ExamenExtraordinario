import java.util.Scanner;
public class hojaCalculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
    int columnas = 10;
    int filas=15;
    int [][] hojaCalculo = new int [filas][columnas];
    int [] posicionJugador = {0,0};
    boolean terminar = false;
    do{

    System.out.println("+------------------------------------------------------------------------+");
    System.out.println("|  |   A  |   B  |   C  |   D  |   E  |   F  |   G  |   H  |   I  |   J  |");
    System.out.println("+-------------------------------------------------------------------------+");
    for(int i=0;i<hojaCalculo.length;i++){
        if(i<10)
        {System.out.print("| "+ i +"|");
        }else{
            System.out.print("|"+ i +"|");
        }
        
        for(int j=0;j<hojaCalculo[i].length;j++){
            if(posicionJugador[0]==i&&posicionJugador[1]==j){
                System.out.print("[____]");
            }else{
                System.out.print("      ");
            }
            hojaCalculo[i][j]=0;
            System.out.print("|");
        }
        System.out.println();
    }
    System.out.println("+-------------------------------------------------------------------------+");
    System.out.println("|   | Y: "+posicionJugador[0]+" | X: "+posicionJugador[1]+" |");
    System.out.println("+-------------------------------------------------------------------------+");
    System.out.println("WASD para moverse o f para salir");
    System.out.println("Introduce una tecla");
    inputUsuario = entrada.nextLine().charAt(0);
            switch (inputUsuario) {
                case 's', 'S', '8':
                    posicionJugador[0] = posicionJugador[0] + 1;
                    break;
                case 'w', 'W', '2':
                    posicionJugador[0] = posicionJugador[0] - 1;
                    break;
                case 'a', 'A', '4':
                    posicionJugador[1] = posicionJugador[1] - 1;
                    break;
                case 'd', 'D', '6':
                    posicionJugador[1] = posicionJugador[1] + 1;
                    break;
                case 'f', 'F':
                    terminar = true;
            }
        if(posicionJugador[0]<0){
            posicionJugador[0]=0;
        }else if(posicionJugador[0]>14){
            posicionJugador[0]=14;
        }else if(posicionJugador[1]<0){
            posicionJugador[1]=0;
        }else if(posicionJugador[1]>9){
            posicionJugador[1]=9;
        }
    System.out.println("¿Que quieres escribir?");
    
    }while(terminar==false);
    }
}
