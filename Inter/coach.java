package Inter;
/*
    抽象
    教练类
 */

public abstract class coach extends people {

    public coach() {
    }

    public coach(String name, int age) {
        super(name, age);
    }

    public abstract void learn();

    public void eat(){
        System.out.println("吃教练菜");
    }
}
