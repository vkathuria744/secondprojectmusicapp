package quizapp.com.secondproject;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TopGrossingAdapter extends ArrayAdapter<TopGrossing> {

    // use of adapter for the internal storage //

    public TopGrossingAdapter(Activity context, ArrayList<TopGrossing> topGrossings) {

        super(context, 0, topGrossings);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.topgrossingcomponent, parent, false);

        }

        TopGrossing currenttopgrosing = getItem(position);

        TextView SongNameTextView = (TextView) listItemView.findViewById(R.id.text_view1);
        // setting text on song name //
        SongNameTextView.setText(currenttopgrosing. getSongName());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.text_view2);
        // setting text on song name //
        artistTextView.setText(currenttopgrosing. getArtist());

        TextView albumTextView = (TextView) listItemView.findViewById(R.id.text_view3);
        // setting text on song name //
        albumTextView.setText(currenttopgrosing. getAlbum());

        ImageView albumImageView = (ImageView) listItemView.findViewById(R.id.image_view1);
        // setting image //
        albumImageView.setImageResource(currenttopgrosing. getImageResourceId());

        return listItemView;

    }


}


