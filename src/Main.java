import java.awt.*;
import java.util.Date;
import java.time.LocalDate;

import static java.awt.PageAttributes.*;

public class Main {
    public static void main(String[] args){
        System.out.print("fff");
        Community community = new Community();
        LocalDate d = LocalDate.now();
        CommunityMem moshe = new Single(1,"moshe","male","kalchaiim",LocalDate.now(),70,30,4000,4,5);
        community.addMemeber(moshe);
        System.out.print(moshe);


    }
}
