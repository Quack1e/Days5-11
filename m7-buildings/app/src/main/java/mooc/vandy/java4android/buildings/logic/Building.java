package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // TODO - Put your code here.

    protected int mWidth;
    protected int mLength;
    protected int mLotLength;
    protected int mLotWidth;

    public Building(int length, int width, int lotlength, int lotwidth){
        mWidth= width;
        mLength= length;
        mLotLength= lotlength;
        mLotWidth= lotwidth;
    }

    // all basic accessors and mutators
    public int getLength(){
        return mLength;
    }
    public int getWidth(){
        return mWidth;
    }
    public int getLotLength(){
        return mLotLength;
    }
    public int getLotWidth(){
        return mLotWidth;
    }
    public void setLotLength(int l) {
        mLotLength = l;
    }
    public void setLength(int l) {
        mLength = l;
    }
    public void setLotWidth(int w) {
        mLotWidth = w;
    }
    public void setWidth(int w) {
        mWidth = w;
    }

    //area methods
    public int calcLotArea(){
        return mLotWidth*mLotLength;
    }
    public int calcBuildingArea(){
        return mWidth*mLength;
    }

    //basic toString Method
    public String toString(){
        return "a "+ mLength+ " by " +mWidth+ " building";
    }
}
