/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosecante;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Marcos Clase de la secante
 */
public class Secante {
    /*
     * Metodo de la secante, recibe 5 parametros la función que habiamos creado para
     * recibir la cadena de la función, los puntos xi y xi-1, el numero de clclos permitido
     * y el error permitido
     */

    public double raiz(Funcion f, double x0, double x1, int ciclosPermitidos, double errorPermitido) {
        //Inicialización de la variable raiz, si no se encuentra la raiz sera NaN
        double raiz = Double.NaN;
        //Inicialización de la variable x2, sirve ara el control del eje x
        double x2 = x0;
        //Inicializacoón de la variable k, controla las iteraciones
        int i = 0;
        double error = 100;
        //Verificación de la llegada a la convergencia, mientras converja(encuentre la raiz) 
        //y alla llegado a los ciclos permitidos
        System.out.format("n          x0             x1            x2            error\n"
                + "%d       %8f       %8f       ---------      -------- \n", i, x0, x1, x2, error);
        //System.out.format("%d       %8f       %8f       ---------      -------- \n", i, x0, x1, x2, error);

//        Object[] cols = {
//            "n", "x0", "x1", "x2", "Error"
//        };

        while (Math.abs(f.eval(x2)) > errorPermitido && i < ciclosPermitidos) {
            i++;
            x2 = x0 - f.eval(x0) * (x1 - x0) / (f.eval(x1) - f.eval(x0));
            error = Math.abs(f.eval(x2));
            //System.out.println(i+"    \t    "+x0+"     \t       "+x1+"    \t       "+x2+"      \t      "+ error+"\n");
            System.out.format("%d       %8f       %8f       %8f       %8f \n", i, x0, x1, x2, error);
                    
//        Object[][] rows = {{i, x0, x1, x2, error}
//        };
//        
//        JTable table = new JTable(rows, cols);
//        JOptionPane.showMessageDialog(null, new JScrollPane(table));
            x0 = x1;
            x1 = x2;
        }
        if (i < ciclosPermitidos) {
            raiz = x2;
        }

        return raiz;
    }
}
