package com.example.songr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.songr.domain.Album;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {
	private Album album;

	@BeforeEach
	void setup(){
//		album = new Album("Song1","Artist1", 2,120, "https://cdn.pixabay.com/photo/2017/08/02/05/49/recording-2570056__340.jpg");
	}

	@Test
	@DisplayName("Album Constructor Tests")
	void AlbumConstructor() {
		assertEquals("Song1", album.getTitle(),"Test for the album Title");
		assertEquals("Artist1", album.getArtist(),"Test for the album Artist");
		assertEquals(2, album.getSongCount(),"Test for the album Song Count");
		assertEquals(120, album.getLength(),"Test for the album length");
		assertEquals("https://cdn.pixabay.com/photo/2017/08/02/05/49/recording-2570056__340.jpg", album.getImageUrl(),"Test for the album ImageUrl");

	}

}
