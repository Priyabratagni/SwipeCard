package com.example.swipetesting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class SwipeAdapter extends BaseAdapter {
    private Context context;
    private java.util.List<Integer> List;

    public SwipeAdapter(Context context, java.util.List<Integer> list) {
        this.context = context;
        List = list;
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        View view ;
        if ( convertview == null ) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_koloda, viewGroup,false);
        }else{
            view = convertview;
        }
        return view;
    }
}
