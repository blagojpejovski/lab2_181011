package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artistList = new ArrayList<>();
    public static List<Song> songs= new ArrayList<>();

    public static List<Album> albumList = new ArrayList<>();


    @PostConstruct
    public void init() {
        albumList.add(new Album("album 1", "rock", "2014"));
        albumList.add(new Album("album 2", "pop", "2004"));
        albumList.add(new Album("album 3", "jazz", "2010"));
        albumList.add(new Album("album 4", "metal", "1980"));
        albumList.add(new Album("album 5", "rock", "2002"));

        artistList.add(new Artist(1L, "artist1", "last1", "dhgvongnv"));
        artistList.add(new Artist(22L, "None", "Nedelkovska", "Legenda"));
        artistList.add(new Artist(44L, "Elvir", "Mekic", "Licno tvoj"));
        artistList.add(new Artist(612L, "Adrijan", "Gadza", "patriot"));
        artistList.add(new Artist(327L, "Vrcak", "Vrcakovski", "Legenda"));

        songs.add(new Song("aaaa","Milioner",1990,albumList.get(4)));
        songs.add(new Song("bbbb","Lesno ko dva i dva",1991,albumList.get(3)));
        songs.add(new Song("ffff","Lesno ko dva i dva",1992,albumList.get(2)));
        songs.add(new Song("cccc","Licno tvoj",1993,albumList.get(1)));
        songs.add(new Song("dddd","Brilijanti",1994,albumList.get(0)));




    }
}
