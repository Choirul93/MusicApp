package xyz.fatahillah.musicapp.model;

/**
 * Created by mac on 12/19/16.
 */

public class Artist {

    private String mAlbum;
    private String mSong;
    private String mName;

    public Artist(String mAlbum, String mSong, String mName) {
        this.mAlbum = mAlbum;
        this.mSong = mSong;
        this.mName = mName;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public void setAlbum(String mAlbum) {
        this.mAlbum = mAlbum;
    }

    public String getSong() {
        return mSong;
    }

    public void setSong(String mSong) {
        this.mSong = mSong;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    @Override
    public String toString() {
        return mName;
    }
}
