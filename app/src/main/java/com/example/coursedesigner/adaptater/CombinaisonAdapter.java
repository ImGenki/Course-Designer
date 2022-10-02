package com.example.coursedesigner.adaptater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.coursedesigner.R;
import com.example.coursedesigner.combinaisons.Combinaison;
import com.example.coursedesigner.obstacles.Obstacle;

import java.util.List;

public class CombinaisonAdapter extends BaseAdapter {
    private Context context;
    private List<Combinaison> combinaisonsList;

    public CombinaisonAdapter(Context context, List<Combinaison> combinaisonsList) {
        this.context = context;
        this.combinaisonsList = combinaisonsList;
    }

    @Override
    public int getCount() {
        return combinaisonsList != null ? combinaisonsList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView= LayoutInflater.from(context).inflate(R.layout.spinnercombinaison, parent,false);
        TextView text=rootView.findViewById(R.id.nomCombi);
        ImageView image=rootView.findViewById(R.id.imageCombi);

        text.setText(combinaisonsList.get(position).getName());
        image.setImageResource(combinaisonsList.get(position).getImage());

        return rootView;
    }
}

