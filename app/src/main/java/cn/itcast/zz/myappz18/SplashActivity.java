package cn.itcast.zz.myappz18;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * asdfasdf
 */
public class SplashActivity extends Activity {

    private String test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView textview = (TextView) findViewById(R.id.tv);

        Toast.makeText(SplashActivity.this, "asdlfasfa", Toast.LENGTH_SHORT).show();

//        textview.setVisibility(View.GONE);


//        System.out.println();

        System.out.println("adf");

        // hello
//        TextView textview = new TextView(this);


        test = test();


    }

    private String test() {

        // TODO: 2016/8/30  明天要干的事

        return "abc";
    }
}
