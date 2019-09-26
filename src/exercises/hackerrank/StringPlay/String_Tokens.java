package exercises.hackerrank.StringPlay;

public class String_Tokens {

    public static void main(String[] args) {

        String s = "He is a very very good boy, isn't he?";
        // Write your code here.
        //s.replaceAll("[^a-zA-Z0-9],'?"," ");
        //s.translate(None, string.punctuation)
        String[] words = s.replaceAll("[^a-zA-Z ]", " ").split("\\s+");

        String str = "This is an example string, right?  Yes!";

        String[] tokens = str.split("[ .,?!]+");

        //String[] words2 = s.split("");
        //String[] words2 = s.split(" [.,!?:;'\"-]+\\s*");


        System.out.println(words.length);
        for (int i=0;i<words.length;i++){
        if (i==words.length-1)System.out.print(words[i]);
            else  System.out.println(words[i]);


///This is givin answer but it still doesnt work
//            String[] tokens = s.split("[^\\p{Alpha}]+");
//
//            int size = (s.isEmpty()) ? 0 : tokens.length;
//            System.out.println(size);
//
//            for(String d : tokens) {
//                System.out.println(d);
//            }

            ///This works
//            s.trim();
//            StringTokenizer st = new StringTokenizer(s,("[_\\@!?.', ]"));
//            int x = st.countTokens();
//            System.out.println(x);
//            while(st.hasMoreTokens()){
//                System.out.println(st.nextToken());
//            }



    }
    }
}
