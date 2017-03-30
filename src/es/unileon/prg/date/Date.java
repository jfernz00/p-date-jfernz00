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


//----------------------- SIN IF--------------------

	public boolean isSameDayWithOutIf(int day){
	return (_day==day);
	}

	public boolean isSameMonthWithOutIf(int month){
	return (_month==month);
	}
	
	public boolean isSameYearWithOutIf(int year){
	return (_year==year);
	}

	public boolean isSameWithOutIf(int day, int month, int year){
	return (((_month==month)&&(_day==day))&&(_year==year));
	}

//-------------------------------------------------------



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


//Cuenta numero dias del mes (ayuda)
	public int countMonthDays (int month){
		int numDay=0;
			switch(month){
				//28				
				case 2:  numDay=28;
					break;
				//30
				case 4://next
				case 6://next
				case 9://next
				case 11:numDay=30;
					break;
				//31
				default:numDay=31;
					break;
			}
		return numDay;
		}

//DAYS_TILL_MONTH_END
	public int countDaysForNextMonth(int day, int month){
		int counter=0;
		int numDay=0;
		
		//numero de dias del mes - dia actual = FALTAN
			switch(month){
				//28				
				case 2:  numDay=28;
					counter=numDay-day;
					break;
				//30
				case 4://next
				case 6://next
				case 9://next
				case 11:numDay=30;
					counter=numDay-day;
					break;
				//31
				default:numDay=31;
					counter=numDay-day;
					break;
			}
		return counter;
		}

//EXTRA_DAYS_TILL_YEAR_END
	public int countDaysTillNewYear(int day, int month){
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
		}
		counter=counter-resto;
	return counter;
	}

//COMPARA MESES CON MISMOS DIAS
	public int compareMonth(int month){
		int counter=0;
		int similarDays=countMonthDays(_month);
		for (int i=month-month; i<=12;i++){
			int compare=countMonthDays(i);
			if( similarDays==compare){
				counter++;		
			}
		}
	return counter;
	}

//DIAS DESDE PRIMERO DE AÑO

	public int daysSinseFirstOfTheYear(int day,int month){
		int sinceFisrt=0;
		int last=365-countDaysTillNewYear(_day,_month);
		return last;



//APTTEMS TO EQUAL
	
	//TERMINAR esta mal
	public int apttemsToEqualDate(int day,int month){
		int randomDay=0;
		int randomMonth=0;
		int cont=0;

		while ((randomDay!=_day) || (randomMonth!=_month)){
			cont++;
		}
	return cont;
	}
}






