package es.unileon.prg.date;


public class MainDate{
	
	public static void main(String args[]){

	
	Date today = new Date (29,3,2017);
//	Date other = new Date (28,3,2017);
	Date other = new Date (28,3,1942);

//mensajes por pantalla de ayuda
	System.out.println(" ----- MENSAJE DE CONTROL ----- ");
	System.out.println("FECHA 1: "+today.getDay()+" / "+today.getMonth()+" / "+today.getYear()) ;
	System.out.println("FECHA 2: "+other.getDay()+" / "+other.getMonth()+" / "+other.getYear()) ;
	System.out.println(" ");	

	System.out.println(" ----- PARTE 1 ----- ");	
	
//Ejercicios DIAPOSITIVA-1
	System.out.println("Tienen el mismo DIA? - "+today.isSameDay(other.getDay()));

	System.out.println("Tienen el mismo MES? - "+today.isSameMonth(other.getMonth()));
	
	System.out.println("Tienen el mismo AÑO? - "+today.isSameYear(other.getYear()));
	
	System.out.println("Tienen la misma FECHA? - "+today.isSame(other.getDay(),other.getMonth(),other.getYear()));

System.out.println(" ");
	
//Ejercicios DIAPOSITIVA-2
	System.out.println(" ----- PARTE 2 ----- ");

	System.out.println("Nombre del mes introducido - "+today.getMonthName(today.getMonth()));

	System.out.println("Checking Mes ... - "+today.checkMonthDays(today.getMonth()));

System.out.println("Checking CURRENT_SEASON ... - "+today.seasonOfTheMonth(today.getMonth(),today.getDay()));

	}	
}
