import java.util.Arrays;

public class Album {
    private String albumName;
    private Song [] tracks;
    private String producer;
    private int albumReleaseYear;

    public Album(String albumName, Song[] tracks, String producer, int albumReleaseYear) {
        setAlbumName(albumName);
        setTracks(tracks);
       setProducer(producer);
       setAlbumReleaseYear(albumReleaseYear);
        shuffle();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        if(albumName!=null)
        this.albumName = albumName;
        else
            albumName = "No name specifed";
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
        playTrack();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getAlbumReleaseYear() {
        return albumReleaseYear;
    }

    public void setAlbumReleaseYear(int albumReleaseYear) {
        this.albumReleaseYear = albumReleaseYear;
    }

    private int getNumberOfTracks(){
        int totalNumberOfTracks=0;
        Song song[];

        for(int i=0;i< song.length;i++){
            if(song[i]!=null){

                for(int j=0;j<tracks.length;j++)
                    if(tracks[j]!=null) {
                        totalNumberOfTracks++;
                    }
            }
        }
        return totalNumberOfTracks;

    }

    private int getPlayingTime(){
        float playTime=0;

        for(int i=0;i<tracks.length;i++)
            if(tracks[i]!=null)
                playTime = tracks[i]/180;

        return (int)playTime;

    }

    private int playTrack(){

        int playSong=0;
        String output="";

       if(playSong >=1 && playSong<=5)
           output += "Track now playing";

       else
           output += "Invalid Track number was supplied";



    }

    private int shuffle(){
        int randomMix=0;
        Song song[];

        for(int i=0; i<song.length-1;i++){
             randomMix += song[i];
             randomMix = (int) (Math.random()*4)+1;
        }

        return randomMix;
    }

    @Override
    public String toString() {
        String str="";

               str += "AlbumName: " + getAlbumName() + "\n" +
                " Producer: " + getProducer()+ "\n" +
                " AlbumReleaseYear: " + getAlbumReleaseYear() +  "\n" + "Tracks: " ;

        for(int i=0; i<tracks.length;i++){
            if(tracks[i]!=null){
                str += tracks[i];
            }
        }

        str += " Total Playing Tine : " + getPlayingTime();



             return str;
    }
}
