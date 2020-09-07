import java.util.*;

public class main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {


        Album album = new Album("Stormbringer", "Deep Purple");
        album.addsong("StormBringer6", 41.1);
        album.addsong("StormBringer5", 4.11);
        album.addsong("StormBringer4", 4.12);
        album.addsong("StormBringer3", 4.11);
        album.addsong("StormBringer2", 4.14);
        album.addsong("StormBringer1", 4.18);
        albums.add(album);

        album = new Album("The Man who sold the World", "THE MAN");
        album.addsong("AMIN", 23.1);
        album.addsong("AMca", 23.981);
        album.addsong("AMdacs", 21.1);
        album.addsong("AMcaaw", 3.1);
        albums.add(album);

        LinkedList<Song> Playlist = new LinkedList<Song>();
        albums.get(0).addtoplaylist("StormBringer2", Playlist);
        albums.get(0).addtoplaylist("StormBringer4", Playlist);
        albums.get(0).addtoplaylist("StormBrin", Playlist);
        albums.get(0).addtoplaylist(6, Playlist);

        albums.get(1).addtoplaylist(4, Playlist);
        albums.get(1).addtoplaylist(2, Playlist);
        albums.get(1).addtoplaylist(1, Playlist);
        albums.get(0).addtoplaylist(16, Playlist);

        play(Playlist);

    }


    private static void play(LinkedList<Song> Playlist) {
        Scanner scan = new Scanner(System.in);
        ListIterator i = Playlist.listIterator();
        boolean quit = false;
        boolean forward = true;
        if (Playlist.size() == 0) {
            System.out.println("The Playlist is empty");
            return;
        } else {
            System.out.println("Now Playing " + i.next());
            printmenu();

        }


        while (quit == false) {
            int act = scan.nextInt();
            switch (act) {
                case 0:
                    System.out.println("Playlist complete. ");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (i.hasNext()) {
                            i.next();
                        }
                        forward = true;
                    }
                    if (i.hasNext()) {
                        System.out.println("Now Playing " + i.next());
                    } else {
                        System.out.println("Reached End of playlist");
                        forward = false;
                    }

                    break;

                case 2:
                    if (forward) {
                        if(i.hasPrevious()) {
                            i.previous();
                        }
                        forward = false;
                    }
                    if (i.hasPrevious()) {
                        System.out.println("Now Playing " + i.previous());
                    } else {
                        System.out.println("Reached Start of playlist");
                        forward = true;
                    }

                    break;

                case 3:
                    if (forward) {
                        if (i.hasPrevious()) {
                            System.out.println("NOW Replaying " + i.previous());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (i.hasNext()) {
                            System.out.println("NOW Replaying " + i.next());
                            forward = true;
                        } else {
                            System.out.println("We are at the end of the list");

                        }
                    }

                    break;

                case 4:
                    printlist(Playlist);

                    break;

                case 5:
                    printmenu();
                    break;

                case 6:
                    if (Playlist.size() > 0) {
                        i.remove();
                        if (i.hasNext()) {
                            System.out.println("Now Playing " + i.next());

                        } else if (i.hasPrevious()) {
                            System.out.println("Now Playing " + i.previous());

                        }
                    }

                    break;
            }
        }
    }

    private static void printmenu() {
        System.out.println("Available Action : \n press");
        System.out.println("0 - to quit \n" +
                "1 - to play next song \n" +
                "2 - to play previous song \n " +
                "3 - to replay the current song \n" +
                "4 - list songs in playlist \n" +
                "5 - print Available options \n" +
                "6 - delete current song.");
    }

    private static void printlist(LinkedList<Song> plalist) {
        Iterator<Song> i = plalist.iterator();
        if (plalist.size() == 0) {
            System.out.println("The playlist is empty");

        } else {
            System.out.println("===================================");
            while (i.hasNext()) {
                System.out.println(i.next());
            }
            System.out.println("===================================");

        }
    }


}
