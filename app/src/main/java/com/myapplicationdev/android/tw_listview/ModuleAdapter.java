package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Modules> {

    private Context context;
    private ArrayList<Modules> modules;
    private TextView tvModuleName;
    private ImageView ivProg;

    public ModuleAdapter(Context context, int resource, ArrayList<Modules> objects) {
        super(context, resource, objects);

        modules = objects;

        this.context = context;

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvModuleName = rowView.findViewById(R.id.tvModuleName);

        ivProg = rowView.findViewById(R.id.ivProg);


        Modules currentModule = modules.get(position);

        tvModuleName.setText(currentModule.getName());

        if(currentModule.isProg()) {
            ivProg.setImageResource(R.drawable.prog);
        }
        else {
            ivProg.setImageResource(R.drawable.nonprog);
        }
        return rowView;
    }





}
