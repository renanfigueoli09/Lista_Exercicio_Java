package atv_08;

import javax.swing.JOptionPane;

public class Torneio {
    private String nome;
    private int idade;
    
    // M�todo Construtor
    public Torneio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // M�todos de Acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // M�todo para Verificar a Categoria - Fun��o
    public String verificarCategoria(){
        if (idade >= 5 && idade <=7)
            return "Infantil";       
        if (idade >= 8 && idade <= 10)
            return "Juvenil";   
        if (idade >= 11 && idade <= 15)
            return "Adolecente";            
        if (idade >= 16 && idade <= 30)
            return "Adulto";     
        if (idade > 30)
            return "Senior";        
        return "Idade Invalida!";
    }
    
    // M�todo para exibir os dados - Procedimento
    public void imprimeDados(){
        String categoria = verificarCategoria();
        String mensagem = "Nome " + nome + "\nIdade: " + idade +
                          "\nCategoria: " + categoria;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
