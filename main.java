public class Main {
    public static void main(String[] args) {

        Person p = new Person("Budi", 20);

        // ✅ Boleh — lewat method
        System.out.println(p.getName());
        System.out.println(p.getAge());

        p.setAge(25);
        p.setAge(-5);

    }
}
