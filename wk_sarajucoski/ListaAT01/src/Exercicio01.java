import javax.swing.JOptionPane;

public class Exercicio01{
    public static void main(String[] args){
    	int soma=0, impares=0, pares=0;
    	for(int i=0; i < 10; i++) {
    		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"° número: "));
    		soma += n;
    		if(n%2==0) {
    			pares += 1;
    		} else {
    			impares += 1;
    		}
    	}
    	JOptionPane.showMessageDialog(null, "A soma é: "+soma+"\n"
    	+ "Dos números digitados, "+pares+" são pares \n"
    	+ "E "+impares+" são impares");
    }
}