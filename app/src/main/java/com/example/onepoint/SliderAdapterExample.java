package com.example.onepoint;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapterExample extends
        SliderViewAdapter<SliderAdapterExample.SliderAdapterVH> {

    private Context context;
    private int mCount;

    public SliderAdapterExample(Context context) {
        this.context = context;
    }

    public void setCount(int count) {
        this.mCount = count;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, final int position) {


        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This is item in position " + position, Toast.LENGTH_SHORT).show();
            }
        });


        switch (position) {
            case 1:
                viewHolder.textViewDescription.setText("Welcome to our College");
                viewHolder.textViewDescription.setTextSize(16);
                viewHolder.textViewDescription.setTextColor(Color.WHITE);
                viewHolder.imageGifContainer.setVisibility(View.GONE);
                //viewHolder.imageGifContainer
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.bridge)

                        .into(viewHolder.imageViewBackground);
                break;
            case 0:
                viewHolder.textViewDescription.setText("Engaging Talent Discovering Ideas");
                viewHolder.textViewDescription.setTextSize(16);
                viewHolder.textViewDescription.setTextColor(Color.WHITE);
                viewHolder.imageGifContainer.setVisibility(View.GONE);
                Glide.with(viewHolder.itemView)
                        .load( R.drawable.pic1)

                        .into(viewHolder.imageViewBackground);
                break;

            case 2:
                viewHolder.textViewDescription.setText("Top Enginerring College in ASANSOL"  );
                viewHolder.textViewDescription.setTextSize(16);
                viewHolder.textViewDescription.setTextColor(Color.WHITE);
                viewHolder.imageGifContainer.setVisibility(View.GONE);
                Glide.with(viewHolder.itemView)
                        .load( R.drawable.tagore)

                        .into(viewHolder.imageViewBackground);
                break;
            case 3:
                viewHolder.textViewDescription.setText("CSE Rocks!!!");
                viewHolder.textViewDescription.setTextSize(16);
                viewHolder.textViewDescription.setTextColor(Color.WHITE);
                viewHolder.imageGifContainer.setVisibility(View.GONE);
                Glide.with(viewHolder.itemView)
                        .load( R.drawable.hostel)

                        .into(viewHolder.imageViewBackground);
                break;



            case 4:
                viewHolder.textViewDescription.setText("Thsi is our Home");
                viewHolder.textViewDescription.setTextSize(16);
                viewHolder.textViewDescription.setTextColor(Color.WHITE);
                viewHolder.imageGifContainer.setVisibility(View.GONE);
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.pic7)

                        .into(viewHolder.imageViewBackground);
                break;
            default:
                viewHolder.textViewDescription.setTextSize(29);
                viewHolder.textViewDescription.setTextColor(Color.WHITE);
                viewHolder.textViewDescription.setText("Ohhhh! look at this!");
                viewHolder.imageGifContainer.setVisibility(View.VISIBLE);
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.pic9)

                        .into(viewHolder.imageViewBackground);
                Glide.with(viewHolder.itemView)
                        .asGif()
                        .load(R.drawable.pic12)
                        .into(viewHolder.imageGifContainer);
                break;

        }

    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return mCount;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground;
        ImageView imageGifContainer;
        TextView textViewDescription;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            imageGifContainer = itemView.findViewById(R.id.iv_gif_container);
            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView = itemView;
        }
    }


}

