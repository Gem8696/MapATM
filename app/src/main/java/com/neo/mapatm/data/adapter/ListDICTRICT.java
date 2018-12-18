package com.neo.mapatm.data.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.neo.mapatm.R;
import com.neo.mapatm.data.Model.BANK;
import com.neo.mapatm.data.Model.DISTRICT;

import java.util.List;

public class ListDICTRICT extends BaseAdapter
{
    private List<DISTRICT> mDISTRICTList;
    private Context mcontext;

    public ListDICTRICT(List<DISTRICT> mDISTRICTListList, Context mcontext) {
        this.mDISTRICTList = mDISTRICTList;
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return mDISTRICTList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDISTRICTList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mDISTRICTList.get(position).getMA_QH();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mcontext, R.layout.item_listview, null);
        TextView tenquan = (TextView)v.findViewById(R.id.tenquan);
        tenquan.setText(mDISTRICTList.get(position).getTEN_QH());
        return v;

    }
}
