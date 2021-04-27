package Inter;
/*
    具体
    篮球教练类
 */

public class basketball_coach extends coach {

    public basketball_coach() {
    }

    public basketball_coach(String name, int age) {
        super(name, age);
    }

    public void learn(){
        System.out.println("教篮球");
    }

}
