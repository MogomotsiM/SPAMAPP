package nible.dev.spamapp;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {
	public MyAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

	@Override
	public Fragment getItem(int i) {
		Fragment fragment=null;
//      Log.d("VIVZ", "get Item is called "+i);
      if(i==0)
      {
          fragment=new AboutUs();
      }
      if(i==1)
      {
          fragment=new ContactUs();
      }
      if(i==2)
      {
          fragment=new Maps();
      }
      return fragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "About Us";
        }
        if(position==1)
        {
            return "Contact Us";
        }
        if(position==2)
        {
            return "Maps";
        }
        return null;
    }

}
