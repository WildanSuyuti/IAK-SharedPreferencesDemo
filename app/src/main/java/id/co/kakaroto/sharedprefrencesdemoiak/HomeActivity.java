package id.co.kakaroto.sharedprefrencesdemoiak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView tvResult = findViewById(R.id.tv_result_home);
        tvResult.setText(Me.getInstace().getData("title"));
    }
}
