package info.guardianproject.iocipher.server;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockActivity;

public class TabNavigation extends SherlockActivity implements ActionBar.TabListener {
    private TextView mSelected;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //setTheme(SampleList.THEME); //Used for theme switching in samples
        super.onCreate(savedInstanceState);

      //  setContentView(R.layout.tab_navigation);
       // mSelected = (TextView)findViewById(R.id.text);

        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab tab = getSupportActionBar().newTab();
        tab.setText("Share");
        tab.setTabListener(this);
        getSupportActionBar().addTab(tab);
        
        tab = getSupportActionBar().newTab();
        tab.setText("Browse");
        tab.setTabListener(this);
        getSupportActionBar().addTab(tab);
    }

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction transaction) {
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction transaction) {
        
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction transaction) {
    }
}
