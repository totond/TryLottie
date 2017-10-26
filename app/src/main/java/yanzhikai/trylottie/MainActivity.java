package yanzhikai.trylottie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private LottieAnimationView mLottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLottieAnimationView = (LottieAnimationView) findViewById(R.id.animation_view);
        mLottieAnimationView.setAnimation("ellipse.json");
        mLottieAnimationView.loop(true);
        mLottieAnimationView.playAnimation();
    }
}
