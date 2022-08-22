package com.example.eglisenoisy.ui.agenda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.eglisenoisy.R;
import com.example.eglisenoisy.databinding.FragmentAgendaBinding;
import com.example.eglisenoisy.databinding.FragmentHomeBinding;
import com.example.eglisenoisy.ui.home.HomeViewModel;

public class AgendaFragment extends Fragment {
    private FragmentAgendaBinding binding;
    private AgendaViewModel agendaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        AgendaViewModel agendaViewModel =
                new ViewModelProvider(this).get(AgendaViewModel.class);

        binding = FragmentAgendaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}
