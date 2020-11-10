public class Developer extends Angajat {

    private int bonus;
    public Developer(String nume, int varsta, int aniExperienta, int tarifPeOra, int oreLucrate, int nivel, String task, String tip)
    {
        super(nume,varsta,aniExperienta,tarifPeOra,oreLucrate,nivel,tip,task);
    }

    public int calculeazaSalariu()
    {
        bonus=this.getTarifPeOra()*this.getOreLucrate();
        if(this.getNivel()==1)
            bonus+=100;
        else
            bonus+=200;
        return bonus;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String afiseazaTask()
    {
        return this.getNume()+"\nCe face:"+task;
    }
}
