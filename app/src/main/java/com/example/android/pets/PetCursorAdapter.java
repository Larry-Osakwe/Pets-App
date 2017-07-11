package com.example.android.pets;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

/**
 * Created by Larry Osakwe on 7/11/2017.
 */

public class PetCursorAdapter extends CursorAdapter{

    public PetCursorAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        // Create and return new blank list item
        return LayoutInflater.from(context).inflate(R.layout.item_pet, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Populate list item view with pet data
    }
}
