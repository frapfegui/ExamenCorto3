import java.util.Scanner;
public class MainVacunacion {
     /**
     * Imprime una matriz
     */
    public static void imprimirTodoEnUno (String [][] matriz ){
        //Itera sobre las filas
        for(int i = 0; i < matriz.length; i++){
            //Itera sobre las columnas
            for(int j = 0; j < matriz[i].length; j++){
                //Imprime los elementos de la matriz
                System.out.print(matriz[i][j] + "  ");
            }
            //Separa cada fila
            System.out.println();
        }
        System.out.println("----------Fin de esta Lista-------------");
    }

    public static void main(String [] args){
        String [][] vacunacion = {{" Region", " S12", " S13" , " S14", " S15", " S16", " S17", " S18", " S19"},
    {" Central Norte ", "94409", "124763", "144345", "171062", "197544", "227468", "261465", "299498"},
    {" Central Sur ", "173116", "222953", "253205", "299030", "349709", "400385", "456888", "518432"},
    {" Huetar Norte ", "17519", "23330", "28254", "36045", "42028", "49001", "57656", "66153"},
    {" Pacifico Central ", "27818", "36882", "44327", "51207", "57488", "65240", "72511", "80612"},
    {" Huetar Atlántica ", "17964", "23398", "29895", "37677", "49275", "62316", "74389", "87545"},
    {" Brunca ", "20969", "28337", "33876", "41640", "52965", "65046", "75222", "89188"},
    {" Chorotega ", "32560", "45267", "52897", "61666", "69875", "80796", "95800", "110472"}};
    //System.out.println("Este es el arreglo con la informacion brindada: ");
    //imprimirTodoEnUno(vacunacion);
    VacunasSemanales vacunasSemanales = new VacunasSemanales();
    String [][] vacunacionSemanal = vacunasSemanales.arregloSemanas(vacunacion);
    //imprimirTodoEnUno(vacunacionSemanal);
    String [][] vacunacionTotalSemanal = vacunasSemanales.cantidadTotalSemanal(vacunacionSemanal);
    //imprimirTodoEnUno(vacunacionTotalSemanal);
    System.out.println("Seleccione la semana que desea ver el total de vacunacion de 12 a 19: ");
    Scanner scanner = new Scanner(System.in);
    int myint = scanner.nextInt();
    vacunasSemanales.imprimirTotalSemana(myint, vacunacionTotalSemanal);
    System.out.println("--------------------");
    scanner.close();
    String [][] vacunacionDiferencia = vacunasSemanales.diferenciaEntreSemanas(vacunacionSemanal);
    System.out.println("Esta es la diferencia entre semanas: ");
    imprimirTodoEnUno(vacunacionDiferencia);
    }

}
