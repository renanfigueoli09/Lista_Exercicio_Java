package atv_02;

import javax.swing.JOptionPane;


public class atv_02 {
    int num1,num2,num3;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public atv_02(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public String calcula(){
        if(num1>num2+num3){
            JOptionPane.showMessageDialog(null,"O primeiro valor é maior que a soma dos dois ultimos numeros");
        }else{
            JOptionPane.showMessageDialog(null,"O primeiro valor não é maior que a soma dos dois ultimos numeros");
                
        }
        return ":)";
    }
    
    public void imprimaDados(){
        String r = calcula();
        String mensagem = ""+r;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
