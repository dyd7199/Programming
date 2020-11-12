import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OkJavaGoinInput {
    //Parameter , 매개변수 args -> configurations세팅에서 사용자가 직접 정해준 인자값을
    //args로 받아오게 된다. 테스트할때 아주 좋은 기능 이라고 생각
    public static void main(String[] agrs){

        //String id = "JAVA APT 507";
        //String id = JOptionPane.showInputDialog("Enter a ID");
        String id = agrs[0];
        String bright = agrs[1];



        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);


        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();
        Lighting floorLamp = new Lighting(id+" / floor Lamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id+"moodLamp");
        moodLamp.setBright(Double.parseDouble((bright)));   // string을 double형으로 바꿈
        moodLamp.on();

    }
}
