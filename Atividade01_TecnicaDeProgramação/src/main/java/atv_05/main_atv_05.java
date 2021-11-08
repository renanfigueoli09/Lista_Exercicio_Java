/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_05;


import javax.swing.JOptionPane;

/**
 *
 * @author renan
 */
public class main_atv_05 {
    public static void main(String[]atgs){
        int ano = (int) Float.parseFloat(JOptionPane.showInputDialog("Digite um ano"));

     
        ano_bissexto a = new ano_bissexto(ano);
        a.imprimeDados();
          
      
    }
}
