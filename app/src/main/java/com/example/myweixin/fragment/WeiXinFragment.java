package com.example.myweixin.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentViewHolder;

import com.example.myweixin.R;
import com.example.myweixin.entity.Weixin;

import java.util.ArrayList;
import java.util.List;

public class WeiXinFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Weixin> list=new ArrayList<Weixin>();


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_weixin, container, false);
        recyclerView = view.findViewById(R.id.weixin_recyclerView);
        LinearLayoutManager manager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);
        init();


        return view;
    }
    public void init(){
        for (int i=1;i<3;i++){
            for (int m=1;m<8;m++){
                Weixin wx1=new Weixin(R.drawable.w1,"世俗","下班了，该吃饭了！！！","15:15");
                list.add(wx1);
                Weixin wx2=new Weixin(R.drawable.w2,"灭世","任务是啥？","15:01");
                list.add(wx2);
                Weixin wx3=new Weixin(R.drawable.w3,"找到月亮","做一个微信页面","14:50");
                list.add(wx3);
                Weixin wx4=new Weixin(R.drawable.w4,"遇到宇航员","争取拿到100%","14:35");
                list.add(wx4);
                Weixin wx5=new Weixin(R.drawable.w5,"M659","下班了，中午了","12:00");
                list.add(wx5);
                Weixin wx6=new Weixin(R.drawable.w6,"文凤","摸鱼ing","11:14");
                list.add(wx6);
                Weixin wx7=new Weixin(R.drawable.w7,"九海","清醒，清醒，要开始上班了","08:00");
                list.add(wx7);
                Weixin wx8=new Weixin(R.drawable.w8,"老六","早上起来了，该吃早饭了！！！","07:15");
                list.add(wx8);

            }
        }
    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

        @NonNull
        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getContext()).inflate(R.layout.weixin_content,null);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
            holder.photo.setImageResource(list.get(position).getPhoto());
            holder.name.setText(list.get(position).getName());
            holder.message.setText(list.get(position).getMessage());
            holder.time.setText(list.get(position).getTime());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
        class ViewHolder extends RecyclerView.ViewHolder{
            ImageView photo;
            TextView name;
            TextView message;
            TextView time;


            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                photo = itemView.findViewById(R.id.weixin_photo);
                name = itemView.findViewById(R.id.weixin_name);
                message = itemView.findViewById(R.id.weixin_message);
                time = itemView.findViewById(R.id.weixin_time);
            }
        }
    }
}
