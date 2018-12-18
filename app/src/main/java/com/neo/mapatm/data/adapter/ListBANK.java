package com.neo.mapatm.data.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.neo.mapatm.R;
import com.neo.mapatm.data.Model.BANK;

import java.util.List;

public class ListBANK extends BaseAdapter {
    private List<BANK> mBANKList;
    private Context mcontext;

    public ListBANK(List<BANK> mBANKList, Context mcontext) {
        this.mBANKList = mBANKList;
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return mBANKList.size();
    }

    @Override
    public Object getItem(int position) {
        return mBANKList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mBANKList.get(position).getMA_NH();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mcontext, R.layout.item_listview, null);
        TextView tennganhang = (TextView)v.findViewById(R.id.tennganhang);
        tennganhang.setText(mBANKList.get(position).getTEN_NH());
        return v;

    }
}
