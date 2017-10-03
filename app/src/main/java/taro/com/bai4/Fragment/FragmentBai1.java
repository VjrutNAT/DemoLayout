package taro.com.bai4.Fragment;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import taro.com.bai4.R;

/**
 * Created by VjrutNAT on 10/2/2017.
 */

public class FragmentBai1 extends Fragment implements View.OnClickListener {

    private View mBackground;
    private Button btnSetColor;
    private Button btnCancel;
    private RadioGroup radioGroup;
    private RadioButton mRbRed;
    private RadioButton mRbGreen;
    private RadioButton mRbBlue;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        radioGroup = view.findViewById(R.id.rg);
        mRbRed = view.findViewById(R.id.rbRed);
        mRbGreen = view.findViewById(R.id.rbGreen);
        mRbBlue = view.findViewById(R.id.rbBlue);

        btnSetColor = view.findViewById(R.id.btn_set_color);
        btnCancel = view.findViewById(R.id.btn_cancel);
        mBackground = view.findViewById(R.id.bg);

        btnCancel.setOnClickListener(this);
        btnSetColor.setOnClickListener(this);

        return view;
    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.rbRed:
                if (checked)
                    mBackground.setBackgroundResource(R.color.colorRed);
                    break;
            case R.id.rbGreen:
                if (checked)
                    mBackground.setBackgroundResource(R.color.colorGreen);
                    break;
            case R.id.rbBlue:
                if (checked)
                    mBackground.setBackgroundResource(R.color.colorBlue);
                    break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_set_color:
                if(mRbRed.isChecked()){
                    onRadioButtonClicked(mRbRed);
                }else if (mRbGreen.isChecked()){
                    onRadioButtonClicked(mRbGreen);
                }else if (mRbBlue.isChecked()){
                    onRadioButtonClicked(mRbBlue);
                }
                break;
            case R.id.btn_cancel:
                mBackground.setBackgroundResource(R.color.colorBlack);
                break;
        }
    }
}
