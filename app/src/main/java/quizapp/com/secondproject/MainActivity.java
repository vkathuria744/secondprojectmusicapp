package quizapp.com.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for Top grossing activity//

         TextView TopGrossing = (TextView)findViewById(R.id.top_grossing);
        TopGrossing.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               Intent TopGrossingIntent = new Intent(MainActivity.this,TopGrossingActivity.class);
                                                startActivity(TopGrossingIntent);
                                           }
                                       });
        // for mostly played activity //
        TextView MostlyPlayed = (TextView) findViewById(R.id.mostly_played);
        MostlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MostlyPlayedIntent = new Intent(MainActivity.this,MostlyPlayedActivity.class);
                startActivity(MostlyPlayedIntent);
            }
        });

        // for new releases activity //
        TextView NewReleases = (TextView) findViewById(R.id.new_releases);
        NewReleases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NewReleasesIntent = new Intent(MainActivity.this,NewReleasesActivity.class);
                startActivity(NewReleasesIntent);
            }
        });

        TextView Payment =  findViewById(R.id.pay_ment);
        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PaymentIntent = new Intent(MainActivity.this,PaymentActivity.class);
                startActivity(PaymentIntent);
            }
        });

    }
    }


