package fr.epita.android.whatilike;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class ThingAdapter extends ArrayAdapter<Thing> {

    public ThingAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.cell_layout, null);


        Thing currentThing = getItem(position);

        ImageView thumb = view.findViewById(R.id.thumbImageView);
        TextView name = view.findViewById(R.id.nameTextView);

        name.setText(String.valueOf(currentThing.getName()));
        return view;
    }
}
