package quizapp.com.secondproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MostlyPlayedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstances) {

        super.onCreate(savedInstances);
        setContentView(R.layout.mostly_played_list);
        ArrayList<MostlyPlayed> mostlyPlayeds = new ArrayList<MostlyPlayed>();

        // mostly played data//

        mostlyPlayeds.add(new MostlyPlayed("Confidential", "Diljit Dosanjh", "3:20", R.drawable.maxresdefault));
        mostlyPlayeds.add(new MostlyPlayed("Speak Your Mind", "Marshmello", "3:50", R.drawable.marshmello));
        mostlyPlayeds.add(new MostlyPlayed("Zanaka", "Jain", "3:12", R.drawable.makeba));
        mostlyPlayeds.add(new MostlyPlayed("Red Pill Blues", "Maroon5", "3:31", R.drawable.maroon));

        MostlyPlayedAdapter adapter = new MostlyPlayedAdapter(this, mostlyPlayeds);

        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);


    }

}