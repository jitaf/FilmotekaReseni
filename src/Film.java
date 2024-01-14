class Film {
    private String nazev;
    private int rokVydani;
    private int hodnoceni;
    private Herec[] herci;

    public Film(String nazev, int rokVydani, int hodnoceni, Herec[] herci) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.hodnoceni = hodnoceni;
        this.herci = herci;
    }

    public String getNazev() {
        return nazev;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public int getHodnoceni() {
        return hodnoceni;
    }

    public Herec[] getHerci() {
        return herci;
    }
}
