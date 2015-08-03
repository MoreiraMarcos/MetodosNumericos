/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosecante;

import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;

/**
 *
 * @author Marcos
 * 
 * Definición de la clase para tomar la cadena como ingresoy la utilización de jep
 */
public class Funcion {
    JEP j = new JEP();
    public Funcion(String def){
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
        j.parseExpression(def);
        if (j.hasError()) {
            System.out.println(j.getErrorInfo());
            //JOptionPane.showMessageDialog(null, j.getErrorInfo());
        }
    }
    
    public double eval(double x){
        double r;
        j.addVariable("x", x);
        r=j.getValue();
        if (j.hasError()) {
            System.out.println(j.getErrorInfo());
            //JOptionPane.showMessageDialog(null, j.getErrorInfo());
        }
        return r;
        
    }
}
