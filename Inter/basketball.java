package Inter;
/*
    具体
    篮球运动员类
 */

public class basketball extends athlete {

    public basketball() {
    }

    public basketball(String name, int age) {
        super(name, age);
    }

    public void learn(){
        System.out.println("学篮球");
    }
}
