package es.unileon.prg.date;


public class MainDate{
	
	public static void main(String args[]){

	
	Date today = new Date (28,3,2017);
	Date other = new Date (28,3,1492);
	
	System.out.println("Tienen el mismo dia? -- "+today.isSameDay(other.getDay()));

	System.out.println("Tienen el mismo MES? -- "+today.isSameMonth(other.getMonth()));
	
	System.out.println("Tienen el mismo AÑO? -- "+today.isSameYear(other.getYear()));
	




	}	
}
