package lab_9_Polimorphizm;

public class SmartPhone extends MobilePhone {
    public SmartPhone(String name) {
        super(name);
    }

    @Override
    public void ring() {
        System.out.println(getName()+": Я на беззвучке...Бзззззззз");
    }
}
