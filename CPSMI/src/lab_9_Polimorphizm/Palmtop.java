package lab_9_Polimorphizm;

public class Palmtop extends MobilePhone{
    public Palmtop(String name) {
        super(name);
    }

    @Override
    public void ring() {
        System.out.println(getName()+": Вообще-то я компьютер, но тоже умею звонить.. дрынь...");
    }
}
