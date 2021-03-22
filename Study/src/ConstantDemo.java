public class ConstantDemo {
	private final static int APPLE=1;
	private final static int PEACH=2;
	private final static int BANANA=3;
	public static void main(String[] args) {
		int type=APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57);
			break;
		case PEACH:
			System.out.println(34);
			break;
		case BANANA:
			System.out.println(93);
			break;
		}
	}

}