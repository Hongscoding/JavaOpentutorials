package sub1;
//인터페이스 기본 형식
interface Calculable{
	double pi = 3.14;
	int sum(int v1, int v2);
}
interface Printable{
	void print();
}
class RealCal implements Calculable, Printable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	
	public void print() {
		System.out.println("RealCal!!");
	}
}

public class InterFaceApp {
	public static void main(String[] args) {
		RealCal c = new RealCal();
		System.out.println(c.sum(1, 2));
		c.print();
		System.out.println(c.pi);
	}

}
