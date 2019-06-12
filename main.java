import java.util.ArrayList;

public class main {

    static ArrayList<String> orderedSubsets(String s) {
        ArrayList<String> res= new ArrayList<>();

        if(s.length() != 0) {
            for( int i = 0 ; i < s.length() ; i++ ) {
                char first = s.charAt(i);

                ArrayList<String> list = orderedSubsets(s.substring(0, i) + s.substring(i + 1));
                list.forEach(str -> res.add(first + "," + str));

                res.add(Character.toString(first));
            }
        }
        return res;
    }


    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<String> res = orderedSubsets("ABC");
        System.out.println("Number Of Subsets:");
        System.out.println(res.size());
        System.out.println("Subsets:");
        res.forEach(System.out::println);
    }
}
