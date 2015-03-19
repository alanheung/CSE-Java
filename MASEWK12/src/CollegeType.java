
public enum CollegeType {
	AIT,//0
	DCU,//1
	NUIG,//2
	WIT;//3
	
	@Override
	public String toString(){
		String s = "";
		if(this.ordinal() ==0){
			s = "The college is AIT";
		}else if(this.ordinal() ==1){
			s = "The college is DCU";
		}else if(this.ordinal() ==2){
			s = "The college is NUIG";
		}else{
			s = "The college is WIT";
		}
		return s;
	}
}
