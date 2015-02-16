
public class Calendar {
	private int year;
			
	public Calendar(int year) {
		this.year = year;
		calculate();
	}
	
	private void calculate(){
		int starkWeek = calculateWeek();
		for(int i=1 ; i<=12 ; i++){
			String str="";
			for(int j=1 ; j<starkWeek ; j++){
				str+="\t";
			}
			int numOfDay;
			if(i == 2){
				if((year % 400 == 0) || (year % 4 == 0 && year % 100 !=0))
					numOfDay=29;
				else
					numOfDay=28;
			}else if(i <= 7){
				numOfDay = (i%2==0) ? 30 : 31;
			}else{
				numOfDay = (i%2==0) ? 31 : 30;
			}
			
			System.out.println(i);
			System.out.println("MON\tTUE\tWED\tTHU\tFRI\tSAT\tSUN");
			for(int j=1 ; j<=numOfDay ; j++){
				str+=j+"\t";
				if((j+starkWeek-1) % 7 == 0)
					str += "\n";
			}
			starkWeek = (starkWeek+numOfDay-1)%7+1;
			System.out.println(str+"\n");
		}
	}
	
	private int calculateWeek(){
		int week=BaseYear.week;
		int yearDay;
		for(int i=BaseYear.week ; i<this.year ; i++){
			if((i % 400 == 0) || (i % 4 == 0 && i % 100 !=0))
				yearDay=366;
			else
				yearDay=365;
			for(int j=1; j<=yearDay ; j++){
				week = (week%7) + 1;
			}
		}
		return week;
	}
}
