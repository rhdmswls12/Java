
class Fruit{
	public static final Fruit APPLE=new Fruit();
	public static final Fruit PEACH=new Fruit();
	public static final Fruit BANANA=new Fruit();
}
class Company{
	public static final Company GOOGLE=new Company();
	public static final Company APPLE=new Company();
	public static final Company ORACLE=new COMPANY(Company);
}
public class ConstantDemo {
	public static void main(String[] args) {
		if(Fruit.APPLE==Company.APPLE) {//서로 다른 카테고리는 비교 불가능
			System.out.println("과일 애플과 회사 애플이 같다.");
		}
	}
}