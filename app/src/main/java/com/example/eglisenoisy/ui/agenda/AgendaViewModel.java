package com.example.eglisenoisy.ui.agenda;

import androidx.lifecycle.ViewModel;

import com.example.eglisenoisy.model.AgendaEvent;

import java.util.ArrayList;
import java.util.List;

public class AgendaViewModel extends ViewModel {

    private final List<AgendaEvent> events;

    public AgendaViewModel(){
        super();
        events = new ArrayList<>();
    }

    public List<AgendaEvent> getEvents() {
        return events;
    }
}
