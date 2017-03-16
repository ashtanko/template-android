package io.shtanko.basetemplate.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.shtanko.basetemplate.model.Action;
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
    holder.itemView.setTag(action);
  }

  @Override public int getItemCount() {
    return actions.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {

    public ViewHolder(View itemView) {
      super(itemView);
    }
  }
}
