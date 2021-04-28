package lab_9_Polimorphizm;

public class Main {
    public static void main(String[] args) {

        Telephone phone = new Telephone("Phone");
        Telephone mobilePhone = new MobilePhone("Mobilephone");
        Telephone smartPhone = new SmartPhone("Smartphone");
        Telephone palmtop = new Palmtop("КПК");
        Telephone[] arr = {phone, mobilePhone, smartPhone, palmtop};
        for (int i = 0; i < arr.length; i++) {
            arr[i].ring();
        }
    }
}
