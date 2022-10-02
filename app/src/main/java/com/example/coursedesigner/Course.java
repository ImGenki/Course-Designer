package com.example.coursedesigner;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coursedesigner.adaptater.CombinaisonAdapter;
import com.example.coursedesigner.adaptater.ObstacleAdapter;
import com.example.coursedesigner.combinaisons.DatasCombinaisons;
import com.example.coursedesigner.obstacles.DatasObstacles;

import static com.example.coursedesigner.Display.colorList;
import static com.example.coursedesigner.Display.couleur_actuelle;
import static com.example.coursedesigner.Display.pathList;

public class Course extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner_obstacles;
    private ObstacleAdapter adapterObstacle;

    private Spinner spinner_combinaisons;
    private CombinaisonAdapter adapterCombinaison;
    


    public static Path path= new Path();
    public static Paint paint_brush=new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        //spinners
        spinner_obstacles = findViewById(R.id.spinnerObs);
        adapterObstacle=new ObstacleAdapter(Course.this, DatasObstacles.getObstacleList());
        spinner_obstacles.setAdapter(adapterObstacle);

        spinner_combinaisons=findViewById(R.id.spinnerCombi);
        adapterCombinaison=new CombinaisonAdapter(Course.this, DatasCombinaisons.getCombinaisonList());
        spinner_combinaisons.setAdapter(adapterCombinaison);

/*
        ActivityCompat.requestPermissions(Course.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
        ActivityCompat.requestPermissions(Course.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savetoGallery();
            }
        });

    }
    private void savetoGallery(){
        BitmapDrawable bitmapDrawable=(BitmapDrawable) fond.getDrawable();
        Bitmap bitmap=bitmapDrawable.getBitmap();

        FileOutputStream outputStream=null;
        File file = Environment.getExternalStorageDirectory();

        File dir=new File(file.getAbsolutePath() + "/ImageParcours");
        dir.mkdirs();

        String filename=String.format("%d.png",System.currentTimeMillis());

        File outFile=new File(dir,filename);
        try {
            outputStream=new FileOutputStream(outFile);


        }catch (Exception e){
            e.printStackTrace();
        }
        bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream);
        try {
            outputStream.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
        try {
            outputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }

*/

    }

    public void crayon(View view){
        paint_brush.setColor(Color.BLACK);
        couleurActuelle(paint_brush.getColor());

    }
    public void gomme(View view){
        pathList.clear();
        colorList.clear();
        path.reset();


    }

    public void redColor(View view){
        paint_brush.setColor(Color.RED);
        couleurActuelle(paint_brush.getColor());
    }
    public void blueColor(View view){
        paint_brush.setColor(Color.BLUE);
        couleurActuelle(paint_brush.getColor());
    }

    public void couleurActuelle(int couleur){
        couleur_actuelle = couleur;
        path=new Path();
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(Course.this,"Test"+DatasCombinaisons.getCombinaisonList().get(position), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}