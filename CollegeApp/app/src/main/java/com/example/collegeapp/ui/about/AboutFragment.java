package com.example.collegeapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.collegeapp.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {


    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();

        list.add(new BranchModel(R.drawable.ic_baseline_computer_24,"Computer Science","Computer science is the study of computation, automation, and information. Computer science spans theoretical disciplines such as algorithms, theory of computation, information theory, and automation."));
        list.add(new BranchModel(R.drawable.ic_mech,"Mechanical Engineering","Mechanical engineering is an engineering branch that combines engineering physics and mathematics principles with materials science, to design, analyze, manufacture, and maintain mechanical systems."));

        adapter = new BranchAdapter(getContext(),list);

        viewPager = view.findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);

        Glide.with(getContext()).load("https://firebasestorage.googleapis.com/v0/b/mit-aoe-app.appspot.com/o/mit.png?alt=media&token=60bd6f81-a396-40fb-935a-f5a30c298bdf").into(imageView);

        return view;
    }
}