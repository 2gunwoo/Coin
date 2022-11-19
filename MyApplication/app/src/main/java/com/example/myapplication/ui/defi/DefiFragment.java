package com.example.myapplication.ui.defi;

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

import com.example.myapplication.databinding.FragmentDefiBinding;

public class DefiFragment extends Fragment {

    private com.example.myapplication.ui.defi.DefiViewModel defiViewModel;
    private FragmentDefiBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        defiViewModel =
                new ViewModelProvider(this).get(com.example.myapplication.ui.defi.DefiViewModel.class);

        binding = FragmentDefiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDefi;
        defiViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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