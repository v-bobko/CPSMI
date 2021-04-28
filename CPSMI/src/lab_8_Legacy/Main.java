package lab_8_Legacy;

public class Main {
    public static void main(String[] args) {
        Student1 petrov = new Student1() {
            @Override
            public int getMark() {
                return 3;
            }
        };
        Student2 sidorov = new Student2() {
            @Override
            public String getName() {
                return "Сидоров";
            }
        };
        Student3 ivanov = new Student3();

        System.out.println(petrov.getName() + " получил " + petrov.getMark());
        System.out.println(sidorov.getName() + " получил " + sidorov.getMark());
        System.out.println(ivanov.getName() + " получил " + ivanov.getMark());

    }
}
