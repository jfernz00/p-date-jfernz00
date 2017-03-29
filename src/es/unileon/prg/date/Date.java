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

//MONTH_NAME
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
	
//CHECH
	public String checkMonthDays(int month){
		int numDay=0;
		switch(month){
			
			case 2:  numDay=28;
				break;
			case 4: //next
			case 6: //next
			case 9: //next
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


//SEASON
	public String seasonOfTheMonth(int month,int day){
		String season="";

		switch(month){
			case 1: season="INVIERNO";
				break;
			case 2: season="INVIERNO";
				break;
			case 3: 
				if (_day<=21){season="INVIERNO";
				}
				else{season="PRIMAVERA";
				}
				break;
			case 4: season="PRIMAVERA";
				break;
			case 5: season="PRIMAVERA";
				break;
			case 6: 
				if (_day<=21){season="PRIMAVERA";
				}
				else{season="VERANO";
				}
				break;
			case 7: season="VERANO";
				break;
			case 8: season="VERANO";
				break;
			case 9: if (_day<=23){season="VERANO";
				}
				else{season="OTOÑO";
				}
				break;
			case 10: season="OTOÑO";
				break;
			case 11: season="OTOÑO";
				break;
			case 12:if (_day<=21){season="OTOÑO";
				}
				else{season="INVIERNO";
				}
				break;
			}
	return season;
	}

//MOTHS_UNTIL_YEAR_ENDS
	public int monthsUntilYearEnd(int month){
		int left=0;
			for(int i=month; i<=12;i++){
				left++;
			}
	return left;
	}
	
//PRINT_DATE
	public String printDate(int day, int month, int year){
		
		String printDate=day+" / "+month+" / "+year;
	return printDate;
	}

//COUNT_DAYS_TILL_END
	public int countDaysTillNewYear(int day, int month, int year){
		int counter=0;
		int numDay=0;
		int resto=day;
				
		for(int i=month; i<=12;i++){
			switch(i){
				case 1: numDay=31;
					counter=counter+numDay;
					break;
				case 2:  numDay=28;
					counter=counter+numDay;
					break;
				case 3:  numDay=31;
					counter=counter+numDay;
					break;
				case 4: numDay=30;
					counter=counter+numDay;
					break;
				case 5: numDay=31;
					counter=counter+numDay;
					break;
				case 6: numDay=30;
					counter=counter+numDay;
					break;
				case 7:  numDay=31;
					counter=counter+numDay;
					break;
				case 8:  numDay=31;
					counter=counter+numDay;
					break;
				case 9: numDay=30;
					counter=counter+numDay;
					break;
				case 10: numDay=31;
					counter=counter+numDay;
					break;
				case 11:  numDay=30;
					counter=counter+numDay;
					break;
				case 12:  numDay=31;
					counter=counter+numDay;
					break;
			}

			counter=counter-resto;
		}
	return counter;
	}






}
