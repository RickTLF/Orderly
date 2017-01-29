package com.systems.sublime.orderly;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Rick on 1/29/2017.
 */

public class AgendaFragment extends ListFragment {

    String [] agendaItems = {
            "list item 1",
            "list item 2",
            "list item 3",
            "list item 4",
            "list item 5",
            "list item 6",
            "list item 7",
            "list item 8",
            "list item 9",
            "list item 10",
            "list item 11",
            "list item 12",
            "list item 13",
            "list item 14",
            "list item 15",
    };

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), R.layout.agenda_list_item, agendaItems);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (v.getDrawingCacheBackgroundColor() != 0xFFF) {
            // v.setBackgroundColor(0xFFF);
            // v.setBackgroundColor(0x0);
        }

        final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.menu_click);
        mp.start();
    }

    /**
     * Get the position of the currently selected list item.
     */
    @Override
    public int getSelectedItemPosition() {
        return super.getSelectedItemPosition();
    }
}
