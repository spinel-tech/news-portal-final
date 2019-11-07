package com.example.newsapp.ui.agriculture;

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

public class AgricultureFragment extends Fragment {

    private AgricultureViewModel agricultureViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        agricultureViewModel =
                ViewModelProviders.of(this).get(AgricultureViewModel.class);
        View root = inflater.inflate(R.layout.fragment_agriculture, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        agricultureViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}