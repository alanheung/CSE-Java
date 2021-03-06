import java.util.Date;

public class ImmutableClass {
	private final Integer i;//immutable
	private final String s;//immutable
	private final Date d;//mutable

	private ImmutableClass(Integer i, String s, Date d){
		this.i=i;
		this.s=s;
		this.d=new Date(d.getTime());//copy object of it because its mutable
	}
	
	//factory method
	public static ImmutableClass createNewInstance(Integer i, String s, Date d){
		return new ImmutableClass(i,s,d);
	}
	
	//get methods
	public Integer getInteger(){
		return i;//immutable so thats ok
	}
	public String getString(){
		return s;//immutable so thats ok
	}
	public Date getDate(){
//		return new Date(d.getTime());//mutable, cannot use return d, instead we'll create a new reference and protect the original reference
		return d;
	}
	
	@Override
	public String toString(){
		return i + ", "+ s +", " + d;
	}
	
	public static void main(String [] args){
		ImmutableClass ic = ImmutableClass.createNewInstance(100, "test", new Date());
		System.out.println("Before : "+ic);
//		ic.getInteger().s=7;
		changeIt(ic.getInteger(), ic.getString(), ic.getDate());
		System.out.println("After : "+ic);
	}
	
	public static void changeIt(Integer i, String s, Date d){
		i=9;
		s="abc";
		d.setTime(8888);
	}
}
