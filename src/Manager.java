public class Manager extends Angajat{
    private int bonus;

    public Manager( String nume, int varsta, int aniExperienta, int tarifPeOra, int oreLucrate, int nivel, String tip)
    {
        super(nume,varsta,aniExperienta,tarifPeOra,oreLucrate,nivel,tip,"");
    }
    public Manager()
    {

    }

    public void managerAdaugaAngajati(Companie companie,Angajat angajat)
    {
        companie.adaugaAngajati(angajat);
    }
    public int calculeazaSalariu()
    {
        bonus=this.getTarifPeOra()*this.getOreLucrate();
        if(this.getNivel()==1)
            bonus+=300;
        else
            bonus+=400;
        return bonus;
    }
}
