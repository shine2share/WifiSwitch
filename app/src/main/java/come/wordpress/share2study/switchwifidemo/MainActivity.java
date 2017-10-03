package come.wordpress.share2study.switchwifidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch swtWifi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swtWifi = (Switch) findViewById(R.id.swtWifi);

        swtWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(MainActivity.this, "Turn on wifi", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Turn off wifi", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
