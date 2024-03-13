import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio03{
    public static void main(String[] args) {
    	double temperaturaC=0;
    	
    	double temperaturaF = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit a ser convertida: "));
    	
    	temperaturaC = (temperaturaF - 32) * 5 / 9;
    	JOptionPane.showMessageDialog(null, temperaturaF+"“ºF equivalem a "+ temperaturaC+"ºC");
    }
}