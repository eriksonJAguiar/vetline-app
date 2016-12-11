package com.app.vetline.vetline;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import model.Cliente;
import model.Consulta;
import model.Usuario;

import static com.app.vetline.vetline.R.id.map;

public class Tela_mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);
        final View viewEndereco = (View) findViewById(R.id.layoutEndereco);
        final View viewMapa = (View) findViewById(R.id.layoutMapa);

        final Consulta consul = new Consulta();// carreca a Consulta da tela passada
        final Cliente cli = new Cliente(); // carrega o cliente que esta fazendo a consulta

        final LinearLayout.LayoutParams paramsEndereco = (LinearLayout.LayoutParams) viewEndereco.getLayoutParams();
        final LinearLayout.LayoutParams paramsMapa = (LinearLayout.LayoutParams) viewMapa.getLayoutParams();
        Button btn_marcar = (Button) findViewById(R.id.btn_marcar);
        paramsEndereco.height=0;
        final Switch mudarOP = (Switch) findViewById(R.id.campo_mapa);
        mudarOP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!mudarOP.isChecked()) {
                    viewEndereco.setVisibility(View.INVISIBLE);
                    viewMapa.setVisibility(View.VISIBLE);
                    paramsEndereco.height = 0;
                    paramsMapa.height = paramsEndereco.WRAP_CONTENT;


                    final View animatedView = (View) findViewById(R.id.mensagens);
                    final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
                    ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                            animatedView.requestLayout();
                        }
                    });
                    animator.setDuration(300);
                    animator.start();
                }else{
                    viewMapa.setVisibility(View.INVISIBLE);
                    viewEndereco.setVisibility(View.VISIBLE);
                    paramsEndereco.height = paramsMapa.WRAP_CONTENT;
                    paramsMapa.height = 0;
                    final View animatedView = (View) findViewById(R.id.mensagens);
                    final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
                    ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                            animatedView.requestLayout();
                        }
                    });
                    animator.setDuration(300);
                    animator.start();

                }
            }
        });

        Button marcarConsulta = (Button) findViewById(R.id.btn_marcar);
        marcarConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText local = (EditText) findViewById(R.id.campoEnderecoMarcar);

                if (mudarOP.isChecked()){
                    String localStr = local.getText().toString();
                    consul.setLocal(localStr);
                    //atualizar a consulta no banco
                }
                else {
                    consul.setLocal(cli.getEndereco() + "," + cli.getNum() + "," + cli.getBairro()+ "," + cli.getCidade() + "-" + cli.getUf() );
                    //atualizar a consulta no banco
                }

            }
        });

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        GPSTracker gps = new GPSTracker(Tela_mapa.this);
        double latitude = gps.getLatitude();
        double longitude = gps.getLongitude();
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(latitude, longitude);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Seu endereço!"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

}
