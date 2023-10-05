package com.marcelo.cafemarcelo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoColeccion extends Fragment {

    View view;
    Button botonEventoSuscribir1, botonEventoSuscribir2, botonEventoSuscribir3 ;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragmento_coleccion, container, false);




        botonEventoSuscribir1 = (Button) view.findViewById(R.id.btnCol1);
        botonEventoSuscribir2 = (Button) view.findViewById(R.id.btnCol2);
        botonEventoSuscribir3= (Button) view.findViewById(R.id.btnCol3);
        botonEventoSuscribir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Suscribiendo Gran Esperesso...", Toast.LENGTH_SHORT).show();
            }
        });
        botonEventoSuscribir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Suscribiendo Planalto...", Toast.LENGTH_SHORT).show();
            }
        });
        botonEventoSuscribir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Suscribiendo Danche...", Toast.LENGTH_SHORT).show();
            }
        });



        return view;


    }
}