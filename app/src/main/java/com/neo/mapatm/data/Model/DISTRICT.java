package com.neo.mapatm.data.Model;

public class DISTRICT {
    private int MA_QH;
   private int MA_TINH;
   private String TEN_QH;

    public DISTRICT(int MA_QH, int MA_TINH, String TEN_QH) {
        this.MA_QH = MA_QH;
        this.MA_TINH = MA_TINH;
        this.TEN_QH = TEN_QH;
    }

    public int getMA_QH() {
        return MA_QH;
    }

    public void setMA_QH(int MA_QH) {
        this.MA_QH = MA_QH;
    }

    public int getMA_TINH() {
        return MA_TINH;
    }

    public void setMA_TINH(int MA_TINH) {
        this.MA_TINH = MA_TINH;
    }

    public String getTEN_QH() {
        return TEN_QH;
    }

    public void setTEN_QH(String TEN_QH) {
        this.TEN_QH = TEN_QH;
    }
}
