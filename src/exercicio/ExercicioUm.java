package exercicio;

import javax.swing.*;

public class ExercicioUm {
    public static void main(String[] args) {
        double salario;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu sálario? "));

        if(salario >= 1100.00){
            JOptionPane.showMessageDialog(null, "Você está ganhando pelo menos um salário mínimo");
        }
        else{
            JOptionPane.showMessageDialog(null, "seu salário está abaixo de um salário mínimo :(");
        }
    }
}
