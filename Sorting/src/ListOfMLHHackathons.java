import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfMLHHackathons {
    List<String> MLHHackathons;
    public static void main(String[] args) {
        ListOfMLHHackathons s  = new ListOfMLHHackathons();

        s.MLHHackathons = new ArrayList<>();

        s.MLHHackathons.add("CruzHacks");
        s.MLHHackathons.add("Elle Hacks");
        s.MLHHackathons.add("Hack the North");
        s.MLHHackathons.add("Hack the Northeast Beyond");
        s.MLHHackathons.add("SB Hacks");
        s.MLHHackathons.add("HackDavis");
        s.MLHHackathons.add("Rose Hack");
        s.MLHHackathons.add("BoilerMake");
        s.MLHHackathons.add("Hack Your Portfolio");

        Collections.sort(s.MLHHackathons);

        System.out.println(s.MLHHackathons);



    }
}
