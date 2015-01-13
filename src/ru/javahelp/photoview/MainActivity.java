package ru.javahelp.photoview;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import uk.co.senab.photoview.*;
import android.view.View.*;
import org.json.*;
import android.util.*;

public class MainActivity extends Activity{

	Button viewPager, photoView;
	Context context = this;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	
        photoView = (Button) findViewById(R.id.btnPhotoView);
		viewPager = (Button) findViewById(R.id.btnViewPager);
		photoView.setOnClickListener(onClick);
		viewPager.setOnClickListener(onClick);
    }

	OnClickListener onClick = new OnClickListener(){

		@Override
		public void onClick(View v)
		{
			switch(v.getId()){
				case R.id.btnPhotoView:
					startActivity(new Intent(context, PhotoViewActivity.class));
				break;
				
				case R.id.btnViewPager:
					startActivity(new Intent(context, ViewPagerActivity.class));
					break;
			}
		}

		
	};
	
}
