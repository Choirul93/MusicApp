package xyz.fatahillah.musicapp.model;

/**
 * Created by mac on 12/19/16.
 */

public class Album {

    private String mName;
    private String mSong;
    private String mArtist;


    public Album(String mName, String mSong, String mArtist) {
        this.mName = mName;
        this.mSong = mSong;
        this.mArtist = mArtist;
    }


    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getSong() {
        return mSong;
    }

    public void setSong(String mSong) {
        this.mSong = mSong;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    @Override
    public String toString() {
        return mName;
    }
}
