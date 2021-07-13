package com.example.songr.routes;

import com.example.songr.domain.Album;
import com.example.songr.domain.Song;
import com.example.songr.repositories.AlbumRepository;
import com.example.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SongRoutes {
    @Autowired
    private SongRepository songRepository;
    @Autowired
    private AlbumRepository albumRepository;
    @GetMapping("/songs")
    String getSongs(Model model){
        List<Song> songs = songRepository.findAll();
//        model.addAttribute("songsClass", new Song());
        model.addAttribute("songs",songs);
        model.addAttribute("songsSize",songs.size());

        return "songs";
    }
    @GetMapping("/album/{id}")
    public String getAlbumSongs(@PathVariable Long id,Model model) {
        Album album = albumRepository.findById(id).orElseThrow();

//        List<Song> songs = songRepository.
        model.addAttribute("songsClass", new Song());
        model.addAttribute("songs",album.getSongs());
        model.addAttribute("album",album);
        return "albumSongs";
    }

    @PostMapping("/album/{id}")
    public String postSong(@ModelAttribute Song song, Model model,@PathVariable Long id){
        Album album = albumRepository.findById(id).orElseThrow();
        song.setAlbum(album);
        songRepository.save(song);

//        List<Song> songs = songRepository.
        model.addAttribute("songsClass", new Song());
        model.addAttribute("songs",album.getSongs());
        model.addAttribute("album",album);

        System.out.println("album.getSongs().size() PostMapping   "+album.getSongs().size());
        return "redirect:/album/{id}";
    }
}
