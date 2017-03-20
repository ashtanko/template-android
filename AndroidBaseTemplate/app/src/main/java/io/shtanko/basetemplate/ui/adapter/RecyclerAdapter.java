package io.shtanko.basetemplate.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.shtanko.basetemplate.R;
import io.shtanko.basetemplate.data.model.Action;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

  private List<Action> actions;
  private int itemLayout;

  public RecyclerAdapter(List<Action> actions, int itemLayout) {
    this.actions = actions;
    this.itemLayout = itemLayout;
  }

  @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
    return new ViewHolder(view);
  }

  @Override public void onBindViewHolder(ViewHolder holder, int position) {
    Action action = actions.get(position);
    holder.textViewNumber.setText(String.valueOf(action.getActionNumber()));
    holder.itemView.setTag(action);
  }

  @Override public int getItemCount() {
    return actions.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {

    TextView textViewNumber;

   public ViewHolder(View itemView) {
      super(itemView);
     textViewNumber = (TextView) itemView.findViewById(R.id.textViewNumber);
    }
  }
}
