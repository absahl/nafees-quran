package ubaidiyah.nafees.demo.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo.R;

import ubaidiyah.nafees.demo.activity.ReciteActivity;
import ubaidiyah.nafees.demo.model.ListItem;
import ubaidiyah.nafees.demo.utils.Constants;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView mItemNumberTv;
        public TextView mItemTitleTv;
        private final Context context;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            context = itemView.getContext();

            mItemNumberTv = itemView.findViewById(R.id.tv_item_number);
            mItemTitleTv = itemView.findViewById(R.id.tv_item_title);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();

            //! Check if an item was deleted, but the user clicked it before the UI removed it
            if (position != RecyclerView.NO_POSITION){
                int _pageno = mItems[position].getItemStartingPage() * -1;
                //Log.i(Constants.TAG, "position " + position+1);
                Log.i(Constants.TAG, "corresponding page no " + _pageno);
                //! go to recite activity
                Intent intent = new Intent(context, ReciteActivity.class);
                intent.putExtra(Constants.PAGENO_KEY, _pageno);
                context.startActivity(intent);
            }
        }
    }

    private ListItem[] mItems;

    public RecyclerAdapter(ListItem[] items) { mItems = items; }

    /**
     * Inflate the list_item.xml and return the holder
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        //! inflate the layout
        View itemView = inflater.inflate(R.layout.list_item, parent, false);

        //! return a new holder instance
        //ViewHolder viewHolder = new ViewHolder(itemView);
        return new ViewHolder(itemView);
    }

    /**
     * Populate data into the holder
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //! set item views
        holder.mItemNumberTv.setText(String.valueOf(mItems[position].getItemNumber() ) );
        holder.mItemTitleTv.setText(mItems[position].getItemTitle() );
    }

    /**
     * Returns the total count of items in the list
     */
    @Override
    public int getItemCount() {
        return mItems.length;
    }
}
