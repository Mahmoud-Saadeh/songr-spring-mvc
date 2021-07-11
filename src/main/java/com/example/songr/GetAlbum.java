package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class GetAlbum {
    @GetMapping("/albums")
    String getAlbums(Model model){
        ArrayList<Album> albums = new ArrayList<>();

        albums.add(new Album("Song1","Artist1", 2,120, "https://cdn.pixabay.com/photo/2017/08/02/05/49/recording-2570056__340.jpg"));
        albums.add(new Album("Song2","Artist2", 7,180, "https://cdn.pixabay.com/photo/2015/10/12/15/13/boy-984293__340.jpg"));
        albums.add(new Album("Song3","Artist3", 5,240, "https://cdn.pixabay.com/photo/2015/06/07/18/41/birds-800671_960_720.jpg"));

        model.addAttribute("albums",albums);

        return "albums";

    }
}
