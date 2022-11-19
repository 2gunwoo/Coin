package com.example.myapplication.ui.wed3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentWed3Binding;

public class Wed3Fragment extends Fragment {

    private com.example.myapplication.ui.wed3.Wed3ViewModel wed3ViewModel;
    private FragmentWed3Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wed3ViewModel =
                new ViewModelProvider(this).get(com.example.myapplication.ui.wed3.Wed3ViewModel.class);

        binding = FragmentWed3Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textWed3;
        wed3ViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}