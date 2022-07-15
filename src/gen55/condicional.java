package gen55;

import java.util.*;

public class condicional 

{
public static void main (String args[])
{
	Scanner ler = new Scanner(System.in);
	int idade;
	
	
	System.out.printf("Digite sua idade: ");
	idade = ler.nextInt();
	ler.nextLine();

	
	if (idade < 14 ) {System.out.println("\nDigite uma idade válida");}
	else if (idade >=10) {System.out.println("\nCategoria infantil");}
	else if (idade >=15 ) {System.out.println("\nCategoria juvenil");}
	else {System.out.println("\nCategoria adulto");}
	
	
}

}