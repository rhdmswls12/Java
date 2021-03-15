class Clothes{
	private String color;
	private int size;
	private int id;
	private static int numberOfClothes=0;  //정적 변수

	public Clothes(String c,int s) {  //생성자
		color=c;
		size=s;
		id=++numberOfClothes;
	}
	
	public static int getNumberOfClothes() {  //정적 메소드
		return numberOfClothes;
	}
}
public class ClothingSales{
	public static void main(String args[]) {
		Clothes c1=new Clothes("blue",66);
		Clothes c2=new Clothes("white",55);
		int n=Clothes.getNumberOfClothes();  //정적 메소드이므로 클래스 이름 통해 호출
		System.out.println("지금까지 생성된 옷 개수= "+n);
	}
}

