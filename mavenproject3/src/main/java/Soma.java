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
public class Soma {
    public static void main(String[] args) {
        float num, soma, media;
        
        num = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor:"));
        soma = num + 10;
        media = (soma + 10) / 2;
        System.out.println("A média é: " + media);
        
        JOptionPane
    }
    
}
