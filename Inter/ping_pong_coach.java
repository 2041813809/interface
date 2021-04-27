package Inter;
/*
    具体
    乒乓球学员类
 */

public class ping_pong_coach extends coach implements english {

    public ping_pong_coach() {
    }

    public ping_pong_coach(String name, int age) {
        super(name, age);
    }

    public void English(){
        System.out.println("学英语");
    }

    public void learn(){
        System.out.println("教乒乓球");
    }

}
