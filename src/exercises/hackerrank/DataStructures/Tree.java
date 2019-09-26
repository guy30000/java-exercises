package exercises.hackerrank.DataStructures;

public interface Tree<D extends Comparable> {  //1400
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add (D elt);
}
