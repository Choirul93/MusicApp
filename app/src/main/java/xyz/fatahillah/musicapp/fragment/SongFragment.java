package xyz.fatahillah.musicapp.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import xyz.fatahillah.musicapp.R;
import xyz.fatahillah.musicapp.model.Song;

/**
 * Created by mac on 12/19/16.
 */

public class SongFragment extends Fragment {

    ArrayAdapter<Song> mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View songFragment = inflater.inflate(R.layout.fragment_song, container, false);

        final ArrayList<Song> items = new ArrayList<Song>();

        // creating song item
        Song song1 = new Song("Air Hujan", "Trio Kwek Kwek", "MKKB");
        Song song2 = new Song("Rindu", "Ebiet G. Ade", "Bulan Purnama");
        Song song3 = new Song("Menunggu Pagi", "Peterpan", "Alexandria");

        // add song item to song array
        items.add(song1);
        items.add(song2);
        items.add(song3);

        ListView listView = (ListView) songFragment.findViewById(R.id.song_list_view);

        mAdapter = new ArrayAdapter<Song>(getActivity(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(mAdapter);


        return songFragment;
    }
}
