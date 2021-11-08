package atv_09;

import javax.swing.JOptionPane;

public class Main_09 {
    public static void main(String [] args){
        float consumo = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu consumo mensal: "));
        
        EnergiaEletrica e01 = new EnergiaEletrica(consumo);
        
        e01.calcularFornecimento(consumo);
    }
}

