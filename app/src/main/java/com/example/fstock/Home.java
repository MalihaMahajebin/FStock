package com.example.fstock;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fstock.R;

public class Home extends Fragment {
    @Nullable


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         View root= inflater.inflate(R.layout.fragment_home,container,false);
        RecyclerView r=root.findViewById(R.id.rv);
        r.setLayoutManager(new LinearLayoutManager(getActivity()));

        a=new A
        r.setAdapter(a);
        return root;
    }

}
