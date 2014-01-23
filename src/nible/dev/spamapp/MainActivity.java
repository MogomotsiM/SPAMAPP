package nible.dev.spamapp;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

public class MainActivity extends FragmentActivity {
	 ViewPager viewPager=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        viewPager= (ViewPager) findViewById(R.id.pager);
	        FragmentManager fragmentManager=getSupportFragmentManager();
	        viewPager.setAdapter(new MyAdapter(fragmentManager));
	}

	//@Override
	//public boolean onCreateOptionsMenu(Menu menu) {
	//	// Inflate the menu; this adds items to the action bar if it is present.
	//	getMenuInflater().inflate(R.menu.main, menu);
	///	return true;
	//}

}
