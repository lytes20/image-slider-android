package ga.lytestech.imagesliderandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by gideon_bamuleseyo on 11/5/17.
 */

public class MyAdapter extends BaseAdapter {
    public LayoutInflater inflater;
    public Context mContext;
    public String [] mText;

    public MyAdapter(Context mContext, String[] mText) {
        this.mContext = mContext;
        this.mText = mText;
    }

    @Override
    public int getCount() {
        return mText.length;
    }

    @Override
    public Object getItem(int i) {
        return mText[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridView = view;
        if(view == null){

            inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.grid_item, null);

        }
        TextView categoryName = (TextView) gridView.findViewById(R.id.tV);
        categoryName.setText(mText[i]);

        return gridView;
    }
}
