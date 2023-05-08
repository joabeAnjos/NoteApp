package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.noteapp.databinding.ActivityTelaCadastroBinding;

public class TelaCadastro extends AppCompatActivity {

    private ActivityTelaCadastroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTelaCadastroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}