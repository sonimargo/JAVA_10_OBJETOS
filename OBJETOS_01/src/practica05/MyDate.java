package practica05;

public class MyDate 
{

		private int day;
		private int month;
		private int year;
		
		public MyDate(int day, int month, int year) 
		{
			this.day = day;
			this.month = month;
			this.year = year;
					
		}
		
		public String toString()
		{
			return this.day + "/" + this.month + "/" + this.year;
		}
		
		public boolean esMasJoven (MyDate fechaAcomparar)
		{
			if (this.year < fechaAcomparar.year)
			{
				return true;
			}
			
			if ((this.year == fechaAcomparar.year) && this.month < fechaAcomparar.month)
			{
				return true;
			}
			
			if ((this.year == fechaAcomparar.year) && this.month == fechaAcomparar.month
					&& this.day < fechaAcomparar.day)
			{
				return true;
			}
		
			return false;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
}