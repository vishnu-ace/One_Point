package com.example.onepoint;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class BloodGroupAdapter extends FirebaseRecyclerAdapter<BloodGroupDetails, BloodGroupAdapter.BloodGroupHolder> {



    public BloodGroupAdapter(@NonNull FirebaseRecyclerOptions<BloodGroupDetails> options) {
        super( options );
    }

    @Override
    protected void onBindViewHolder(@NonNull BloodGroupHolder holder, int position, @NonNull BloodGroupDetails model) {

        holder.BloodGroupAge.setText( model.getAge() );
        holder.BloodGroupPhone.setText( model.getPhone() );


    }

    @NonNull
    @Override
    public BloodGroupHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.blood_group_details, parent, false);

        return new BloodGroupHolder(view);
    }

    class BloodGroupHolder extends RecyclerView.ViewHolder{

        TextView BloodGroupAge,BloodGroupPhone;
        public BloodGroupHolder(@NonNull View itemView) {
            super( itemView );

            BloodGroupAge=(TextView)itemView.findViewById( R.id.Age );
            BloodGroupPhone=(TextView)itemView.findViewById( R.id.Phone );
        }
    }
}
