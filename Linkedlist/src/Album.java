import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String Artist; 
    private ArrayList<Song> songs ;

    public Album(String albumName ,String artist) {
        this.albumName = albumName;
        this.Artist = artist;
        this.songs = new ArrayList<Song>();
    }

          private Song findsong(String title){
              for(Song checksong : this.songs ){
                  if(checksong.getSongName().equals(title) ){
                      return checksong;
                  }
              }
              return null;
          }

    public boolean addsong(String title , double duration){
        if(findsong(title) == null){
            this.songs.add(Song.Addsong(title, duration));
            return true;
        }
        return false;
    }

          public boolean addtoplaylist(int tracknumber , LinkedList<Song> playlist){
               int index  = tracknumber - 1;
                if((index >= 0 )&&(index <= this.songs.size())){
                    playlist.add(this.songs.get(index));
                    return  true ;
                }
                System.out.println("this album doesnot have a track " + tracknumber);
                return false ;
          }

          public boolean addtoplaylist(String title , LinkedList<Song> playlist) {
        Song checksong = findsong(title);
                if(checksong != null){
                      playlist.add(checksong);
                      return true;
                }
                System.out.println("The song " + title + " is not in the album");
                return false;
          }


















}

