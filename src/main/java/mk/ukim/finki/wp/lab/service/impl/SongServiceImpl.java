package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.repository.SongRepository;
import mk.ukim.finki.wp.lab.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements SongService {
    private final SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> listSong(){
        return songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song){
        return songRepository.addArtistToSong(artist,song);
    }

    @Override
    public Song findByTrackId (Long trackId) {
        return songRepository.findByTrackId(trackId);
    }

    public List<Song> searchByTitle(String title) {
        return songRepository.searchByTitle(title);
    }

    @Override
    public void deleteById(Long id) {
        songRepository.deleteById(id);
    }
    @Override
    public Optional<Song> save(String title, String genre, Integer releaseYear, Album album) {
        return songRepository.save(title, genre, releaseYear, album);
    }

}
