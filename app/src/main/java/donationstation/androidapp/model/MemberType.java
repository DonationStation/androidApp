package donationstation.androidapp.model;
import java.util.ArrayList;

/**
 * Class to hold boolean flags for Member Types
 */
public enum MemberType {
    USER (false, false, false, false),
    ADMIN (true, true, true, false),
    EMPLOYEE (false, false, false, true),
    MANAGER (false, false, false, true);

    private final ArrayList<Boolean> boolValues;
    /**
     * Value1: Add/Remove Users
     * Value2: Add/Remove Locations
     * Value3: Lock/Unlock Accounts
     * Value4: Add item to location
     */
    MemberType (boolean value1, boolean value2, boolean value3, boolean value4) {
        boolValues = new ArrayList<>();
        boolValues.add(value1);
        boolValues.add(value2);
        boolValues.add(value3);
        boolValues.add(value4);
    }

    /**
     * the arraylist of boolean values
     * @return boolean array list
     */
    public ArrayList<Boolean> getBoolValues() {
        return boolValues;
    }
}
