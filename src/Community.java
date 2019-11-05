import java.awt.*;
import java.util.ArrayList;


public class Community {

    ArrayList <CommunityMem> communityMembers;
    public Community() {
        communityMembers = new ArrayList <> ();
    }
    public void addMemeber (CommunityMem member){
        communityMembers.add(member);
    }
    public int totalTax() {
        int tax = 0;
        for (CommunityMem c : communityMembers) {
            tax += c.getSalary() * c.TaxWage() / 100;
        }
        return tax;
    }
    public int maxGemach(CommunityMem mem){
        if (mem instanceof Single)
            return 0;
        int count =  mem.getTorahHours()* mem.getSalary()*10;
        int totalTax = totalTax();
        if (count> totalTax)
            return totalTax();
        return count;
    }
}
