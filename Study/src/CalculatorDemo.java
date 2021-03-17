
class Calculator1{
	int left,right;
	public void setOprands(int left,int right) {
		this.left=left;
		this.right=right;
	}
	public void divide() {
		try {
			System.out.print("계산결과는 ");
			System.out.print(this.left/this.right);
			System.out.print(" 입니다.");
		}catch(Exception e) {
			System.out.println("\ne.getMessage()\n"+e.getMessage());//오류에 대한 기본적인 내용
			System.out.println("\ne.toString()\n"+e.toString());//더 자세한 예외정보
			System.out.println("\ne.printStackTrace()");
			e.printStackTrace();//내부적으로 예외결과 출력
		}
		
	}
}
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator1 c1=new Calculator1();
		c1.setOprands(10, 0);
		c1.divide();
	}

}
