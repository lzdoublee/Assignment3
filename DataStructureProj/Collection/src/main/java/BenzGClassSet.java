/**
 * Created by L.z Double E on 3/31/2017.
 */
public class BenzGClassSet {
    private String type;

    public BenzGClassSet(String gType){
        this.type = gType;
    }

    public void setType(String gType) {
        this.type = gType;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "(GClass set{" +
                "Type='" + type + "}";

    }
}
