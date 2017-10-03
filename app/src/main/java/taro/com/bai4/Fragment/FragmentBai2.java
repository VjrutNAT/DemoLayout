package taro.com.bai4.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import taro.com.bai4.R;

/**
 * Created by VjrutNAT on 10/2/2017.
 */

public class FragmentBai2 extends Fragment implements View.OnClickListener {

    View mBackground;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        Button btnColor1 = view.findViewById(R.id.btn_color1);
        Button btnColor2 = view.findViewById(R.id.btn_color2);
        Button btnColor3 = view.findViewById(R.id.btn_color3);
        Button btnClear = view.findViewById(R.id.btn_clear);

        mBackground = view.findViewById(R.id.bg);

        btnColor1.setOnClickListener(this);
        btnColor2.setOnClickListener(this);
        btnColor3.setOnClickListener(this);
        btnClear.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_color1:
                mBackground.setBackgroundResource(R.color.colorRed);
                break;
            case R.id.btn_color2:
                mBackground.setBackgroundResource(R.color.colorYellow);
                break;
            case R.id.btn_color3:
                mBackground.setBackgroundResource(R.color.colorBlue);
                break;
            case R.id.btn_clear:
                mBackground.setBackgroundResource(R.color.colorWhite);
                break;
        }
    }
}
