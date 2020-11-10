import java.util.Scanner;

public class Test {
    public static TeamLeader[] teamLeaders = new TeamLeader[2];
    public static  Manager manager = new Manager();
    public static  Developer[] developers = new Developer[4];
    public static  int nrAngajati;
    public static int nrTeamLeader;
    public static  int nrDevelopers;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Companie companie = new Companie();

        System.out.println("Cati angajati are compania?");
        companie.nrAngajati=in.nextInt();
        System.out.println("Compania are "+companie.nrAngajati+" anagjati");

        teamLeaders[0]=new TeamLeader("Dragos",20,14,10,400,2,"teamLeader");
        teamLeaders[1]=new TeamLeader("Emi",40,20,11,300,1,"teamLeader");
        nrTeamLeader=2;
        manager=new Manager("Andrei",25,14,20,300,2,"manager");
        developers[0]=new Developer("Marius",22,55,47,200,2,"Face Soft","developer");
        developers[1]=new Developer("Dorin",32,5,40,200,2,"Face Interfete","developer");
        developers[2]=new Developer("Sorin",28,50,41,500,1,"Trainer","developer");
        developers[3]=new Developer("Corin",27,44,43,300,2,"Nimic","developer");
        nrDevelopers=4;
        nrAngajati=7;
        System.out.println("Angajati adaugati");

        System.out.println(developers[0].afiseazaTask());
        System.out.println(developers[1].afiseazaTask());

        manager.managerAdaugaAngajati(companie,developers[0]);
        manager.managerAdaugaAngajati(companie,developers[1]);
        manager.managerAdaugaAngajati(companie,developers[2]);
        manager.managerAdaugaAngajati(companie,developers[3]);
        manager.managerAdaugaAngajati(companie,manager);
        manager.managerAdaugaAngajati(companie,teamLeaders[0]);
        manager.managerAdaugaAngajati(companie,teamLeaders[1]);

        companie.stergeAngajat(companie.developers[0]);

        System.out.println(companie.developers[1].getNume()+" "+companie.afisareSalariu(developers[1]));
        System.out.println(companie.manager.getNume()+" "+companie.afisareSalariu(manager));
        System.out.println(companie.teamLeaders[0].getNume()+" "+companie.afisareSalariu(teamLeaders[0]));

    }
}
