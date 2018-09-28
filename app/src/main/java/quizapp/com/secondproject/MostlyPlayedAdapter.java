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

public class MostlyPlayedAdapter extends ArrayAdapter<MostlyPlayed> {

    public MostlyPlayedAdapter(Activity context, ArrayList<MostlyPlayed> mostlyPlayeds) {

        super(context, 0, mostlyPlayeds);

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View covertView, @NonNull ViewGroup parent) {

            View listItemView = covertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.mostlyplayed, parent, false);
                }

                MostlyPlayed currentMostlyPlayed = getItem(position);

            TextView albumTextView = (TextView) listItemView.findViewById(R.id.textView2);
            albumTextView.setText(currentMostlyPlayed.getAlbum());

            TextView artistTextView = (TextView) listItemView.findViewById(R.id.textView3);
            artistTextView.setText(currentMostlyPlayed.getArtist());

            TextView durationTextView = (TextView) listItemView.findViewById(R.id.textView4);
            durationTextView.setText(currentMostlyPlayed.getDuration());

            ImageView mostlyplayedImageView = (ImageView) listItemView.findViewById(R.id.imageView);
            mostlyplayedImageView.setImageResource(currentMostlyPlayed.getImageResourceId());


            return listItemView;
            }
}
