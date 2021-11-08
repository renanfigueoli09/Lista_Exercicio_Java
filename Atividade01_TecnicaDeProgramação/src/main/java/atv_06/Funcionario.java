package atv_06;

import javax.swing.JOptionPane;


public class Funcionario {
        int cracha;
        float salario;
        String cargo;
        int tempo;

    public Funcionario(int c, float s, String car) {
        this.cracha = c;
        this.salario = s;
        this.cargo = car;
    }
    public Funcionario(){
        String car = "assistente";
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCracha() {
        return cracha;
    }

    public float getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
    //------------
    public void calculaAumento(float porcentagem){
            
        }
    public void calculaAumento(int tempo){
        
    }
    
    
}