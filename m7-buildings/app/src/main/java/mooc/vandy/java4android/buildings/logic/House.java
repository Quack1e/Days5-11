package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
       extends Building {

    // TODO - Put your code here.
    protected String mOwner = null;
    protected boolean mPool;

    //all constructors
    public House(int length, int width, int lotlength, int lotwidth){
       super(length, width, lotlength, lotwidth);
    }
    public House(int length, int width, int lotlength, int lotwidth, String owner){
        this(length, width, lotlength, lotwidth);
        mOwner = owner;
    }
    public House(int length, int width, int lotlength, int lotwidth, String owner, boolean pool){
        this(length, width, lotlength, lotwidth, owner);
        mPool = pool;
    }

    //accessors and mutators
    public String getOwner(){
        return mOwner;
    }
    public boolean hasPool(){
        return mPool;
    }

    public void setOwner(String o){
        mOwner = o;
    }
    public void setPool(boolean p){
        mPool = p;
    }

    //toString
    public String toString(){
        String additional = "";
        if(mPool){
            additional += "; has a pool";
        }else if(mLotLength*mLotWidth > mLength*mWidth){
            additional += "; has a lot of open land";
        }
        if(!(mOwner == null)){
            additional+="; is owned by "+ mOwner;
        }
        //calls the super method with the bonus conditions at the end
        return super.toString() + additional;
    }

    //equals
    public boolean equals(House other){
        if(mLength*mWidth > other.mLength*other.mWidth && mPool == other.mPool){
            return true;
        }
        return false;
    }
}
