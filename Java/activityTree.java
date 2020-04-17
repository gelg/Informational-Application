package academy.learnprogramming.informationalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class activityTree extends YouTubeBaseActivity
{
    private YouTubePlayerView treeYouTubePlayerView;
    private Button playVideoTreeBtn;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);


        playVideoTreeBtn = (Button) findViewById(R.id.btnPlayVideoTree);
        treeYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player_view_tree);

        onInitializedListener = new YouTubePlayer.OnInitializedListener()
        {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
            {

                youTubePlayer.loadVideo("478TeAxm12g");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
            {

            }
        };

        playVideoTreeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                treeYouTubePlayerView.initialize(PlayerConfig.getApiKey(), onInitializedListener);
            }
        });
    }
}
