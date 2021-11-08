package atv_08;

import javax.swing.JOptionPane;

public class Main_08 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));

        Torneio t01 = new Torneio(nome, idade);
        t01.imprimeDados();
    }
    
}