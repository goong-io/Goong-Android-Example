package com.goong.goong_android_sample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import io.goong.goongsdk.annotations.MarkerOptions;
import io.goong.goongsdk.camera.CameraPosition;
import io.goong.goongsdk.camera.CameraUpdateFactory;
import io.goong.goongsdk.geometry.LatLng;
import io.goong.goongsdk.maps.GoongMap;
import io.goong.goongsdk.maps.OnMapReadyCallback;
import io.goong.goongsdk.maps.SupportMapFragment;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoongMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull final GoongMap goongMap) {
        mMap = goongMap;

        LatLng swordLakeLocation = new LatLng(21.0287747, 105.850176);
        mMap.addMarker(new MarkerOptions().position(swordLakeLocation).title("Hồ Gươm"));

        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(
                new CameraPosition.Builder()
                        .zoom(13.0)
                        .target(swordLakeLocation)
                        .build()
        ));
    }
}
