package quizapp.com.secondproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TopGrossingActivity extends AppCompatActivity {

    private ArrayList<TopGrossing> topGrossings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.topgrossinglist);

        topGrossings = new ArrayList<TopGrossing>();

        topGrossings.add(new TopGrossing("High End","Diljit Dosanjh", "Confidential",
                R.drawable.maxresdefault, "3:20"));

        topGrossings.add(new TopGrossing("Friends","Marshmello", "Speak Your Mind",
                R.drawable.marshmello, "3:50"));

        topGrossings.add(new TopGrossing("Makeba","Jain", "Zanaka",
                R.drawable.makeba, "3:12"));

        topGrossings.add(new TopGrossing("Girls Like You","Maroon5", "Red Pill Blues",
                R.drawable.maroon, "3:31"));

        TopGrossingAdapter adapter = new TopGrossingAdapter(this, topGrossings);
        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent musicplayerIntent = new Intent(TopGrossingActivity.this, MusicPlayer.class);
                TopGrossing topGrossing = topGrossings.get(i);

                // for bundle//

                Bundle bundle = new Bundle();
                bundle.putString("songname", topGrossing.getSongName());
                bundle.putString("artist", topGrossing.getArtist());
                bundle.putString("album", topGrossing.getAlbum());
                bundle.putInt("album_cover", topGrossing.getImageResourceId());
                bundle.putString("song_duration", topGrossing.getDuration());

                musicplayerIntent.putExtras(bundle);

                // for music player activity//
                startActivity(musicplayerIntent);

            }
        });

    }

}
