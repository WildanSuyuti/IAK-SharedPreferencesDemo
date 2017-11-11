package id.co.kakaroto.sharedprefrencesdemoiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvResult = findViewById(R.id.tv_result);

        Me me = new Me(this);
        me.setData("title", " Indonesia Android Kejar");
        tvResult.setText("Halo Dunia" +
                me.getData("title"));
//        me.clear();
    }

    public void submit(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }
}
