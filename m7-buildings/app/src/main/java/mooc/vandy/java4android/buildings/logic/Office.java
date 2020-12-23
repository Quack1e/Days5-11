package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
       extends Building {

    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int mTotalOffices;

    //constructors
    public Office(int length, int width, int lotlength, int lotwidth){
        super(length, width, lotlength, lotwidth);
    }
    public Office(int length, int width, int lotlength, int lotwidth, String businessName){
        this(length, width, lotlength, lotwidth);
        mBusinessName = businessName;
    }
    public Office(int length, int width, int lotlength, int lotwidth, String businessName, int parkingSpaces){
        this(length, width, lotlength, lotwidth, businessName);
        mParkingSpaces = parkingSpaces;
    }

    //accessors and mutators
    public String getBusinessName(){
        return mBusinessName;
    }
    public int getParkingSpaces(){
        return mParkingSpaces;
    }
    public static int getTotalOffices(){
        return mTotalOffices;
    }
    public void setBusinessName(String bn){
        mBusinessName = bn;
    }
    public void setParkingSpaces(int ps){
        mParkingSpaces = ps;
    }

    //toString
    public String toString(){
        String total = "";
        if(mBusinessName == null){
            total+= "unoccupied; ";
        } else{
            total += mBusinessName + "; ";
        }
        if(mParkingSpaces > 0){
            total += "has " +mParkingSpaces +" Parking spaces ";
        }
        total += "(total offices: "+mTotalOffices+")";
        return total;
    }

    //equals
    public boolean equals(Office other){
        if(mLength*mWidth > other.mLength*other.mWidth && mParkingSpaces == other.mParkingSpaces){
            return true;
        }
        return false;
    }
}
