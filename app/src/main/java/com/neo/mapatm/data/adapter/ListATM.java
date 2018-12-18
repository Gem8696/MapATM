package com.neo.mapatm.data.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.neo.mapatm.R;
import com.neo.mapatm.data.Model.ATM;

import java.util.List;

public class ListATM extends BaseAdapter {
    private Context mcontext;
    private List<ATM> mATMList;


    public ListATM(Context mcontext, List<ATM> mATMList) {
        this.mcontext = mcontext;
        this.mATMList = mATMList;
    }


    @Override
    public int getCount() {
        return mATMList.size();
    }

    @Override
    public Object getItem(int position) {
        return mATMList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mATMList.get(position).getMA_ATM();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;

    }
}
