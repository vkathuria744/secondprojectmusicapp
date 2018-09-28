package quizapp.com.secondproject;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewReleasesAdapter extends ArrayAdapter<NewReleases> {

    public NewReleasesAdapter(Activity context, ArrayList<NewReleases> newreleases){

        super(context, 0, newreleases);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.newreleases, parent, false);
            }

            NewReleases currentnewreleases = getItem(position);

        TextView nameTextView = (TextView)listItemView.findViewById(R.id.textView5);
        nameTextView.setText(currentnewreleases.getArtistName());

        ImageView singerImageView = (ImageView)listItemView.findViewById(R.id.imageView2);
        singerImageView.setImageResource(currentnewreleases.getImageResourceId());

        return listItemView;
    }

}
