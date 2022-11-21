package com.example.myapplication.ui.bitcoin;

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

import com.example.myapplication.databinding.FragmentBitcoinBinding;

public class BitcoinFragment extends Fragment {


    private BitcoinViewModel bitcoinViewModel;
    private FragmentBitcoinBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bitcoinViewModel =
                new ViewModelProvider(this).get(BitcoinViewModel.class);

        binding = FragmentBitcoinBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBitcoin;
        bitcoinViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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