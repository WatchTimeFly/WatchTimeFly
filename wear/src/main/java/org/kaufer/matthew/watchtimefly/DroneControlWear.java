package org.kaufer.matthew.watchtimefly;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.GestureDetector.OnDoubleTapListener;

public class DroneControlWear extends Activity {

    private TextView mTextView;
    private Button yawLeft, yawRight, altitudeAscend, altitudeDescend, pitchForwards, pitchBackwards, kill, takeoff, land;

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


        yawLeft = (Button)findViewById(R.id.yawLeft);
        yawRight = (Button)findViewById(R.id.yawRight);
        altitudeAscend = (Button)findViewById(R.id.altitudeAscend);
        altitudeDescend = (Button)findViewById(R.id.altitudeDescend);
        pitchForwards = (Button)findViewById(R.id.pitchForwards);
        pitchBackwards = (Button)findViewById(R.id.pitchBackwards);
        kill = (Button)findViewById(R.id.kill);
        takeoff = (Button)findViewById(R.id.takeoff);
        land = (Button)findViewById(R.id.land);


//        addAllListeners();

    }

    public void addListenerOld(View v, GestureDetector.SimpleOnGestureListener listener){
        final GestureDetector gd = new GestureDetector(getApplicationContext(), listener);

        v.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return gd.onTouchEvent(motionEvent);
            }
        });
    }

    public void stopDrone(){
        //stops drone;
    }
    //click is when you release the button, touch is when you first touch it
    public void addListener(Button b, View.OnClickListener ocl, View.OnTouchListener otl){
        b.setOnClickListener(ocl);
        b.setOnTouchListener(otl);
    }
    //for drone control -

    public void addAllListeners(){

        addListener(yawLeft, new View.OnClickListener(){
            public void onClick(View v){
                stopDrone();
            }
        }, new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent e){
                //do some movement on the drone
                return true;
            }
        });

        addListener(yawRight, new View.OnClickListener(){
            public void onClick(View v){
                stopDrone();
            }
        }, new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent e){
                //do some movement on the drone
                return true;
            }
        });

        addListener(altitudeAscend, new View.OnClickListener(){
            public void onClick(View v){
                stopDrone();
            }
        }, new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent e){
                //do some movement on the drone
                return true;
            }
        });

        addListener(altitudeDescend, new View.OnClickListener(){
            public void onClick(View v){
                stopDrone();
            }
        }, new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent e){
                //do some movement on the drone
                return true;
            }
        });

        addListener(pitchBackwards, new View.OnClickListener(){
            public void onClick(View v){
                stopDrone();
            }
        }, new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent e){
                //do some movement on the drone
                return true;
            }
        });

        addListener(pitchForwards, new View.OnClickListener(){
            public void onClick(View v){
                stopDrone();
            }
        }, new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent e){
                //do some movement on the drone
                return true;
            }
        });

        addListener(kill, new View.OnClickListener(){
            public void onClick(View v){
                stopDrone();
            }
        }, new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent e){
                //do some movement on the drone
                return true;
            }
        });

        addListener(land, new View.OnClickListener(){
            public void onClick(View v){
                stopDrone();
            }
        }, new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent e){
                //do some movement on the drone
                return true;
            }
        });

        addListener(takeoff, new View.OnClickListener(){
            public void onClick(View v){
                stopDrone();
            }
        }, new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent e){
                //do some movement on the drone
                return true;
            }
        });

    }

    public void addAllListenersOld(){
        //adds all of the listeners
        addListenerOld(yawLeft, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onDoubleTap(MotionEvent e){
                //special double click thing
                return true;
            }

            @Override
            public boolean onSingleTapConfirmed(MotionEvent e){
                //science!
                return true;
            }
        });

        addListenerOld(yawRight, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onDoubleTap(MotionEvent e){
                //special double click thing
                return true;
            }

            @Override
            public boolean onSingleTapConfirmed(MotionEvent e){
                //science!
                return true;
            }
        });

        addListenerOld(altitudeAscend, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onDoubleTap(MotionEvent e){
                //special double click thing
                return true;
            }

            @Override
            public boolean onSingleTapConfirmed(MotionEvent e){
                //science!
                return true;
            }
        });

        addListenerOld(altitudeDescend, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onDoubleTap(MotionEvent e){
                //special double click thing
                return true;
            }

            @Override
            public boolean onSingleTapConfirmed(MotionEvent e){
                //science!
                return true;
            }
        });

        addListenerOld(pitchBackwards, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onDoubleTap(MotionEvent e){
                //special double click thing
                return true;
            }

            @Override
            public boolean onSingleTapConfirmed(MotionEvent e){
                //science!
                return true;
            }
        });

        addListenerOld(pitchForwards, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onDoubleTap(MotionEvent e){
                //special double click thing
                return true;
            }

            @Override
            public boolean onSingleTapConfirmed(MotionEvent e){
                //science!
                return true;
            }
        });

        addListenerOld(kill, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onDoubleTap(MotionEvent e){
                //special double click thing
                return true;
            }

            @Override
            public boolean onSingleTapConfirmed(MotionEvent e){
                //science!
                return true;
            }
        });
    }
}
