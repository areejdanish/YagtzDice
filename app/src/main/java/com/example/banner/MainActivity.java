package com.example.banner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the initialization configuration
        AppLovinSdkInitializationConfiguration initConfig = AppLovinSdkInitializationConfiguration.builder( getResources().getString(R.string.sdk_key) )
                .setMediationProvider( AppLovinMediationProvider.MAX )
                .build();
        AppLovinSdk.getInstance( this ).initialize( initConfig, new AppLovinSdk.SdkInitializationListener()
        {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration sdkConfig)
            {
                LoadBannerAd();
                Toast.makeText(MainActivity.this, "SDK Suceess", Toast.LENGTH_SHORT).show();
            }
        } );
    }

    private void LoadBannerAd() {
        // Stretch to the width of the screen for banners to be fully functional
        int width = ViewGroup.LayoutParams.MATCH_PARENT;

        // Get the anchored adaptive banner height
        int heightDp = MaxAdFormat.BANNER.getAdaptiveSize( this ).getHeight();
        int heightPx = AppLovinSdkUtils.dpToPx( this, heightDp );

        MaxAdViewConfiguration config = MaxAdViewConfiguration.builder()
                .setAdaptiveType( MaxAdViewConfiguration.AdaptiveType.ANCHORED )
                .build();

        MaxAdView adView = new MaxAdView(getResources().getString(R.string.banner1),config);
        adView.setListener(new MaxAdViewAdListener() {
            @Override
            public void onAdExpanded(MaxAd ad) {

            }

            @Override
            public void onAdCollapsed(MaxAd ad) {

            }

            @Override
            public void onAdLoaded(MaxAd ad) {
                Toast.makeText(MainActivity.this, "Banner Loaded", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onAdDisplayed(MaxAd ad) {
            }
            @Override
            public void onAdHidden(MaxAd ad) {
                LoadBannerAd();
            }
            @Override
            public void onAdClicked(MaxAd ad) {
            }

            @Override
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                LoadBannerAd();
               /* Toast.makeText(MainActivity.this, "Banner Error\n"+error.getMessage(),
                        Toast.LENGTH_SHORT).show();*/
                Log.e("Banner Error",error.getMessage()+"");
            }

            @Override
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                LoadBannerAd();
            }
        });
        adView.setLayoutParams(new FrameLayout.LayoutParams(width, heightPx));
        adView.setBackgroundColor(Color.WHITE);
        LinearLayout layout = findViewById(R.id.banner1);
        layout.addView(adView);
        adView.loadAd();
    }
}