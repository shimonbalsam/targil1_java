import java.util.Date;


 enum VolunteerLevel {
    SPIRITUAL,
   PHYSICAL,
    MUSICAL
}


abstract public class CommunityMem implements ChovotZechuyot {
    private int Id;
    private String Name;
    private String Gender;
    private String Address;
    private Date Birthday;
    private int TorahHours;
    private int WorkHours;
    private int Salary;
    private int UsedFromGemach;
    private VolunteerLevel VolunteerLevel;

    public VolunteerLevel getVolunteerLevel() {
        return VolunteerLevel;
    }

    public void setVolunteerLevel(VolunteerLevel volunteerLevel) {
        this.VolunteerLevel = volunteerLevel;
    }


    public CommunityMem(VolunteerLevel volunteerLevel, int id, String name, String gender, String address, Date birthday, int torahHours, int workHours, int salary, int usedFromGemach) {
        Id = id;
        Name = name;
        Gender = gender;
        Address = address;
        Birthday = birthday;
        TorahHours = torahHours;
        WorkHours = workHours;
        Salary = salary;
        UsedFromGemach = usedFromGemach;
        VolunteerLevel  = volunteerLevel;
    }


    // *****************Setters ********************** //

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public void setTorahHours(int torahHours) {
        TorahHours = torahHours;
    }

    public void setWorkHours(int workHours) {
        WorkHours = workHours;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void setUsedFromGemach(int usedFromGemach) {
        UsedFromGemach = usedFromGemach;
    }

    // ***************** Getters ********************** //


    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public int getTorahHours() {
        return TorahHours;
    }

    public int getWorkHours() {
        return WorkHours;
    }

    public int getSalary() {
        return Salary;
    }

    public int getUsedFromGemach() {
        return UsedFromGemach;
    }


}
