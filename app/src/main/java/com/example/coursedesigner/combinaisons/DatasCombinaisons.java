package com.example.coursedesigner.combinaisons;

import com.example.coursedesigner.R;
import com.example.coursedesigner.obstacles.Obstacle;

import java.util.ArrayList;
import java.util.List;

public class DatasCombinaisons {

    public static List<Combinaison> getCombinaisonList(){
        List<Combinaison> listCombinaisons = new ArrayList<>();

        Combinaison double_vertical = new Combinaison();
        double_vertical.setName("Double de verticaux");
        double_vertical.setImage(R.drawable.double_verticaux);
        listCombinaisons.add(double_vertical);

        Combinaison double_oxer_vertical = new Combinaison();
        double_oxer_vertical.setName("Double oxer-vertical");
        double_oxer_vertical.setImage(R.drawable.double_oxer_vertical);
        listCombinaisons.add(double_oxer_vertical);

        Combinaison double_vertical_oxer = new Combinaison();
        double_vertical_oxer.setName("Double vertical-oxer");
        double_vertical_oxer.setImage(R.drawable.double_vertical_oxer);
        listCombinaisons.add(double_vertical_oxer);

        Combinaison double_spa_vertical = new Combinaison();
        double_spa_vertical.setName("Double spa vertical");
        double_spa_vertical.setImage(R.drawable.double_spa_vertical);
        listCombinaisons.add(double_spa_vertical);

        Combinaison triple_oxer_vertical_oxer = new Combinaison();
        triple_oxer_vertical_oxer.setName("Triple oxer vertical oxer");
        triple_oxer_vertical_oxer.setImage(R.drawable.triple_oxer_vertical_oxer);
        listCombinaisons.add(triple_oxer_vertical_oxer);

        Combinaison triple_oxer_vertical_vertical = new Combinaison();
        triple_oxer_vertical_vertical.setName("Triple oxer vertical vertical");
        triple_oxer_vertical_vertical.setImage(R.drawable.triple_oxer_vertical_vertical);
        listCombinaisons.add(triple_oxer_vertical_vertical);

        return listCombinaisons;
    }
}