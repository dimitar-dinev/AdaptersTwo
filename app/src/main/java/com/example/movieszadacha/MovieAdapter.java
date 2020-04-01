package com.example.movieszadacha;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.movieszadacha.model.Movie;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private Movie[] mMovies;
    private Context mContext;

    public MovieAdapter(Movie[] mMovies, Context context) {
        this.mMovies = mMovies;
        this.mContext = context;
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView genreTextView;
        TextView yearTextVIew;

        MovieViewHolder(View v) {
            super(v);
            titleTextView = v.findViewById(R.id.movieTitle);
            genreTextView = v.findViewById(R.id.genre);
            yearTextVIew = v.findViewById(R.id.year);
        }
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);
        return new MovieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, final int position) {
        holder.titleTextView.setText(this.mMovies[position].getTitle());
        holder.genreTextView.setText(this.mMovies[position].getGenre());
        holder.yearTextVIew.setText(String.valueOf(this.mMovies[position].getYear()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Item #" + position + " selected: " + MovieAdapter.this.mMovies[position].getTitle() , Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.mMovies.length;
    }
}
