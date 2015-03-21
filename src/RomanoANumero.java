import java.util.Scanner;


public class RomanoANumero {
 static int conversor(String variablea){
	 int num1;
	 char[] Rom={'I','V','X','L','C'};
	
		String variable1;
		String variable2;
		String variable3;
		String variable4;
		String variable5;
		String variable6;
		
	
		int parte1=0;
		int parte2=0;
		int parte3=0;
		int parte4=0;
		int parte5=0;
		int parte6=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el numero romano");
		variablea=s.next();
		variable1=variablea.substring(0,1);
		variable2=variablea.substring(1,2);
		variable3=variablea.substring(2,3);
		variable4=variablea.substring(3,4);
		variable5=variablea.substring(4,5);
		variable6=variablea.substring(5,6);
		
		char number1=variable1.charAt(0);
		char number2=variable2.charAt(0);
		char number3=variable3.charAt(0);
		char number4=variable4.charAt(0);
		char number5=variable5.charAt(0);
		char number6=variable6.charAt(0);
		switch(number1){
		case 'I':parte1=1;
		         break;
		case 'V':parte1=5;
		         break;
		case 'X':parte1=10;
		         break;
		case 'L':parte1=50;
		         break;
		case 'C':parte1=100;
		         break;
		}
		switch(number2){
		case 'I':parte2=1;
		         break;
		case 'V':parte2=5;
		         break;
		case 'X':parte2=10;
		         break;
		case 'L':parte2=50;
		         break;
		case 'C':parte2=100;
		         break;
		}
		switch(number3){
		case 'I':parte3=1;
		         break;
		case 'V':parte3=5;
		         break;
		case 'X':parte3=10;
		         break;
		case 'L':parte3=50;
		         break;
		case 'C':parte3=100;
		         break;
		}
		switch(number4){
		case 'I':parte4=1;
		         break;
		case 'V':parte4=5;
		         break;
		case 'X':parte4=10;
		         break;
		case 'L':parte4=50;
		         break;
		case 'C':parte4=100;
		         break;
		}
		switch(number5){
		case 'I':parte5=1;
		         break;
		case 'V':parte5=5;
		         break;
		case 'X':parte5=10;
		         break;
		case 'L':parte5=50;
		         break;
		case 'C':parte5=100;
		         break;
		}
		switch(number6){
		case 'I':parte6=1;
		         break;
		case 'V':parte6=5;
		         break;
		case 'X':parte6=10;
		         break;
		case 'L':parte6=50;
		         break;
		case 'C':parte6=100;
		         break;
		}
		//construyendo el numero
		int numero=0;
		if(parte1<parte2 && parte3>=parte4 && parte4>=parte5 && parte5>=parte6)
			return num1=((parte2-parte1)+parte3+parte4+parte5+parte6);
		else if(parte2<parte3 && parte1>=parte2 && parte3>=parte4 && parte4>=parte5 && parte5>=parte6)	
			return num1=((parte3-parte2)+parte1+parte4+parte5+parte6);
			else if(parte3<parte4 && parte1>=parte2 && parte2>=parte3 && parte4>=parte5 && parte5>=parte6)
				return num1=((parte4-parte3)+parte1+parte2+parte5+parte6);
			else if(parte5<parte4 && parte1>=parte2 && parte3>=parte4 && parte4>=parte6)
				return num1=((parte4-parte5)+parte3+parte6+parte2+parte1);
			else
				return num1=parte1+parte2+parte3+parte4+parte5+parte6;
				
		
 }
}
