/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_07;

import javax.swing.JOptionPane;

/**
 *
 * @author renan
 */
public class Main_07 {
    public static void main(String[] args) {
        float base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triangulo: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triangulo: "));
        
        

        Triangulo a = new Triangulo(base, altura);
        a.imprimirDados();
    }
}
