//인터페이스에서 선언된 변수는 무조건 public static final의 속성을 가진다
interface FRUIT{
	int APPLE=1, PEACH=2, BANANA=3;
}
interface COMPANY{
	int GOOGLE=1,APPLE=2,ORACLE=3;
}
public class ConstantDemo {
	
	//company
	private final static int COMPANY_GOOGLE=1;
	private final static int COMPANY_APPLE=2;
	private final static int COMPANY_ORACLE=3;
	public static void main(String[] args) {
		int type=FRUIT.APPLE;
		switch(type) {
		case FRUIT.APPLE:
			System.out.println(57+" kcal");
			break;
		case FRUIT.PEACH:
			System.out.println(34+" kcal");
			break;
		case FRUIT.BANANA:
			System.out.println(93+" kcal");
			break;
		}
	}

}