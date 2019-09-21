package exercises.LCexcersizes;

public class IIScountingCharacters {

    public static void main (String[] args){
        String line ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        //String line = "test  mm..";
        char[] charactersInString = line.toCharArray();
        int count = 0;

        for (char character: charactersInString){
            if (Character.isLetter(character)){
                count++;
            }

        }
    System.out.println(count + " total characters");
    }
}
