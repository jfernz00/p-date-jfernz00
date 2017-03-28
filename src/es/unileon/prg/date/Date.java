package es.unileon.prg.date;

public class Date {

int _day;
int _month;
int _year;

	
	public Date(int day, int month, int year){
		
		_day = day;
		_month = month;
		_year = year;
	}

//day
	public int getDay(){
		return _day;
	}
//month
	public int getMonth(){
		return _month;
	}
//year
	public int getYear(){
		return _year;
	}

//SAME_YEAR
	public boolean isSameYear(int year){
		boolean same=false;
		if(_year==year){
			same=true;
		}
		return same;
	}

//SAME_MONTH
	public boolean isSameMonth(int month){
		boolean same=false;
		if(_month==month){
			same =true;
		}
		return same;
	}

//SAME_DAY
	public boolean isSameDay(int day){
		boolean same=false;
		if(_day==day){
			same =true;
		}
		return same;
	}


//SAME_DATE
	public boolean isSame(int day, int month, int year){
		boolean same=false;
		if((_year==year) && (_month==month) && (_day==day)){
			same=true;
		}
		return same;
	}

	public String getMonthName(int month){
		String cadMonth="";
		
		switch(month){
			case 1: cadMonth="Enero";
				break;
			case 2: cadMonth="Febrero";
				break;
			case 3: cadMonth="Marzo";
				break;
			case 4: cadMonth="Abril";
				break;
			case 5: cadMonth="Mayo";
				break;
			case 6: cadMonth="Junio";
				break;
			case 7: cadMonth="Julio";
				break;
			case 8: cadMonth="Agosto";
				break;
			case 9: cadMonth="Septiembre";
				break;
			case 10: cadMonth="Octubre";
				break;
			case 11: cadMonth="Noviembre";
				break;
			case 12: cadMonth="Diciembre";
				break;
		}
		return cadMonth;
	}
	
	public String checkMonthDays(int month){
		int numDay=0;
		switch(month){
			
			case 2:  numDay=28;
				break;
			case 4: 
			case 6: 
			case 9:
			case 11:  numDay=30;
				break;
			default: numDay=31;
		}

		String check="Checked... CORRECT";
		if(numDay<=_day){
			check="Checked... INCORRECT NUMBER OF DAYS";
		}
		return check;
	


	}


















}

