import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;

import java.awt.*;
import java.util.AbstractList;
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
    public ArrayList listGemach(){
        ArrayList<Integer> listGemach = new ArrayList<>(3);
        for (CommunityMem c: communityMembers){
            switch (c.getVolunteerLevel()){
                case MUSICAL:
                    listGemach.set(0,listGemach.get(0)+1);
                    break;
                case PHYSICAL:
                    listGemach.set(1,listGemach.get(1)+1);
                    break;
                case SPIRITUAL:
                    listGemach.set(2,listGemach.get(2)+1);
                    break;
            }
        }
        return listGemach;
    }
}
