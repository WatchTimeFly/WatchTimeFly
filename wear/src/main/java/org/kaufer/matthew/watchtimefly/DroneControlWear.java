package org.kaufer.matthew.watchtimefly;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.widget.Button;
import android.widget.TextView;

public class DroneControlWear extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drone_control_wear);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
            }
        });

        Button yawLeft, yawRight, altitudeAscend, altitudeDescend, pitchForwards, pitchBackwards, kill;

        yawLeft = (Button)findViewById(R.id.yawLeft);
        yawRight = (Button)findViewById(R.id.yawRight);
        altitudeAscend = (Button)findViewById(R.id.altitudeAscend);
        altitudeDescend = (Button)findViewById(R.id.altitudeDescend);
        pitchForwards = (Button)findViewById(R.id.pitchForwards);
        pitchBackwards = (Button)findViewById(R.id.pitchBackwards);
        kill = (Button)findViewById(R.id.kill);

    }
}
