package com.example.less3_dz_3_part;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private ArrayList<String> gun;
    private RecyclerView gunnnn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_firs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gunnnn = view.findViewById(R.id.recycler_view);
        loadData();
        gunAdapter gunAdapter = new gunAdapter(gun);
        gunnnn.setAdapter(gunAdapter);
    }

    private void loadData() {
        gun = new ArrayList<>();
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
        gun.add("GUN");
    }

}