package ru.javahelp.photoview;

import uk.co.senab.photoview.PhotoView;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

public class ViewPagerActivity extends Activity {

	private static final String ISLOCKED_ARG = "isLocked";
	
	private ViewPager mViewPager;
	
    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
		
        mViewPager = (HackyViewPager) findViewById(R.id.view_pager);
		mViewPager.setAdapter(new ViewPagerAdapter());
		
		
	}

    private void toggleViewPagerScrolling() {
    	if (isViewPagerActive()) {
    		((HackyViewPager) mViewPager).toggleLock();
    	}
    }
    
    private boolean isViewPagerActive() {
    	return (mViewPager != null && mViewPager instanceof HackyViewPager);
    }
    
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		if (isViewPagerActive()) {
			outState.putBoolean(ISLOCKED_ARG, ((HackyViewPager) mViewPager).isLocked());
    	}
		super.onSaveInstanceState(outState);
	}
    
}
