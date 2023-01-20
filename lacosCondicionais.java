package Aula1;

import java.util.Scanner;

public class lacosCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Scanner  ler = new  Scanner(System.in);
		
		int  n , x , contImpar = 0 , contPar = 0 ;
		
		for ( x = 1 ; x <= 10 ; x ++)
			{
			System.out.printf("\nEntre com o " + x + "º numero: " );
				n = ler.nextInt();
				if ( n % 2 == 0 )
				{
					contPar += 1 ;
				}
				else
				{
					contImpar += 1 ;
				}
			}
		System.out.printf("\nTotal de numeros pares " + contPar );
		System.out.printf("\nTotal de numeros impares " + contImpar);
		
	}
}
	
while ( idade >= 0 )
{
	System.out.printf("\nEntre com sua idade: " );
	idade = ler.nextInt();
	
	if ( idade < 21 && idade > 0 )
	{
		menor21 += 1 ;
	}
	if ( idade > 50 )
	{
		maior50 += 1 ;
	}
}
System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21);
System.out.println("\nTotal de pessoas maiores de 50 anos: " + maior50);



Scanner  ler = novo  Scanner ( System . in );
int  n , somaPositivos = 0 ;
for
{
	Sistema . fora . printf ( "Digite um numero: " );
	n = ler . proximoInt ();
	se ( n > 0 )
	{
		somaPositivos += n ;
	}
} while ( n != 0 );

Sistema . fora . printf ( "A soma dos números positivos é: " + somaPositivos );
}

}

}

}

		