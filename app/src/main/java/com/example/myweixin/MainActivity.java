package com.example.myweixin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.myweixin.adapters.MyFragmentPagerAdapter;
import com.example.myweixin.fragment.WeiXinFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout bottom_weixin,bottom_tongxunlu,bottom_faxian,bottom_mine;
    private ImageView xiaoxi_img,tongxunlu_img,faxian_img,mine_img,homepage;
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_weixin);
        initpager();
        init();
    }
    //初始化组件
    private void init(){
        viewPager=findViewById(R.id.id_weixin);

        bottom_weixin=findViewById(R.id.bottom_weixin);
        bottom_tongxunlu=findViewById(R.id.bottom_tongxunlu);
        bottom_faxian=findViewById(R.id.bottom_faxian);
        bottom_mine=findViewById(R.id.bottom_mine);

        bottom_weixin.setOnClickListener(this);
        bottom_tongxunlu.setOnClickListener(this);
        bottom_faxian.setOnClickListener(this);
        bottom_mine.setOnClickListener(this);

        xiaoxi_img=findViewById(R.id.xiaoxi_img);
        tongxunlu_img=findViewById(R.id.tongxunlu_img);
        faxian_img=findViewById(R.id.faxian_img);
        mine_img=findViewById(R.id.mine_img);

        xiaoxi_img.setSelected(true);
        homepage = xiaoxi_img;

    }
    //点击
    @Override
    public void onClick(View view) {
        change(view.getId());
    }

    private void change(int id){
        homepage.setSelected(false);
        switch (id){
            case R.id.bottom_weixin:
                viewPager.setCurrentItem(0);
            case 0:
                xiaoxi_img.setSelected(true);
                homepage = xiaoxi_img;
                break;
            case R.id.bottom_tongxunlu:
                viewPager.setCurrentItem(1);
            case 1:
                tongxunlu_img.setSelected(true);
                homepage = tongxunlu_img;
                break;
            case R.id.bottom_faxian:
                viewPager.setCurrentItem(2);
            case 2:
                faxian_img.setSelected(true);
                homepage = faxian_img;
                break;
            case R.id.bottom_mine:
                viewPager.setCurrentItem(3);
            case 3:
                mine_img.setSelected(true);
                homepage = mine_img;
                break;
        }
    }

    private void initpager(){
        viewPager=findViewById(R.id.id_weixin);
        List<Fragment> fragments=new ArrayList<Fragment>();
        fragments.add(new WeiXinFragment());

        //适配器将数组传入完成初始化
        MyFragmentPagerAdapter pagerAdapter =
                new MyFragmentPagerAdapter(getSupportFragmentManager(), getLifecycle(), fragments);

        //设置viewpager的已经初始好的适配器
        viewPager.setAdapter(pagerAdapter);

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                change(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
}

