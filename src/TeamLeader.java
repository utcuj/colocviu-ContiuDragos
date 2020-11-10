public class TeamLeader extends Angajat {

    private int bonus;
    public TeamLeader(String nume, int varsta, int aniExperienta, int tarifPeOra, int oreLucrate, int nivel, String tip)
    {
        super(nume,varsta,aniExperienta,tarifPeOra,oreLucrate,nivel,tip,"");
    }
    public int calculeazaSalariu()
    {
        bonus=this.getTarifPeOra()*this.getOreLucrate();
        if(this.getNivel()==1)
            bonus+=200;
        else
            bonus+=300;
        return bonus;
    }
}
