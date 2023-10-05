package com.marcelo.cafemarcelo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoHome extends Fragment {



    View view;
    Button botonEventoHome;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragmento_home, container, false);




        botonEventoHome = (Button) view.findViewById(R.id.btnHome);
        botonEventoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Suscribiendooo...", Toast.LENGTH_LONG).show();
            }
        });




        return view;


    }
}
