package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SongRepository {
    public List<Song> findAll() {
        return DataHolder.songs;
    }

    public Song findByTrackId(Long trackId) {
        return DataHolder.songs.stream().filter(song -> song.getTrackId().equals(trackId)).findFirst().orElse(null);
    }

    public List<Song> searchByTitle(String title) {
        return DataHolder.songs.stream().filter(song -> song.getTitle().contains(title)).toList();
    }

    public Artist addArtistToSong(Artist artist, Song song) {
        for (Song s : DataHolder.songs) {
            if(s.getTrackId().equals(song.getTrackId())) {
                s.addPerformer(artist);
                return artist;
            }

            }
        return null;

    }

    public Optional<Song> save(String title, String genre, Integer releaseYear, Album album) {
        Song song = new Song(title, genre, releaseYear, album);
        DataHolder.songs.removeIf(s -> s.getTitle().equals(title));
        DataHolder.songs.add(song);
        return Optional.of(song);
    }
    public void deleteById(Long id) {
        DataHolder.songs.removeIf(s -> s.getTrackId().equals(id));
    }
}
