import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hellow 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p1.write("Hellow 2");
        p1.close();
        //PrintWriter 같은 경우는 생성자가(constructor) 존재하여 인스턴스화를 허용해준다.
        //하지만 Math같은 친구들은 생성자가 없어 불가능 일회용이라고 생각하면 이해가 편함
        //클래스는 설계도 객체는 설계도로 구현한 모든 대상을 의미함
        //클래스를 인스턴스화 하여 각각을 실체화 해주는게 효율적이다.

        //상속 printWrite의 부모는 Write이고 Write의 부모는 Object이다.
        //이로써 printWrite에 없고, Write에 있는 함수라도 PrintWrite로 인스턴스화된
        //객체가 함수사용이 가능하다. 같은 이름을 가진 함수가 있을 수 있다. 하지만 적용되는것은
        // 최하단부의 자식의 함수가 적용됨 override


    }
}
