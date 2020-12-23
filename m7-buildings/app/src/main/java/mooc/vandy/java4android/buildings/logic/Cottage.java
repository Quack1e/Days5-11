package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
       extends House {

    // TODO - Put your code here.
    private boolean mSecondFloor;

    //constructors
    public Cottage(int dimension, int lotlength, int lotwidth){
      super(dimension,dimension,lotlength,lotwidth);
    }
    public Cottage(int dimension, int lotlength, int lotwidth, String owner, boolean secondFloor){
        this(dimension,lotlength,lotwidth); // should I call super() constructor here?
        mOwner = owner;
        mSecondFloor = secondFloor;
    }

    //accessor
    public boolean hasSecondFloor(){
        return mSecondFloor;
    }

    //toString
    public String toString(){
        String additional = ";is a cottage ";
        if(mSecondFloor){
            additional+="with two floors";
        }
        return super.toString() + additional;
    }
}

