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
import com.example.eglisenoisy.databinding.FragmentHomeBinding;
import com.example.eglisenoisy.ui.home.HomeViewModel;

public class AgendaFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AgendaViewModel agendaViewModel =
                new ViewModelProvider(this).get(AgendaViewModel.class);

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}
