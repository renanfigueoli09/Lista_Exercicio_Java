package atv_03;

import static java.time.Clock.system;
import javax.swing.JOptionPane;


public class Multa {
    float velo;
    float rua;
    public Multa(float velo, float rua) {
        this.velo = velo;
        this.rua = rua;
       
    }

    public float getVelo() {
        return velo;
    }

    public float getRua() {
        return rua;
    }

    public void setVelo(float velo) {
        this.velo = velo;
    }

    public void setRua(float rua) {
        this.rua = rua;
    }

    
    public String verifica(){
        if(this.rua==this.velo+10 || this.velo+10>this.rua){
            JOptionPane.showMessageDialog(null,"valor da multa eh 50 reais");
            return ":)";
        }else{
            if(this.velo+11>this.rua && this.velo+30<rua){
                JOptionPane.showMessageDialog(null,"valor da multa eh 100 reais");
                return ":)";
            }else{
                JOptionPane.showMessageDialog(null,"valor da multa eh 300 reais");
                return ":)";
            }
        }
        
    }
    
    public void imprimirDados(){
        String r = verifica();
        String mensagem = ""+r;
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
