package atv_05;

import javax.swing.JOptionPane;


public class ano_bissexto {
    int ano;
    int resto;
    private String resultado;
    

    public ano_bissexto(int ano, int resto) {
        this.ano = ano;
        this.resto=resto;
        
    }

    ano_bissexto(int ano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String verifica(){   
        this.resto = this.ano%400;
        if(this.resto == 0){
            return "eh bissexto";
        }
        else
            return "não eh Bissexto";
    }
    public void imprimeDados(){
        String mensagem = "O ano"+resto;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
