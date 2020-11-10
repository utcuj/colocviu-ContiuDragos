public abstract class Angajat {
    private String nume;
    private int varsta;
    private int aniExperienta;
    private int tarifPeOra;
    private int oreLucrate;
    private int nivel;
    private String tip;
    public String task;
    public Angajat()
    {

    }
    public Angajat(String nume, int varsta, int aniExperienta, int tarifPeOra, int oreLucrate, int nivel, String tip, String task)
    {
        this.nume=nume;
        this.varsta=varsta;
        this.aniExperienta=aniExperienta;
        this.tarifPeOra=tarifPeOra;
        this.oreLucrate=oreLucrate;
        this.nivel=nivel;
        this.tip=tip;
        this.task=task;
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    public int getTarifPeOra() {
        return tarifPeOra;
    }

    public void setTarifPeOra(int tarifPeOra) {
        this.tarifPeOra = tarifPeOra;
    }

    public int getOreLucrate() {
        return oreLucrate;
    }

    public void setOreLucrate(int oreLucrate) {
        this.oreLucrate = oreLucrate;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
    public abstract int calculeazaSalariu();
}
