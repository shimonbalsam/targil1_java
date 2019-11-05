import java.time.LocalDate;
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
    private LocalDate Birthday;
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


    public CommunityMem(VolunteerLevel volunteerLevel, int id, String name, String gender, String address, LocalDate birthday, int torahHours, int workHours, int salary, int usedFromGemach) {
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
    public CommunityMem(int id, String name, String gender, String address, LocalDate birthday, int torahHours, int workHours, int salary, int usedFromGemach) {
        Id = id;
        Name = name;
        Gender = gender;
        Address = address;
        Birthday = birthday;
        TorahHours = torahHours;
        WorkHours = workHours;
        Salary = salary;
        UsedFromGemach = usedFromGemach;

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

    public void setBirthday(LocalDate birthday) {
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

    public LocalDate getBirthday() {
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


    @Override
    public String toString() {
        return "CommunityMem{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Address='" + Address + '\'' +
                ", Birthday=" + Birthday +
                ", TorahHours=" + TorahHours +
                ", WorkHours=" + WorkHours +
                ", Salary=" + Salary +
                ", UsedFromGemach=" + UsedFromGemach +
                ", VolunteerLevel=" + VolunteerLevel +
                '}';
    }
}
