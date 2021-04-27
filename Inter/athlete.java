package Inter;
/*
    抽象
    运动员类
 */

public abstract class athlete extends people {

    public athlete() {
    }

    public athlete(String name, int age) {
        super(name, age);
    }

    public abstract void learn();

    public void eat(){
        System.out.println("吃运动员菜");
    }
}
