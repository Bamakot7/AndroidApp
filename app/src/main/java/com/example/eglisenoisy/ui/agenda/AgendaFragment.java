package com.example.eglisenoisy.ui.agenda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.eglisenoisy.R;
import com.example.eglisenoisy.databinding.FragmentAgendaBinding;
import com.example.eglisenoisy.databinding.FragmentHomeBinding;
import com.example.eglisenoisy.model.AgendaEvent;
import com.example.eglisenoisy.model.customgrid.EventsGridAdapter;
import com.example.eglisenoisy.ui.home.HomeViewModel;

public class AgendaFragment extends Fragment {
    private FragmentAgendaBinding binding;
    private AgendaViewModel agendaViewModel;
    private GridView gridView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

         agendaViewModel =
                new ViewModelProvider(this).get(AgendaViewModel.class);

        binding = FragmentAgendaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }


    @Override
    public void onStart() {
        super.onStart();

        //Mise en place de la gridview
        this.gridView = binding.eventsGrid;
        agendaViewModel.getEvents().add(new AgendaEvent(1000, "Test", "Evenement 1"));

        EventsGridAdapter adapter
                = new EventsGridAdapter(agendaViewModel.getEvents(), binding.getRoot().getContext());
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                AgendaEvent event = (AgendaEvent) o;
                Toast.makeText(binding.getRoot().getContext(), "Selected :" + " " + event.getName(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}
