package quizapp.com.secondproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicPlayer extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.topgrossing_musicplayer);

        Intent intent = getIntent();
        String topgrossingSongName = intent.getStringExtra("Song Name");
        String topgrossingArtist = intent.getStringExtra("Artist");
        String topgrossingDuration = intent.getStringExtra("Duration");
        int topgrossingAlbumCoverId = intent.getIntExtra("Album cover", R.drawable.placeholder);


        TextView musicplayerSongNameTextView = (TextView) findViewById(R.id.high_end);
        musicplayerSongNameTextView.setText(topgrossingSongName);

        TextView musicplayerArtitTextView = (TextView) findViewById(R.id.artist_song);
        musicplayerArtitTextView.setText(topgrossingArtist);

        TextView musicplayerDurationTextView = (TextView) findViewById(R.id.textView);
        musicplayerDurationTextView.setText(topgrossingDuration);

        ImageView musicplayerAlbumCover = (ImageView) findViewById(R.id.image_view2);
        musicplayerAlbumCover.setImageResource(topgrossingAlbumCoverId);
    }

}