public class Athlete extends Person{
    private String clubTeam;

    public Athlete(String first, String last, String phone, String club){
        super(first, last,phone);
        this.clubTeam = club;
    }

    public String getClubTeam() {
        return clubTeam;
    }
    public String toString(){
        return super.toString() + " Club: " + clubTeam;
    }
}
