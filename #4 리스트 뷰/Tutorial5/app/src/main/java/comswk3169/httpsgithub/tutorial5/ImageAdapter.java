package comswk3169.httpsgithub.tutorial5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by swk31 on 2018-01-27.
 */

public class ImageAdapter extends ArrayAdapter<String>{
    ImageAdapter(Context context, String[] items){
        super(context, R.layout.image_layout, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater imageInflater = LayoutInflater.from(getContext());
        View view = imageInflater.inflate(R.layout.image_layout, parent, false);
        String item = getItem(position);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        textView.setText(item);
        imageView.setImageResource(R.mipmap.mug_obj_201707211445221964);
        return view;
    }
}
