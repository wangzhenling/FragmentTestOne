package com.example.fragmenttestone.fragment;

import com.example.fragmenttestone.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentMusic extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View view=inflater.inflate(R.layout.fragment_music, container, false);
		return view;
	}

}
