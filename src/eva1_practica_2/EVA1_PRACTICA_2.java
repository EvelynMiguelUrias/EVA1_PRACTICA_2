/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_2;

/**
 *
 * @author Evelyn
 */
/*GENERAR UNA MATRIZ DE 100 * 100 ENTEROS, LLENARLOS CON CEROS Y UNOS, E IMPRIMIR.

*/
public class EVA1_PRACTICA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS LA MATRIZ 
        int iArreglo[][] = new int [100][100];
        //RECORREMOS LA MATRIZ PARA SABER EN DONDE SE COLOCARA EL UNO Y EL CERO
        for (int i = 0; i < iArreglo.length; i++) {
            for (int j = 0; j < iArreglo[i].length; j++) {
                
                if(i==j){
                    iArreglo[i][j]= 1;
                }else{
                    iArreglo[i][j] = 0;
                }
            }
        }
        //IMPRIMIMOS LA MATRIZ IDENTIDAD
        for (int i = 0; i < iArreglo.length; i++) {
            for (int j = 0; j < iArreglo[i].length; j++) {
                System.out.print("[" + iArreglo[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        
        // TODO code application logic here
    }
    
}
