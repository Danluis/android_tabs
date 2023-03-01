package com.example.tabs;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Inicio extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.xml1, container, false);
        VideoView mivideo = view.findViewById(R.id.video1);

        mivideo.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.bienvenida);

        mivideo.setOnErrorListener(new MediaPlayer.OnErrorListener() {

            public boolean onError(MediaPlayer mp, int what, int extra) {
                // Maneja el error
                return false;
            }
        });

        mivideo.start();
        return view;


    }



}


