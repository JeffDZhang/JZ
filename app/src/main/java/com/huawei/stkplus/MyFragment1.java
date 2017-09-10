package com.huawei.stkplus;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by zwx493525 on 2017/9/8 0028.
 */
public class MyFragment1 extends Fragment {

    public MyFragment1() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_content, container, false);
//        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
//        txt_content.setText("步骤一：点击进入【设置】【关于手机】" +
//                "步骤二：连续点击【版本号】若干次，进入到开发者模式" +
//                "步骤三：返回【设置】界面，进入【开发人员选项】" +
//                "步骤四：打开并允许【USB调试】" +
//                "步骤五：重新连接设备和电脑，在设备的授权连接弹框上点击“确定”，完成连接" +
//                "");

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

        return view;
    }
}
