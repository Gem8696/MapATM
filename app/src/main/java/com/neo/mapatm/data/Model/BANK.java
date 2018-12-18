package com.neo.mapatm.data.Model;

public class BANK {
    private int MA_NH;
    private String TEN_NH;

    public BANK(int MA_NH,String TEN_NH)
    {
        this.MA_NH = MA_NH;
        this.TEN_NH = TEN_NH;
    }

    public int getMA_NH() {
        return MA_NH;
    }

    public void setMA_NH(int MA_NH) {
        this.MA_NH = MA_NH;
    }

    public String getTEN_NH() {
        return TEN_NH;
    }

    public void setTEN_NH(String TEN_NH) {
        this.TEN_NH = TEN_NH;
    }
}
