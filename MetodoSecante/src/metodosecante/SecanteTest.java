/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosecante;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class SecanteTest {
    public static void main(String[] args){
        Funcion f = new Funcion("x^3+2*x^2+10*x-20");
        Secante s = new Secante();
        System.err.println(s.raiz(f, 0, 1, 100, 1e-4));
        //JOptionPane.showMessageDialog(null, s.raiz(f, 3, 4, 100, 1e-6));
    }
}
