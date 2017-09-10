package com.huawei.stkplus;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by zwx493525 on 2017/9/8 0028.
 */
public class MyFragment2 extends Fragment {

    public MyFragment2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_content,container,false);
//        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
//        txt_content.setText("第二个Fragment");
        TextView tip = (TextView) view.findViewById(R.id.tip);
        TextView tip1 = (TextView) view.findViewById(R.id.tip1);
        TextView tip2 = (TextView) view.findViewById(R.id.tip2);
        TextView tip3 = (TextView) view.findViewById(R.id.tip3);
        TextView tip4 = (TextView) view.findViewById(R.id.tip4);
        TextView tip5 = (TextView) view.findViewById(R.id.tip5);

        ImageView pic_set1 = (ImageView) view.findViewById(R.id.pic_set1);
        ImageView pic_set2 = (ImageView) view.findViewById(R.id.pic_set2);
        ImageView pic2 = (ImageView) view.findViewById(R.id.pic2);
        ImageView pic3 = (ImageView) view.findViewById(R.id.pic3);
        ImageView pic4 = (ImageView) view.findViewById(R.id.pic4);
        ImageView pic5 = (ImageView) view.findViewById(R.id.pic5);

        Log.e("页面", "2页面");
        return view;
    }
}
