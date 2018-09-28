package quizapp.com.secondproject;

public class MostlyPlayed {

    private String mAlbum;
    private String mArtist;
    private String mDuration;
    private int mImageResourceId;

    public MostlyPlayed(String album, String artist, String duration, int imageResourceId) {

        mAlbum = album;
        mArtist = artist;
        mDuration = duration;
        mImageResourceId = imageResourceId;

    }

    public String getAlbum() {return mAlbum; }
    public String getArtist() {return mArtist; }
    public String getDuration() {return mDuration; }

    public int getImageResourceId() {return mImageResourceId; }

}
