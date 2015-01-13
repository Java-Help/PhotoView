package ru.javahelp.photoview;
import uk.co.senab.photoview.*;
import android.os.*;
import android.app.*;

public class PhotoViewActivity extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_view);
        PhotoView photoView = (PhotoView)findViewById(R.id.iv_photo);
		photoView.setImageResource(R.drawable.wallpaper);
    }

}

