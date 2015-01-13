package ru.javahelp.photoview;
import android.view.*;
import uk.co.senab.photoview.*;
import android.widget.TableRow.*;
import android.support.v4.view.*;

public class ViewPagerAdapter extends PagerAdapter {

		private static final int[] images = {R.drawable.wallpaper, R.drawable.wallpaper, R.drawable.wallpaper };

		@Override
		public int getCount() {
			return images.length;
		}

		@Override
		public View instantiateItem(ViewGroup container, int position) {
			
			PhotoView photoView = new PhotoView(container.getContext());
			photoView.setImageResource(images[position]);
			container.addView(photoView, LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

			return photoView;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((View) object);
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view == object;
			}
}
