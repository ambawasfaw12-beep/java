public class Replacepro {

    public static void main(String[] args) {

        // String str1 = "Software Engineering";
        // String str2 = str1.substring(2, 9);
        // System.out.println(str2);

        // String str3 = str1.replace("Software Engineering", "add");
        // System.out.println(str3);

        // String str4 = str1.concat(" is awsome!").concat(" and i want to be good at
        // it");
        // System.out.println(str4);

        // String str5 = " this is fucking awsome ";
        // str5 = str5.trim();
        // System.out.println(str5);

        StringBuffer sb = new StringBuffer("Software ");
        sb.append("Engineering");
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.delete(2, 5);
        System.out.println(sb);

        sb.replace(0, 2, "information technology ");
        System.out.println(sb);

        sb.insert(3, " no ");
        System.out.println(sb);

    }
}
