package atv_01;

import javax.swing.JOptionPane;


public class mes {
    int mes;

    public mes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String verMes(){
        switch(mes){
            case 1:
                JOptionPane.showMessageDialog(null,"Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Março");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Maio");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Junho");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Julho");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Setembro");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"Outubro");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,"Novembro");
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"Desembro");
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"numero invalido");
                return  ":(";
            default:
                JOptionPane.showMessageDialog(null,"numero invalido");
                return ":(";
        }
        
        return ":)";
    }
    
    public void imprimaDados(){
        String r = verMes();
        String mensagem = ""+r;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
