//Call Constructor가 출력되었다는 것은 생성자 Fruit이 호출되었다는 것
enum Fruit{
	APPLE("red"),PEACH("pink"),BANANA("yellow");
	public String color;
	Fruit(String color){
		System.out.println("Call Constructor "+this);
		this.color=color;
	}
}
enum Company{
	GOOGLE,APPLE,ORACLE;
}
public class ConstantDemo{
	public static void main(String[] args) {
		Fruit type=Fruit.APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57+" kcal, "+Fruit.APPLE.color);
			break;
		case PEACH:
			System.out.println(34+" kcal"+Fruit.PEACH.color);
			break;
		case BANANA:
			System.out.println(93+" kcal"+Fruit.BANANA.color);
			break;
		}
	}
}