package Inter;
/*
    具体
    乒乓球运动员类
 */

public class ping_pong extends athlete implements english {

    public ping_pong() {
    }

    public ping_pong(String name, int age) {
        super(name, age);
    }

    public void English(){
        System.out.println("学习英语");
    }

    public void learn(){
        System.out.println("学乒乓球");
    }
}
