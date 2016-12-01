package example.fragmenty1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OverviewFragment.OverviewFragmentActivityListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // ta metoda pochodzi z OverviewFragmentActivityListener
    @Override
    public void onItemSelected(String msg) {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        // sprawdzamy czy fragment istnieje w tej aktywności
        if (fragment != null && fragment.isInLayout()) {
            // ustawiamy tekst we fragmencie
            fragment.setText(msg);
        }
    }
}
