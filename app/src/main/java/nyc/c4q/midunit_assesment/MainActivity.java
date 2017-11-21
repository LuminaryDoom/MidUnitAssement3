package nyc.c4q.midunit_assesment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add();
        subtract();
    }

    public int add() {
        return 1 + 2;
    }

    public int subtract() {
        return 1 - 2;
    }

}
