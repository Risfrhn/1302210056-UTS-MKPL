package lib;

import java.util.LinkedList;
import java.util.List;

public class FamilyEmployee {
    private String spouseName;
    private String spouseIdNumber;
    private List<ChildEmployee> ChildEmployee;

    public FamilyEmployee() {
        ChildEmployee = new LinkedList<>();
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

    public void setSpouseIdNumber(String spouseIdNumber) {
        this.spouseIdNumber = spouseIdNumber;
    }

    public List<ChildEmployee> getChildren() {
        return ChildEmployee;
    }

    public void addChild(String childName, String childIdNumber) {
        ChildEmployee.add(new ChildEmployee(childName, childIdNumber));
    }

}
