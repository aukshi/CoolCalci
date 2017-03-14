package halfpace.coolcalci;

import android.app.Activity;

/**
 * Created by hp on 11-03-2017.
 */

import android.content.Intent;
import android.os.Bundle;

public class Home extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Thread th = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    onPause();
                    startActivity(new Intent("halfpace.coolcalci.Calc"));
                }
            }
        };
        th.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        finish();
    }
}


