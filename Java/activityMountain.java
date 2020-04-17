package academy.learnprogramming.informationalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class activityMountain extends YouTubeBaseActivity
{
    private YouTubePlayerView mountainYouTubePlayerView;
    private Button playVideoMountainBtn;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain);

        playVideoMountainBtn = (Button) findViewById(R.id.btnPlayVideoMountain);
        mountainYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player_view_mountain);

        onInitializedListener = new YouTubePlayer.OnInitializedListener()
        {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
            {

                youTubePlayer.loadVideo("2R2gb0MKJlo");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
            {

            }
        };

        playVideoMountainBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mountainYouTubePlayerView.initialize(PlayerConfig.getApiKey(), onInitializedListener);
            }
        });
    }
}
