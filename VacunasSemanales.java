public class VacunasSemanales {
    
    public String [][] arregloSemanas (String [][] matriz){
        String [][] segundaMatriz = new String[8][8];
        //Itera sobre las filas
        for(int i = 0; i < matriz.length; i++){
            //Itera sobre las columnas
            for(int j = 1; j < matriz[i].length; j++){
                segundaMatriz[i][j-1] = matriz [i][j];
            }
        }
    return segundaMatriz;
    }

    public String [][] cantidadTotalSemanal (String [][] matriz){
        String [][] segundaMatriz = new String[2][8]; //segunda matriz para retornar el Total de cada semana
        int contador; //Para sumar las vacunas de cada region de esa semana
        //Itera sobre las columnas
        for(int j = 0; j < matriz.length; j++){
            contador = 0; //cada semana comienza en cero
            segundaMatriz[0][j] = matriz [0][j];
            //Itera sobre las filas
            for(int i = 1; i < matriz[j].length; i++){
                //Imprime los elementos de la matriz
                contador = contador + Integer.parseInt(matriz[i][j]);
            }
            segundaMatriz[1][j] = String.valueOf(contador);
        }
        return segundaMatriz;
    }

    public void imprimirTotalSemana(int seleccion, String [][] matriz){
        if(seleccion >= 12 || seleccion <= 19)
         System.out.println(matriz[1][seleccion-12]);
        else
            System.out.println("Seleccion invalida");
    }

    public String [][] diferenciaEntreSemanas (String [][] matriz){
        String [][] segundaMatriz = new String[2][8]; //segunda matriz para retornar el Total de cada semana
        int contador; //Para sumar las vacunas de cada region de esa semana
        //Itera sobre las columnas
        for(int j = 0; j < matriz.length; j++){
            contador = 0; //cada semana comienza en cero
            segundaMatriz[0][j] = matriz [0][j];
            //Itera sobre las filas
            for(int i = 1; i < matriz[j].length; i++){
                //Imprime los elementos de la matriz
                int contadorDos = contador;
                contador = contador + Integer.parseInt(matriz[i][j]);
                contador = contador - contadorDos;
            }
            segundaMatriz[1][j] = String.valueOf(contador);
        }
        return segundaMatriz;
    }
}
