import java.math.BigDecimal;
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
public class Cilindro {
    public static void main(String[] args) {
        double altura, raio, base, volume;
     
         
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
        raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio: "));
        volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume do cilindro é: " + volume);
       
        JOptionPane
     
    }
    
}
