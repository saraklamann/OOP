import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio04{
    public static void main(String[] args) {
    	int[] notas = new int[4];
    	int soma=0;
    	
    	for(int i=0; i < 4; i++) {
    		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a "+(i+1)+"° nota"));
    		soma += nota;
    	}
    	
    	double media = soma / 4;
    	if(media >= 9) {
    		JOptionPane.showMessageDialog(null, "O aluno obteve média geral "+media+" ou seja, conceito A.");
    	} else {
    		if(media >= 8) {
    			JOptionPane.showMessageDialog(null, "O aluno obteve média geral "+media+" ou seja, conceito B.");
    		} else {
    			if(media >=7 ) {
        			JOptionPane.showMessageDialog(null, "O aluno obteve média geral "+media+" ou seja, conceito C.");
    			} else {
        			JOptionPane.showMessageDialog(null, "O aluno obteve média geral "+media+" ou seja, conceito D.");
    			}
    		}
    	}
    }
}