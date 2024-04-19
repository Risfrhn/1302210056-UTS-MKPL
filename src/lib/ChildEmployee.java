package lib;

public class ChildEmployee {
    private String childNames;
    private String childIdNumbers;

    public ChildEmployee(String childName,String childIdNumber) {
        this.childNames = childName;
        this.childIdNumbers = childIdNumber;
    }

    public String getChildName() {
        return childNames;
    }

    public void setChildName(String childName) {
        this.childNames = childName;
    }

    public String getChildIdNumber() {
        return childIdNumbers;
    }

    public void setChildIdNumber(String childIdNumber) {
        this.childIdNumbers = childIdNumber;
    }
}
