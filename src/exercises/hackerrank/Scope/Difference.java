package exercises.hackerrank.Scope;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        elements = a;
    }


    public int computeDifference() {
        int low = elements[0];
        int high = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i]>high)high=elements[i];
            if (elements[i]<low)low=elements[i];
            }
        maximumDifference = high-low;
        System.out.println(maximumDifference);
        return maximumDifference;
    }


}
