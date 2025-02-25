class human {
    private String ad;
    private vehicle avtomobil;
    public human(String ad, vehicle avtomobil) {
        this.ad = ad;
        this.avtomobil = avtomobil;
    }
    public String getInfo() {
        return ad + " has " + avtomobil.getMarka()   + avtomobil.getInfo();
    }
}
