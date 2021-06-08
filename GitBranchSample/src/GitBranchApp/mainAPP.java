package GitBranchApp;

public class mainAPP {
	public static void main(String[] args) {
		// 組長第一版本
		System.out.println("1st Version");
		Math Math = new Math();
		System.out.println();
		System.out.println(Math.add(10, 20));
	}
}
class Math{
	int add(int a, int b) {
		return a + b;
	}
}