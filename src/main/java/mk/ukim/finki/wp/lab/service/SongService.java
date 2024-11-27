package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongService {
    List<Song> listSong();
    Artist addArtistToSong(Artist artist, Song song);
    public Song findByTrackId (Long trackId);

    List<Song> searchByTitle(String title);

    void deleteById(Long id);

    public Optional<Song> save(String title, String genre, Integer releaseYear, Album albumId);
}
