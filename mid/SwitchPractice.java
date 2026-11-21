package mid;
public class SwitchPractice {
    public static void main(String[] args) {
        char deep = 'e';
        switch (deep) {
            case 'c':
                System.out.println("cs");
                break;
            case 'e':
                System.out.println("ee");
            case 'i':
                System.out.println("it");
            case 'm':
                System.out.println("math");
                break;
            default:
                System.out.println("done");
                break;
        }
    }
}
