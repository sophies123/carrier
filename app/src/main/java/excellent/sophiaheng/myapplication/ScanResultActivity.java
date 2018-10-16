package excellent.sophiaheng.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by sophiaheng on 2018/9/24.
 */

public class ScanResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_result);
        TextView tv_result = (TextView) findViewById(R.id.tv_result);
        String result = getIntent().getStringExtra("result");
        tv_result.setText("扫码结果为：" + result);
    }

}