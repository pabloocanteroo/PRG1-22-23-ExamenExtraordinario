import java.util.Scanner;
public class hojaCalculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
    int columnas = 10;
    int filas=15;
    int [][] hojaCalculo = new int [columnas][filas];
    int [] posicionJugador = {1,1};
    boolean terminar = false;

    System.out.println("+-------------------------------------------------------------------------+");
    System.out.println("|   A   |   B   |   C   |   D   |   E   |   F   |   G   |   H   |   I   |    J   |");
    System.out.println("+-------------------------------------------------------------------------+");
    for(int i=0;i<hojaCalculo.length;i++){
        for(int j=0;j<hojaCalculo[i].length;j++){
            hojaCalculo[i][j]=0;
            System.out.print("    |");
        }
        System.out.println();
    }
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
}
}
