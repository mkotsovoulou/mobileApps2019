package com.example.f_mkotsovoulou;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.f_mkotsovoulou.R;
import com.example.f_mkotsovoulou.Word;

import java.util.ArrayList;

/**
 * Created by f-mkotsovoulou on 10/20/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {


    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        /* POPULATE TEXTVIEWS with data from the WORD object */
        TextView g = (TextView) listItemView.findViewById(R.id.greekWord);
        g.setText(currentWord.getGreekWork());

        TextView e = (TextView) listItemView.findViewById(R.id.englishWord);
        e.setText(currentWord.getEnglishWord());

        if (currentWord.getImageResourcesId() != -1) {
            ImageView i = (ImageView) listItemView.findViewById(R.id.theimage);
            i.setImageResource(currentWord.getImageResourcesId());
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.

        return listItemView;

    }
}
