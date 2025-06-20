package com.example.banner;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

public class DesignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_design);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Create the initialization configuration
        AppLovinSdkInitializationConfiguration initConfig = AppLovinSdkInitializationConfiguration.builder( getResources().getString(R.string.sdk_key) )
                .setMediationProvider( AppLovinMediationProvider.MAX )
                .build();
        AppLovinSdk.getInstance( this ).initialize( initConfig, new AppLovinSdk.SdkInitializationListener()
        {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration sdkConfig)
            {
                LoadBannerAd1();
                LoadBannerAd2();
                LoadBannerAd3();
                LoadBannerAd4();
            }
        } );
    }
    private void LoadBannerAd1() {
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

            }

            @Override
            public void onAdDisplayed(MaxAd ad) {
            }
            @Override
            public void onAdHidden(MaxAd ad) {
                LoadBannerAd1();
            }
            @Override
            public void onAdClicked(MaxAd ad) {
            }

            @Override
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                LoadBannerAd1();
            }

            @Override
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                LoadBannerAd1();
            }
        });
        adView.setLayoutParams(new FrameLayout.LayoutParams(width, heightPx));
        adView.setBackgroundColor(Color.WHITE);
        LinearLayout layout = findViewById(R.id.banner1);
        layout.addView(adView);
        adView.loadAd();
    }
    private void LoadBannerAd2() {
        // Stretch to the width of the screen for banners to be fully functional
        int width = ViewGroup.LayoutParams.MATCH_PARENT;

        // Get the anchored adaptive banner height
        int heightDp = MaxAdFormat.BANNER.getAdaptiveSize( this ).getHeight();
        int heightPx = AppLovinSdkUtils.dpToPx( this, heightDp );

        MaxAdViewConfiguration config = MaxAdViewConfiguration.builder()
                .setAdaptiveType( MaxAdViewConfiguration.AdaptiveType.ANCHORED )
                .build();

        MaxAdView adView = new MaxAdView(getResources().getString(R.string.banner2),config);
        adView.setListener(new MaxAdViewAdListener() {
            @Override
            public void onAdExpanded(MaxAd ad) {

            }

            @Override
            public void onAdCollapsed(MaxAd ad) {

            }

            @Override
            public void onAdLoaded(MaxAd ad) {

            }

            @Override
            public void onAdDisplayed(MaxAd ad) {
            }
            @Override
            public void onAdHidden(MaxAd ad) {
                LoadBannerAd2();
            }
            @Override
            public void onAdClicked(MaxAd ad) {
            }

            @Override
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                LoadBannerAd2();
            }

            @Override
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                LoadBannerAd2();
            }
        });
        adView.setLayoutParams(new FrameLayout.LayoutParams(width, heightPx));
        adView.setBackgroundColor(Color.WHITE);
        LinearLayout layout = findViewById(R.id.layout);
        layout.addView(adView);
        adView.loadAd();
    }
    private void LoadBannerAd3() {
        // Stretch to the width of the screen for banners to be fully functional
        int width = ViewGroup.LayoutParams.MATCH_PARENT;

        // Get the anchored adaptive banner height
        int heightDp = MaxAdFormat.BANNER.getAdaptiveSize( this ).getHeight();
        int heightPx = AppLovinSdkUtils.dpToPx( this, heightDp );

        MaxAdViewConfiguration config = MaxAdViewConfiguration.builder()
                .setAdaptiveType( MaxAdViewConfiguration.AdaptiveType.ANCHORED )
                .build();

        MaxAdView adView = new MaxAdView(getResources().getString(R.string.banner3),config);
        adView.setListener(new MaxAdViewAdListener() {
            @Override
            public void onAdExpanded(MaxAd ad) {

            }

            @Override
            public void onAdCollapsed(MaxAd ad) {

            }

            @Override
            public void onAdLoaded(MaxAd ad) {

            }

            @Override
            public void onAdDisplayed(MaxAd ad) {
            }
            @Override
            public void onAdHidden(MaxAd ad) {
                LoadBannerAd3();
            }
            @Override
            public void onAdClicked(MaxAd ad) {
            }

            @Override
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                LoadBannerAd3();
            }

            @Override
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                LoadBannerAd3();
            }
        });
        adView.setLayoutParams(new FrameLayout.LayoutParams(width, heightPx));
        adView.setBackgroundColor(Color.WHITE);
        LinearLayout layout = findViewById(R.id.layout);
        layout.addView(adView);
        adView.loadAd();
    }
    private void LoadBannerAd4() {
        // Stretch to the width of the screen for banners to be fully functional
        int width = ViewGroup.LayoutParams.MATCH_PARENT;

        // Get the anchored adaptive banner height
        int heightDp = MaxAdFormat.BANNER.getAdaptiveSize( this ).getHeight();
        int heightPx = AppLovinSdkUtils.dpToPx( this, heightDp );

        MaxAdViewConfiguration config = MaxAdViewConfiguration.builder()
                .setAdaptiveType( MaxAdViewConfiguration.AdaptiveType.ANCHORED )
                .build();

        MaxAdView adView = new MaxAdView(getResources().getString(R.string.banner4),config);
        adView.setListener(new MaxAdViewAdListener() {
            @Override
            public void onAdExpanded(MaxAd ad) {

            }

            @Override
            public void onAdCollapsed(MaxAd ad) {

            }

            @Override
            public void onAdLoaded(MaxAd ad) {

            }

            @Override
            public void onAdDisplayed(MaxAd ad) {
            }
            @Override
            public void onAdHidden(MaxAd ad) {
                LoadBannerAd4();
            }
            @Override
            public void onAdClicked(MaxAd ad) {
            }

            @Override
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                LoadBannerAd4();
            }

            @Override
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                LoadBannerAd4();
            }
        });
        adView.setLayoutParams(new FrameLayout.LayoutParams(width, heightPx));
        adView.setBackgroundColor(Color.WHITE);
        LinearLayout layout = findViewById(R.id.layout);
        layout.addView(adView);
        adView.loadAd();
    }
}
