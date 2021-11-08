package atv_07;

import javax.swing.JOptionPane;


class Triangulo {
    double base,altura,area;

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public Triangulo(double altura) {
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calculaArea(){
        area=(base*altura)/2;
        return area;
    }
    public void imprimirDados(){
        double resultado = calculaArea();
       String menssagem = "area do triangulo ="+resultado;
        JOptionPane.showMessageDialog(null, menssagem);
    }
}
