package com.samples.app.broadcastsender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends Activity implements View.OnClickListener {

    private static final String ACTION = "com.sample.media.PLAYER";
    private static final String TYPE = "type";
    private static final int ID_ACTION_STOP = 1;
    private static final int ID_ACTION_PLAY = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_Start:
                Intent intent_start = new Intent(ACTION);
                intent_start.putExtra(TYPE, ID_ACTION_PLAY);
                sendBroadcast(intent_start);
                break;
            case R.id.btn_Stop:
                Intent intent_stop = new Intent(ACTION);
                intent_stop.putExtra(TYPE, ID_ACTION_STOP);
                sendBroadcast(intent_stop);
                break;
        }
    }
}
