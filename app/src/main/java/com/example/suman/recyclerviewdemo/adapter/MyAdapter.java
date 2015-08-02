package com.example.suman.recyclerviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.suman.recyclerviewdemo.anim.AnimationUtils;
import com.example.suman.recyclerviewdemo.pojo.Mypojo;
import com.example.suman.recyclerviewdemo.R;

import java.util.ArrayList;

/**
 * Created by Suman on 7/26/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Mypojo> pojos;
    private int lastPosition=1;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View view;
        public ViewHolder(View v) {
            super(v);
            view = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(ArrayList<Mypojo> pojos) {
       this.pojos = pojos;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        TextView title = (TextView) holder.view.findViewById(R.id.title);
        TextView description = (TextView) holder.view.findViewById(R.id.description);
        final ImageView imageview = (ImageView) holder.view.findViewById(R.id.imageView);

        title.setText(pojos.get(position).getTitle());
        description.setText(pojos.get(position).getDescription());
        imageview.setImageResource(pojos.get(position).getImage());

        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //imageview.setImageResource(R.drawable.sonwhite);

            }




//            YoYo.with(Techniques.Wobble)
//                    .duration(700)
//            .playOn(holder.itemView));

//            Animation animation = AnimationUtils.loadAnimation(context,
//                    (position > lastPosition) ? R.anim.up_from_bottom
//                            : R.anim.down_from_top);
//            holder.itemView.startAnimation(animation);
//            lastPosition = position;

//            if(position>previousPosition)
//            AnimationUtils.animate(holder);
//

        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return pojos.size();
    }
}