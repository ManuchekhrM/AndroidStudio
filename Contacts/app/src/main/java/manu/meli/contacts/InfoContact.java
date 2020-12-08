package manu.meli.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class InfoContactAdapter extends RecyclerView.Adapter<InfoContactAdapter.InfoContactViewHolder> {


    private Contact[] infoContacts;
    private OnItemClickListener infoListener;

    public InfoContactAdapter (Contact[] contacts, OnItemClickListener listener) {
        infoContacts = new Contact[contacts.length];
        infoListener = listener;

        for (int i = 0; i<contacts.length; i++) {
            infoContacts[i] = contacts[i];
        }

    }



    @Override
    public InfoContactViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_info, parent, false);
        return new InfoContactAdapter.InfoContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder( InfoContactViewHolder holder, int position) {
        holder.textView.setText(infoContacts[position].getName() + " " + infoContacts[position].getLastName());
        holder.textView.setText(infoContacts[position].getGmail());
        holder.textView.setText(infoContacts[position].getPhone());


    }

    @Override
    public int getItemCount() {
        return infoContacts.length;
    }

    public class InfoContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textView;

        public InfoContactViewHolder( View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.TextView);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            infoListener.onItemClick(getAdapterPosition());
    }
}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    interface OnItemClickListener {
        public void onItemClick(int position);



    }
}