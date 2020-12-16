package com.example.asynctaskexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.asynctaskexample.MultiThread.ExampleAsyncTask;
import com.example.asynctaskexample.MultiThread.ExampleRunnable;
import com.example.asynctaskexample.MultiThread.ExampleThread;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });



        Button second_complex_job_button = view.findViewById(R.id.second_complex_job_button);

        second_complex_job_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do complex job using new Thread
//                ExampleThread thread = new ExampleThread(10);
//                thread.start();

                //Do complex job using new Runnable

//                ExampleRunnable runnable = new ExampleRunnable(15);
//                new Thread(runnable).start();

                //Do complex job using AsyncTask

                ExampleAsyncTask asyncTask = new ExampleAsyncTask(20);
                asyncTask.execute();
            }
        });
    }
}