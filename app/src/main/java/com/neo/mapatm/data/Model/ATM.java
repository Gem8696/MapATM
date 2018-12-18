package com.neo.mapatm.data.Model;

public class ATM {
    private int MA_ATM,MA_NH,MA_QH;
    private String TEN_ATM,DIA_CHI_ATM;
   private double LAT_ATM,LNG_ATM;



    public ATM(int MA_ATM, int MA_NH, int MA_QH, String TEN_ATM, double LAT_ATM, double LNG_ATM, String DIA_CHI_ATM) {
        this.MA_ATM = MA_ATM;
        this.MA_NH = MA_NH;
        this.MA_QH = MA_QH;
        this.TEN_ATM = TEN_ATM;
        this.LAT_ATM = LAT_ATM;
        this.LNG_ATM = LNG_ATM;
        this.DIA_CHI_ATM = DIA_CHI_ATM;
    }

    public int getMA_ATM() {
        return MA_ATM;
    }

    public void setMA_ATM(int MA_ATM) {
        this.MA_ATM = MA_ATM;
    }

    public int getMA_NH() {
        return MA_NH;
    }

    public void setMA_NH(int MA_NH) {
        this.MA_NH = MA_NH;
    }

    public int getMA_QH() {
        return MA_QH;
    }

    public void setMA_QH(int MA_QH) {
        this.MA_QH = MA_QH;
    }

    public String getTEN_ATM() {
        return TEN_ATM;
    }

    public void setTEN_ATM(String TEN_ATM) {
        this.TEN_ATM = TEN_ATM;
    }

    public double getLAT_ATM() {
        return LAT_ATM;
    }

    public void setLAT_ATM(double LAT_ATM) {
        this.LAT_ATM = LAT_ATM;
    }

    public double getLNG_ATM() {
        return LNG_ATM;
    }

    public void setLNG_ATM(double LNG_ATM) {
        this.LNG_ATM = LNG_ATM;
    }

    public String getDIA_CHI_ATM() {
        return DIA_CHI_ATM;
    }

    public void setDIA_CHI_ATM(String DIA_CHI_ATM) {
        this.DIA_CHI_ATM = DIA_CHI_ATM;
    }
}
