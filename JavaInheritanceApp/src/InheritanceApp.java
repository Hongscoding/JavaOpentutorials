/*
 * this. 자기자신의
 * super. 부모의
 * this 와 super 로 연관짓는다.
 * 오버로드하고 오버라이딩할때 그것을 좀더 연관지어서 계승하여 발전시킬때
 */
class Cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	//Overloding 같은 이름의 메서드를 형태만 다르게 정의함
	public int sum(int v1, int v2,int v3) {
		return this.sum(v1,v2)+v3;
	}
}
class Cal2 extends Cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	//Overriding 부모 클래스의 메서드를 자식 클래스에서 재정의 하여 사용
	public int sum(int v1, int v2) {
		System.out.println("Cal2!!");
		return super.sum(v1,v2);
	}
}
public class InheritanceApp {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(1,2));
		
		Cal2 a = new Cal2();
		System.out.println(a.sum(1, 2));
		System.out.println(a.minus(1, 2));
	}

}
