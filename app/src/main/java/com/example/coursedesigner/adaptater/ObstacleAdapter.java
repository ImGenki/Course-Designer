package com.example.coursedesigner.adaptater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.coursedesigner.R;
import com.example.coursedesigner.obstacles.Obstacle;

import java.util.List;

public class ObstacleAdapter extends BaseAdapter {
    private Context context;
    private List<Obstacle> obstacleList;

    public ObstacleAdapter(Context context, List<Obstacle> obstacleList){
        this.context=context;
        this.obstacleList=obstacleList;
    }




    @Override
    public int getCount() {
        return obstacleList != null ? obstacleList.size() : 0;
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
        View rootView= LayoutInflater.from(context).inflate(R.layout.spinnerobstacle, parent,false);
        TextView text=rootView.findViewById(R.id.nom);
        ImageView image=rootView.findViewById(R.id.image);

        text.setText(obstacleList.get(position).getName());
        image.setImageResource(obstacleList.get(position).getImage());

        return rootView;
    }
}
