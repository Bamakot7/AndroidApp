package com.example.eglisenoisy.model.customgrid;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.example.eglisenoisy.R;
import com.example.eglisenoisy.model.AgendaEvent;

import java.util.List;
import java.util.Objects;

public class EventsGridAdapter extends BaseAdapter {
    private final List<AgendaEvent> listData;
    private final Context context;

    public EventsGridAdapter(List<AgendaEvent> listData, Context context) {
        this.listData = Objects.requireNonNull(listData);
        this.context = Objects.requireNonNull(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int i) {
        return listData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @NonNull
    @Override
    public View getView(int i, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.griditem_event_layout, null);
        }
        TextView day = v.findViewById(R.id.dateDay);
        TextView monthYear = v.findViewById(R.id.monthYear);
        TextView eventTitle = v.findViewById(R.id.eventName);

        AgendaEvent agendaEvent = listData.get(i);
        day.setText(String.valueOf(agendaEvent.getDay()));
        monthYear.setText(agendaEvent.getMonth() + " " + agendaEvent.getYear());
        eventTitle.setText(agendaEvent.getName());

        return v;
    }
}
