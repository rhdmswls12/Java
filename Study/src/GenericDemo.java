class EmployeeInfo{
	public int rank;
	
	EmployeeInfo(int rank){
		this.rank=rank;
}
class Person<T,S>{
	public T info;
	public S id;
	 
	Person(T info, S id){
		this.info=info;
		this.id=id;
	}

}
public class GenericDemo{
	public void main(String[] args) {
		EmployeeInfo e=new EmployeeInfo(1);
		Integer i=new Integer(10);
		Person<EmployeeInfo,Integer>p1=new Person<EmployeeInfo,Integer>(e,i);
		System.out.println(p1.id.intValue());
	}
}
}
