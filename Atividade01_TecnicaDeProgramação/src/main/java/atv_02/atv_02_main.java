package atv_02;


import javax.swing.JOptionPane;

public class atv_02_main {
    public static void main(String[]args){
    int num1 = (int) Float.parseFloat(JOptionPane.showInputDialog("Digite um numero"));
    int num2 = (int) Float.parseFloat(JOptionPane.showInputDialog("Digite outro numero"));
    int num3 = (int) Float.parseFloat(JOptionPane.showInputDialog("Digiteum ultimo numero"));
        atv_02 v = new atv_02(num1,num2,num3);
        
      v.imprimaDados();
      
    } 
}
