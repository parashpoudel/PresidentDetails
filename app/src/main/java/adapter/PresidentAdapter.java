package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.recyclerview.DetailsActivity;
import com.e.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.President;

public class PresidentAdapter extends RecyclerView.Adapter<PresidentAdapter.PresidentViewHolder>{
    Context mContext;
    List<President> presidentList;

    //constructor to receive data from activity


    public PresidentAdapter(Context mContext, List<President> presidentList) {
        this.mContext = mContext;
        this.presidentList = presidentList;
    }

    @NonNull
    @Override
    public PresidentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.president,viewGroup,false);
        return new PresidentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PresidentViewHolder PresidentViewHolder, int i) {
        final President president = presidentList.get(i);
        PresidentViewHolder.imgProfile.setImageResource(president.getImageId());
        PresidentViewHolder.tvName.setText(president.getName());

        PresidentViewHolder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtra("image_id", president.getImageId());
                intent.putExtra("name", president.getName());
                intent.putExtra("details",president.getPresidentDetails());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return presidentList.size();
    }

    public class PresidentViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imgProfile;
        TextView tvName, tvPhone;
        public PresidentViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);

        }
    }
}
