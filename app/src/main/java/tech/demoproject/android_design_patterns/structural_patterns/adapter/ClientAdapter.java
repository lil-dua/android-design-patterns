package tech.demoproject.android_design_patterns.structural_patterns.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import tech.demoproject.android_design_patterns.R;

/***
 * Created by HoangRyan aka LilDua on 10/19/2022.
 */
public class ClientAdapter extends RecyclerView.Adapter<ClientAdapter.ClientViewHolder>{

    private Context mContext;
    private View view;

    private List<User> users;

    public ClientAdapter(Context mContext, List<User> users) {
        this.mContext = mContext;
        this.users = users;
    }

    @NonNull
    @Override
    public ClientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.user_list,parent,false);
        return new ClientViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClientViewHolder holder, int position) {
        User user = users.get(position);
        holder.txtName.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ClientViewHolder extends RecyclerView.ViewHolder{

        public TextView txtName;

        public ClientViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtUserName);
        }
    }
}
