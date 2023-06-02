
public class Java {
	public void method1() {
		System.out.println("You are in method1");
	}
	public int method2() {
		System.out.println("You are in method2");
		return 0;
	}
	public String method3() {
		System.out.println("You are in method3");
		return "";
	}
	public static void main(String[] args) {
		Java j=new Java();
		j.method1();
		j.method2();
		j.method3();
	}

}
