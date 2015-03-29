package org.kaufer.matthew.watchtimefly;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DroneControlWear extends Activity {
    private Button yawLeft, yawRight, altitudeAscend, altitudeDescend, pitchForwards, pitchBackwards, kill, takeoff, land;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drone_control_wear);

//        Button b = (Button)findViewById(R.id.button);
//
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("test","clicked the button");
//                v.setBackgroundColor(Color.argb(255, 0, 255, 255));
//            }
//        });

        yawLeft = (Button)findViewById(R.id.yawLeft);
        yawRight = (Button)findViewById(R.id.yawRight);
        altitudeAscend = (Button)findViewById(R.id.altitudeAscend);
        altitudeDescend = (Button)findViewById(R.id.altitudeDescend);
        pitchForwards = (Button)findViewById(R.id.pitchForwards);
        pitchBackwards = (Button)findViewById(R.id.pitchBackwards);
        kill = (Button)findViewById(R.id.kill);
        takeoff = (Button)findViewById(R.id.takeoff);
        land = (Button)findViewById(R.id.land);

        addListener(yawLeft, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("move","left turn");
            }
        });

        addListener(yawRight, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("move","right turn");
            }
        });

        addListener(altitudeDescend, new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void addListener(Button b, View.OnClickListener l){
        b.setOnClickListener(l);
    }


}
