import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitor
 */
public class CalculoFuncionario {
    public static void main(String[] args) {
        float salarioB, valorIr, valorInss, salarioL, desconto;
        
        salarioB = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário bruto: "));
        
        valorIr = (salarioB * 10) / 100;
        valorInss = (salarioB * 5) / 100;
        desconto = valorIr + valorInss;
        salarioL = salarioB - desconto;
        System.out.println("O salário líquido é:" + salarioL);
    
                JOptionPane
    }
}
