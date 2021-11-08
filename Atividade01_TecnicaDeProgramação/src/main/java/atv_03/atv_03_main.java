/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_03;

import javax.swing.JOptionPane;

/**
 *
 * @author renan
 */
public class atv_03_main {
    public static void main(String[]args){
    float rua = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade da rua "));
    float velo = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade do veiculo"));
    
        Multa v = new Multa(rua,velo);
        
      v.imprimirDados();
      
    }       
}
