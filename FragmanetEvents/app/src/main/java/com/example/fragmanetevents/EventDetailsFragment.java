 package com.example.fragmanetevents;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


 public class EventDetailsFragment extends Fragment {
     private EditText metTitle;
     private EditText metDescrition;
     private Button mbtnNext;
     private EventListener eventListener;

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
         return inflater.inflate(R.layout.fragment_event_details, container, false);
     }

     @Override
     public void onViewCreated(@NonNull  View view, Bundle savedInstanceState) {
         super.onViewCreated(view, savedInstanceState);
         initViews(view);
     }

     @Override
     public void onAttach(@NonNull  Context context) {
         super.onAttach(context);
         eventListener = (EventListener) context;
     }

     private void initViews(View view) {
         metTitle = view.findViewById(R.id.etTitle);
         metDescrition = view.findViewById(R.id.etDescription);
         mbtnNext = view.findViewById(R.id.btnNext);
         mbtnNext.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String title = metTitle.getText().toString();
                 String description = metDescrition.getText().toString();
                 Bundle bundle = new Bundle();
                 bundle.putString("title",title);
                 bundle.putString("description",description);
                 if(eventListener!=null){
                     eventListener.launchTimeAndDateFragment(bundle);
                 }
             }
         });
     }


 }