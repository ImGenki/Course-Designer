package com.example.coursedesigner.obstacles;

import com.example.coursedesigner.R;

import java.util.ArrayList;
import java.util.List;

public class DatasObstacles {

    public static List<Obstacle> getObstacleList(){
        List<Obstacle> listObstacles = new ArrayList<>();

        Obstacle vertical = new Obstacle();
        vertical.setName("Vertical");
        vertical.setImage(R.drawable.vertical);
        listObstacles.add(vertical);

        Obstacle oxer = new Obstacle();
        oxer.setName("Oxer");
        oxer.setImage(R.drawable.oxer);
        listObstacles.add(oxer);

        Obstacle croix = new Obstacle();
        croix.setName("Croix");
        croix.setImage(R.drawable.croix);
        listObstacles.add(croix);

        Obstacle spa = new Obstacle();
        spa.setName("Spa");
        spa.setImage(R.drawable.spa);
        listObstacles.add(spa);

        Obstacle mur = new Obstacle();
        mur.setName("Mur");
        mur.setImage(R.drawable.mur);
        listObstacles.add(mur);

        Obstacle riviere = new Obstacle();
        riviere.setName("Rivière");
        riviere.setImage(R.drawable.riviere);
        listObstacles.add(riviere);

        return listObstacles;
    }
}
