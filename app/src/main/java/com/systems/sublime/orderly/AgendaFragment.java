///////////////////////////////////////////////////
//--------------------------------------------------
// ANDROID ORDERLY APP
//--------------------------------------------------
///////////////////////////////////////////////////

// Developer     :   Rick Kock
// Date          :   25/01/2017
// Team members  :   -

/**************************************************
Description:


**************************************************/

///////////////////////////////////////////////////

package com.systems.sublime.orderly;

//--------------------------------------------------
// IMPORTS
//--------------------------------------------------
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
//--------------------------------------------------

/**
 * Created by Rick on 1/29/2017.

 */

public class AgendaFragment extends ListFragment {

    /**
     * TODO: 06/02/2017 create list header for each month.
     *
     * Each agenda list-item has one task, a brief description,
     * date and time. Each month is ended with a divider.
     *
     * TODO: create add button.
     *
     * TODO: Add functions:
     *
     * - delete task
     * - add task
     * - discontinue task
     * - complete task
     * - view tasks description
     *
     * CURRENT:
     *
     *
     *
     */

    private AgendaListAdapter agendaListAdapter;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Fragment agendaView = inflater.inflate(R.layout.agenda_fragment);
        // ListView agendaList = (ListView) getActivity().findViewById(R.id.agenda_list);

        // ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), R.layout.agenda_list_item, agendaItems);
        // setListAdapter(adapter);


        View agendaView = inflater.inflate(R.layout.agenda_fragment, container, false);

        ArrayAdapter adapter = new ArrayAdapter<>(getActivity(), R.layout.agenda_list_item, agendaItems);
        setListAdapter(adapter);

        return agendaView;

        /*agendaListAdapter = new AgendaListAdapter(getActivity());

        agendaList.setAdapter(agendaListAdapter);

        for (int i = 1 ; i < 30 ; i++) {
            agendaListAdapter.addItem("Row item # " + i);
            if (i % 4 == 0) {
                agendaListAdapter.addSectionHeaderItem("Section # " + i);
            }
        }

        return agendaList;*/
        // return super.onCreateView(inflater, container, savedInstanceState);
    }

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

    /*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // View agendaView = inflater.inflate(R.layout)
        ListView agendaList = (ListView) getActivity().findViewById(R.id.agenda_list);

        agendaListAdapter = new AgendaListAdapter(getActivity());

        agendaList.setAdapter(agendaListAdapter);

        for (int i = 1 ; i < 30 ; i++) {
            agendaListAdapter.addItem("Row item # " + i);
            if (i % 4 == 0) {
                agendaListAdapter.addSectionHeaderItem("Section # " + i);
            }
        }

        return agendaList;
        return super.onCreateView(inflater, container, savedInstanceState);
    }*/

    /*
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        agendaListAdapter = new AgendaListAdapter(getActivity());

        for (int i = 1 ; i < 30 ; i++) {
            agendaListAdapter.addItem("Row item # " + i);
            if (i % 4 == 0) {
                agendaListAdapter.addSectionHeaderItem("Section # " + i);
            }
        }
        // ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), R.layout.agenda_list_item, agendaItems);
        // setListAdapter(adapter);
    }*/

    /*
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

    @Override
    public int getSelectedItemPosition() {
        return super.getSelectedItemPosition();
    }*/
}
