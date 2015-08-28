package marcos.com.talkdemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MoviesList extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movies_list);

        final ImageView ivManOfSteel = (ImageView) findViewById(R.id.iv_man_of_steel);
        ivManOfSteel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoviesList.this, MovieDetailActivity.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MoviesList.this, ivManOfSteel, "main_poster");
                startActivity(intent, options.toBundle());
            }
        });


    }

}
