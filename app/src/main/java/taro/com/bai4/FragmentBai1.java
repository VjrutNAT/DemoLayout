package taro.com.bai4;

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

/**
 * Created by VjrutNAT on 10/2/2017.
 */

public class FragmentBai1 extends Fragment implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    private View mBackground;
    private Button btnSetColor;
    private Button btnCancel;
    private RadioGroup radioGroup;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        radioGroup = view.findViewById(R.id.rg);

        btnSetColor = view.findViewById(R.id.btn_set_color);
        btnCancel = view.findViewById(R.id.btn_cancel);
        mBackground = view.findViewById(R.id.bg);

        btnCancel.setOnClickListener(this);
        btnSetColor.setOnClickListener(this);

        return view;
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
        switch (i){
            case R.id.rbRed:
                    mBackground.setBackgroundResource(R.color.colorRed);
                break;
            case R.id.rbGreen:
                    mBackground.setBackgroundResource(R.color.colorGreen);
                break;
            case R.id.rbBlue:
                    mBackground.setBackgroundResource(R.color.colorBlue);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_cancel:
                mBackground.setBackgroundResource(R.color.colorBlack);
                break;
            case R.id.btn_set_color:
                radioGroup.setOnCheckedChangeListener(this);
                break;
        }
    }
}
