package gen55;

import java.util.*;

public class condicional2 
{
public static void main (String args [])
{
	Scanner ler = new Scanner (System.in);
	int n1, n2, n3, maior;
	
	System.out.println("Entre com um valor: ");
	n1 = ler.nextInt();
	ler.nextLine();
	
	System.out.println("Entre com o segundo valor: ");
	n2= ler.nextInt();

	System.out.println("Entre com o terceiro valor: ");
	n3= ler.nextInt();

maior = n1;

if (n2 > maior){  
maior = n2;
}
	if (n3 > maior){
maior = n3;
}

System.out.println("o maior numero é:" +maior);
	
}
}
