
import java.io.*;
import javax.swing.JOptionPane;


public class codicional {
	
	public static void main(String[] args) {
		
		int numero,divicion,multiplicacion,resta;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero"));
		
		divicion = (numero/2);
		multiplicacion = (divicion*2);
		resta = multiplicacion-numero;
		
		if (resta==0)
{ System.out.println ("Es numero par" );
		
		}
		else		
{ System.out.println ("Es numero impar" );
		
		}
	}


}
