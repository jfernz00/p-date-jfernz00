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

	public int getDay(){
		return _day;
	}

	public int getMonth(){
		return _month;
	}

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
}


