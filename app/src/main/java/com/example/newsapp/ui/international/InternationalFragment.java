package com.example.newsapp.ui.international;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.newsapp.R;

public class InternationalFragment extends Fragment {

    private InternationalViewModel internationalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        internationalViewModel =
                ViewModelProviders.of(this).get(InternationalViewModel.class);
        View root = inflater.inflate(R.layout.fragment_international, container, false);
        final TextView textView = root.findViewById(R.id.text_share);
        internationalViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}