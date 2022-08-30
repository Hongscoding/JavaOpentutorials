/*
 * 상속시 부모클래스에 생성자함수가있따면
 * 자식클래스는 반드시 부모클래스를 실행시켜야한다
 * => suepr(~~);
 */

class Cal4{
    int v1,v2;
    Cal4(int v1, int v2){
        System.out.println("Cal init!!");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum(){return this.v1+v2;}
}
class Cal3 extends Cal4{
    Cal3(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal3 init!!");
    }
    public int minus(){return this.v1-v2;}
}
public class InheritanceApp2 {
    public static void main(String[] args) {
        Cal4 c = new Cal4(2,1);
        Cal3 c3 = new Cal3(2, 1);
        System.out.println(c3.sum()); // 3
        System.out.println(c3.minus()); // 1
    }
}