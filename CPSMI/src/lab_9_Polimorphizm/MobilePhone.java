package lab_9_Polimorphizm;

public class MobilePhone extends Telephone {
    public MobilePhone(String name) {
        super(name);
    }

    @Override
    public void ring (){
        System.out.println(getName()+": Играет мелодия....");
    }
}
