package mid;
public class Imutable {

    public static void main(String[] args) {
        String name = "Yoseph";
        // name.concat("the");
        // System.out.println(name);
         String name1 = name.concat(" the");
         System.out.println(name1);

        // StringBuffer sb = new StringBuffer(name);
        // System.out.println(sb);
        // sb.append(" the");
        // System.out.println(sb);
    }
}