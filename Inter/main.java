package Inter;

public class main {
    public static void main(String[] args) {

        ping_pong_coach ppc = new ping_pong_coach("乒乓球教练",40);
        System.out.println(ppc.getName()+", "+ppc.getAge()+"岁");
        ppc.eat();
        ppc.learn();
        ppc.English();
        System.out.println("--------");

        basketball_coach bbc = new basketball_coach("篮球教练",31);
        System.out.println(bbc.getName()+", "+bbc.getAge()+"岁");
        bbc.eat();
        bbc.learn();
        System.out.println("--------");

        ping_pong pp = new ping_pong("乒乓球学员",18);
        System.out.println(pp.getName()+", "+pp.getAge()+"岁");
        pp.eat();
        pp.learn();
        pp.English();
        System.out.println("--------");

        basketball bb = new basketball("篮球学员",19);
        System.out.println(bb.getName()+", "+bb.getAge()+"岁");
        bb.eat();
        bb.learn();
        System.out.println("--------");
    }
}
