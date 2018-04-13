package app.uangkas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by Lazday Indonesia
 * www.lazday.com
 * on 5/18/2017.
 */

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    startActivity(new Intent(Splashscreen.this, MainActivity.class));
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
