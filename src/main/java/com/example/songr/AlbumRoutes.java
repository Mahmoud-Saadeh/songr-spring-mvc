package com.example.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumRoutes {
    @Autowired
    private AlbumRepository albumRepository;
    @GetMapping("/albums")
    String getAlbums(Model model){
        ArrayList<Album> albums = new ArrayList<>();

        albums.add(new Album("Song1","Artist1", 2,120, "https://cdn.pixabay.com/photo/2017/08/02/05/49/recording-2570056__340.jpg"));
        albums.add(new Album("Song2","Artist2", 7,180, "https://cdn.pixabay.com/photo/2015/10/12/15/13/boy-984293__340.jpg"));
        albums.add(new Album("Song3","Artist3", 5,240, "https://cdn.pixabay.com/photo/2015/06/07/18/41/birds-800671_960_720.jpg"));
//        List<Album> albums = albumRepository.findAll();
//        System.out.println("albums.size()"+albums.size());
//        model.addAttribute("albumClass", new Album());
        model.addAttribute("albums",albums);
        model.addAttribute("albumsSize",albums.size());

        return "albums";
    }
//    @PostMapping("/albums")
//    public String postAlbum(@ModelAttribute Album album, Model model){
//        albumRepository.save(album);
//
//        List<Album> albums = albumRepository.findAll();
//        model.addAttribute("albumClass", new Album());
//        model.addAttribute("albums",albums);
//
//        System.out.println("albums.size() PostMapping   "+albums.size());
////        System.out.println("albums.size() PostMapping   "+albums.get(0));
////        System.out.println("the greeting is >>> " + album.getContent());
////        model.addAttribute("album", album);
//        return "redirect:/albums";
//    }
}
