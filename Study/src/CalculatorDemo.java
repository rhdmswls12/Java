class Calculator1{
	int left,right;
	public void setOprands(int left,int right) {
		this.left=left;
		this.right=right;
	}
	public void divide() {
		try {
			System.out.print("계산 결과는 ");
			System.out.print(this.left/this.right);
			System.out.print(" 입니다");
		}catch(Exception e) {
			System.out.println("오류가 발생했습니다: "+e.getMessage());
		}
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator1 c1=new Calculator1();
		c1.setOprands(10,0);
		c1.divide();
		
		Calculator1 c2=new Calculator1();
		c2.setOprands(10,5);
		c2.divide();
	}

}
