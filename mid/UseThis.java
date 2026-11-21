package mid;
public class UseThis {

    int age;
    String name;

    UseThis() {

    }

    UseThis(int age) {
        this.age = age;
    }

    UseThis(int age, String name) {

        this(age);
        this.name = name;
    }

    public static  void diplayInfo(UseThis usethis){
      System.out.println(usethis.age + " " + usethis.name);
    }

    public static void main(String[] args) {

        UseThis useThis = new UseThis();
        UseThis useThis2 = new UseThis(10);
        UseThis useThis3 = new UseThis(20, "yoseph");

        int age = useThis.age;
        String name = useThis.name;

        int age3 = useThis3.age;
        String name3 = useThis3.name;

        System.out.println(age + " " + name);
        UseThis.diplayInfo(useThis2);
        System.out.println(age3 + " " + name3);

    }
}
