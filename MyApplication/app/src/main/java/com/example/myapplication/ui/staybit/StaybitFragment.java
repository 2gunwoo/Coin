package com.example.myapplication.ui.staybit;

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

import com.example.myapplication.databinding.FragmentStaybitBinding;

public class StaybitFragment extends Fragment {

    private StaybitViewModel staybitViewModel;
    private FragmentStaybitBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        staybitViewModel =
                new ViewModelProvider(this).get(StaybitViewModel.class);

        binding = FragmentStaybitBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textStaybit;
        StaybitViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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