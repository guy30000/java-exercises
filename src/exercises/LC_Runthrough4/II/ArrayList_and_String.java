package exercises.LC_Runthrough4.II;

public class ArrayList_and_String {
    public static void main(String[] args) {


    String[] stringList = new String[10];

        stringList[0]="nacho";
        stringList[1]="butt";
        stringList[2]="potato";
        stringList[3]="face";
        stringList[4]="doggie";
        stringList[5]="monkey";
        stringList[6]="tacos";
        stringList[7]="tires";
        stringList[8]="grass";
        stringList[9]="thing";
    for (int i = 0;i<stringList.length;i++){
        if (stringList[i].length()==5)System.out.println(stringList[i]);
    }

}
}
