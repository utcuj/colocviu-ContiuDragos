import javax.security.auth.login.AccountNotFoundException;

public class Companie {
    protected TeamLeader[] teamLeaders = new TeamLeader[2];
    protected Manager manager = new Manager();
    protected Developer[] developers = new Developer[4];
    protected int nrAngajati;
    private int nrTeamLeader;
    private int nrDevelopers;

    public Companie()
    {

    }
    public void adaugaAngajati(Angajat angajat)
    {
        if(angajat.getTip().equals("developer"))
            developers[nrDevelopers++]=new Developer(angajat.getNume(),angajat.getVarsta(),angajat.getAniExperienta(),angajat.getTarifPeOra(),angajat.getOreLucrate(),angajat.getNivel(),angajat.getTask(),"developer");
        else
        {
            if(angajat.getTip().equals("manager"))
                manager = new Manager(angajat.getNume(),angajat.getVarsta(),angajat.getAniExperienta(),angajat.getTarifPeOra(),angajat.getOreLucrate(),angajat.getNivel(),"manager");
            else
                teamLeaders[nrTeamLeader++]= new TeamLeader(angajat.getNume(),angajat.getVarsta(),angajat.getAniExperienta(),angajat.getTarifPeOra(),angajat.getOreLucrate(),angajat.getNivel(),"developer");
        }

        System.out.println("Angajat adaugat cu succes");
    }
    public void stergeAngajat(Angajat angajat)
    {
        if(angajat.getTip().equals("developer"))
        {
            for(int i=0;i<nrDevelopers;i++)
                if(angajat.equals(developers[i]))
                {
                    developers[i]=null;
                }
        }
        else
        {
            if(angajat.getTip().equals("manager"))
                manager = null;
            else
            {
                for(int i=0;i<nrTeamLeader;i++)
                    if(angajat.equals(teamLeaders[i]))
                        teamLeaders[i]=null;
            }
        }

        System.out.println("Angajat sters");
    }

    public int afisareSalariu(Angajat angajat)
    {
        return angajat.calculeazaSalariu();
    }

}
