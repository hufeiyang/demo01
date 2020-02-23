package com.hfy.demo01.module.home.fragment;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hfy.demo01.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class SecondFragment extends Fragment {

    @BindView(R.id.button)
    Button mButton;
    private Unbinder mUnbind;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_second, null);

        mUnbind = ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.button)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
//                MvvmActivity.launch(getActivity());
//                RecyclerActivity.launch(getActivity());
                break;
            default:
                break;
        }
    }

}
