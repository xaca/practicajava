import java.util.Scanner;

public class Programa{
	public static void main(String[] args){
		
		int opc;


		do{

			System.out.println("o               .        ___---___                    .                   \r\n       .              .--\\        --.     .     .         .\r\n                    ./.;_.\\     __/~ \\.     \r\n                   /;  / `-\'  __\\    . \\                            \r\n .        .       / ,--\'     / .   .;   \\        |\r\n                 | .|       /       __   |      -O-       .\r\n                |__/    __ |  . ;   \\ | . |      |\r\n                |      /  \\\\_    . ;| \\___|    \r\n   .    o       |      \\  .~\\\\___,--\'     |           .\r\n                 |     | . ; ~~~~\\_    __|\r\n    |             \\    \\   .  .  ; \\  /_/   .\r\n   -O-        .    \\   /         . |  ~/                  .\r\n    |    .          ~\\ \\   .      /  /~          o\r\n  .                   ~--___ ; ___--~       \r\n                 .          ---         .              ");
			System.out.println("   ___                                        \r\n  / _ \\ ____ ___  ___ _ ____ ___ _ __ _  ___ _\r\n / ___// __// _ \\/ _ `// __// _ `//  \' \\/ _ `/\r\n/_/   /_/   \\___/\\_, //_/   \\_,_//_/_/_/\\_,_/ \r\n                /___/                         ");
			System.out.println("     __                 \r\n __ / /___ _ _  __ ___ _\r\n/ // // _ `/| |/ // _ `/\r\n\\___/ \\_,_/ |___/ \\_,_/ \r\n                               \n \n");



			System.out.println("---Menu---");
			System.out.println("1. Conoce cual es tu signo zodiacal");
			System.out.println("2. Calculadora de cuantos dias has vivido");
			System.out.println("3. Tu edad en edad de perro");
			System.out.println("4. El numero que te representa segun la numerologia");
			System.out.println("5. Salir");
			System.out.print("Ingrese una opcion ");
			opc = ConsoleInput.getInt();

			if(opc == 1)
			{
				int dia;
				int mes;

				System.out.println("                \'\r\n            *          .\r\n                   *       \'\r\n              *                *\r\n\r\n\r\n\r\n\r\n\r\n   *   \'*\r\n           *\r\n                *\r\n                       *\r\n               *\r\n                     *\r\n\r\n         .                      .\r\n         .                      ;\r\n         :                  - --+- -\r\n         !           .          !\r\n         |        .             .\r\n         |_         +\r\n      ,  | `.\r\n--- --+-<#>-+- ---  --  -\r\n      `._|_,\'\r\n         T\r\n         |\r\n         !\r\n         :         . : \r\n         .       *\r\n                  \n");

				System.out.println("Ingrese el dia en el que nacio");
				dia = ConsoleInput.getInt();
				System.out.println("Ingrese su mes de nacimiento como un numero");
				mes = ConsoleInput.getInt();

				if(mes == 1){
            		if(dia <= 20){
                		System.out.println("Tu signo zodiacal es:  Capricornio");
            		}
            		else{
            			if(dia <=31){
                			System.out.println("Tu signo zodiacal es: Acuario");
                		}
                		else{
                			System.out.println("ten en cuenta que enero tiene 31 dias");

                			
                		}

                	} 	

                }

                if(mes == 2){
            		if(dia <= 20){
                		System.out.println("Tu signo zodiacal es: Acuario");
            		}
            		else{
            			if(dia <=29){
                			System.out.println("Tu signo zodiacal es: Picis");
                		}
                		else{
                			System.out.println("ten en cuenta que febrero tiene 29 dias");

                			
                		}

                	} 	

                }

                if(mes == 3){
            		if(dia <= 20){
                		System.out.println("Tu signo zodiacal es: Picis");
            		}
            		else{
            			if(dia <=31){
                			System.out.println("Tu signo zodiacal es: Aries");
                		}
                		else{
                			System.out.println("ten en cuenta que marzo tiene 31 dias");

                			
                		}

                	} 	

                }

                if(mes == 4){
            		if(dia <= 20){
                		System.out.println("Tu signo zodiacal es: Aries");
            		}
            		else{
            			if(dia <=30){
                			System.out.println("Tu signo zodiacal es: Tauro");
                		}
                		else{
                			System.out.println("ten en cuenta que abril tiene 30 dias");
                			
                		}

                	} 	

                }

                if(mes == 5){
            		if(dia <= 21){
                		System.out.println("Tu signo zodiacal es: Tauro");
            		}
            		else{
            			if(dia <=31){
                			System.out.println("Tu signo zodiacal es: Geminis");
                		}
                		else{
                			System.out.println("ten en cuenta que mayo tiene 31 dias");

                			
                		}

                	} 	

                }

                if(mes == 6){
            		if(dia <= 21){
                		System.out.println("Tu signo zodiacal es: Geminis");
            		}
            		else{
            			if(dia <=30){
                			System.out.println("Tu signo zodiacal es: Cancer");
                		}
                		else{
                			System.out.println("ten en cuenta que junio tiene 30 dias");

                			
                		}

                	} 	

                }

                if(mes == 7){
            		if(dia <= 22){
                		System.out.println("Tu signo zodiacal es: Cancer");
            		}
            		else{
            			if(dia <=31){
                			System.out.println("Tu signo zodiacal es: Leo");
                		}
                		else{
                			System.out.println("ten en cuenta que julio tiene 31 dias");

                			
                		}

                	} 	

                }

                if(mes == 8){
            		if(dia <= 23){
                		System.out.println("Tu signo zodiacal es: Leo");
            		}
            		else{
            			if(dia <=31){
                			System.out.println("Tu signo zodiacal es: Virgo");
                		}
                		else{
                			System.out.println("ten en cuenta que agosto tiene 31 dias");

                			
                		}

                	} 	

                }

                if(mes == 9){
            		if(dia <= 23){
                		System.out.println("Tu signo zodiacal es: Virgo");
            		}
            		else{
            			if(dia <=30){
                			System.out.println("Tu signo zodiacal es: Libra");
                		}
                		else{
                			System.out.println("ten en cuenta que septiembre tiene 30 dias");

                			
                		}

                	} 	

                }

                if(mes == 10){
            		if(dia <= 23){
                		System.out.println("Tu signo zodiacal es: Libra");
            		}
            		else{
            			if(dia <=31){
                			System.out.println("Tu signo zodiacal es: Escorpio");
                		}
                		else{
                			System.out.println("ten en cuenta que octubre tiene 31 dias");

                			}

                	} 	

                }

                if(mes == 11){
            		if(dia <= 22){
                		System.out.println("Tu signo zodiacal es: Escorpio");
            		}
            		else{
            			if(dia <=30){
                			System.out.println("Tu signo zodiacal es: Sagitario");
                		}
                		else{
                			System.out.println("ten en cuenta que noviembre tiene 30 dias");

                			
                		}

                	} 	

                }

                if(mes == 12){
            		if(dia <= 21){
                		System.out.println("Tu signo zodiacal es: Sagitario");
            		}
            		else{
            			if(dia <=31){
                			System.out.println("Tu signo zodiacal es: Capricornio");
                		}
                		else{
                			System.out.println("ten en cuenta que diciembre tiene 31 dias");

                			
                		}

                	} 	

                }

            }

			if(opc == 2)
			{
				int dias;
				int meses;
				int anos;
				int mesendias;
				int anosendias;
				int diasvivir;

				System.out.println("        _,,ddF\"\"\"Ybb,,_\r\n    ,d@#@#@#@g,   `\"Yb,\r\n  ,d#@#V``V@#@#b      \"b,\r\n d@#@#I    I@#@8        \"b\r\nd@#@#@#A..A@#@#P         `b\r\n8#@#@#@#@#@#@8\"           8\r\n8@#@#@#@#@#@J             8\r\n8#@#@#@#@#P               8\r\nY@#@#@#@#P    ,db,       ,P\r\n Y@#@#@#@)    @DWB      aP\r\n  \"Y#@#@#b    `69\'    aP\"\r\n    \"Y@#@#g,,     _,dP\"\r\n      `\"\"YBBgggddP\"\"\'  \n");

				System.out.println("Ingrese el dia en el que nacio");
				dias = ConsoleInput.getInt();
				System.out.println("Ingrese su mes de nacimiento como un numero");
				meses = ConsoleInput.getInt();
				System.out.println("ingrese el ano en el que nacio");
				anos = ConsoleInput.getInt();

				mesendias = (meses + 1) * 30;
				anosendias = (2021-anos) * 365;
				diasvivir = dias + mesendias + anosendias;

				System.out.println("La cantidad de dias que has vivido son:" + diasvivir);



			}

			if(opc == 3)
			{
				int edad;
				int doggo;
				
				System.out.println("               _\r\n            ,/A\\,\r\n          .//`_`\\\\,\r\n        ,//`____-`\\\\,\r\n      ,//`[_DOGGO_]`\\\\,\r\n    ,//`=  ==  __-  _`\\\\,\r\n   //|__=  __- == _  __|\\\\\r\n   ` |  __ .-----.  _  | `\r\n     | - _/       \\-   |\r\n     |__  | .-\"-. | __=|\r\n     |  _=|/)   (\\|    |\r\n     |-__ (/ a a \\) -__|\r\n     |___ /`\\_Y_/`\\____|\r\n          \\)8===8(/  \n");

				System.out.println("Ingresa la edad que tienes:");
				edad = ConsoleInput.getInt();
				
				doggo = edad/7;

				System.out.println("Su edad como un doggo es de: " +doggo);	
			}

			if(opc == 4)
			{

				int primerdigito;
				int segundodigito;
				int numfin;
				
				System.out.println("                 __\r\n    ..=====.. |==|\r\n    ||     || |= |\r\n _  ||     || |^*| _\r\n|=| o=,===,=o |__||=|\r\n|_|  _______)~`)  |_|\r\n    [=======]  ()      \n");

				System.out.println("Ingresa el dia en el que nacio:");
				int num = ConsoleInput.getInt();
		        int sum = 0;
		        
		        while (num > 0) {
		            sum = sum + num % 10;
		            num = num / 10;
		        }

				int num2 = sum;
		        int sum2 = 0;
		         while (num2 > 0) {
		            sum2 = sum2 + num2 % 10;
		            num2 = num2 / 10;
		        }
		        System.out.println("Su numero segun la numerologia es: " + sum2); 	

			}

			if(opc == 5)
			{
				System.out.println("Hasta pronto");
			}

		}while(opc != 5);
	}

}