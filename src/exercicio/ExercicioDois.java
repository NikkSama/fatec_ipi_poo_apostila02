package exercicio;

import javax.swing.*;

public class ExercicioDois {
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade? "));

        //if/else
//        if(idade >= 18) {
//            JOptionPane.showMessageDialog(null, "Maior de idade.");
//        } else{
//            JOptionPane.showMessageDialog(null, "Menor de idade.");
//        }

        //ternario
        String resultado;
        resultado = idade >= 18 ? "Maior de idade. " : "Menor de idade. ";
        JOptionPane.showMessageDialog(null, resultado);

    }
}

