import java.util.StringTokenizer;

public class Stringtokenzer {
    
    public static void main(String[] args){

        String sentence = ("I love Java This is awsome, and better and easy to learn, so i am realy loving it");

        StringTokenizer st = new StringTokenizer(sentence); 

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken(","));
        }
    }
}
