package com.systems.sublime.orderly;

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
            "item 1",
            "item 2",
            "item 3",
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
    }

    /**
     * Get the position of the currently selected list item.
     */
    @Override
    public int getSelectedItemPosition() {
        return super.getSelectedItemPosition();
    }
}
