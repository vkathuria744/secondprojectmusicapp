package quizapp.com.secondproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NewReleasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInsatanceState) {

        super.onCreate(savedInsatanceState);
        setContentView(R.layout.new_releases_list);

        ArrayList<NewReleases> newreleases = new ArrayList<NewReleases>();

        // new releases components //
        newreleases.add(new NewReleases("Diljit Dosanjh", R.drawable.index));
        newreleases.add(new NewReleases("Marshmello", R.drawable.marshmello));
        newreleases.add(new NewReleases("Jain", R.drawable.makeba));
        newreleases.add(new NewReleases("Maroon5", R.drawable.maroon));

        NewReleasesAdapter adapter = new NewReleasesAdapter(this, newreleases);

        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);
    }

}
