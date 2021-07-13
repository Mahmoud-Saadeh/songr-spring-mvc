# Songr

In this Website there are 6 pages:

#### [Live Url](https://songr-ms.herokuapp.com/)

1. home page: there is a header with links to the other pages
    - html file [index](src/main/resources/static/index.html)
1. Greeting: a simple greeting
    - html file [greeting](src/main/resources/templates/greeting.html)
    - Controller file [Greeting](src/main/java/com/example/songr/Greeting.java)
1. Capitalize: takes a parameter and convert it to uppercase
    - html file [Capitalize](src/main/resources/templates/capitalize.html)
    - Controller file [Capitalize](src/main/java/com/example/songr/Capitalize.java)
1. Albums: display a list of albums, and you will be able to add your albums
    - html file [Albums](src/main/resources/templates/albums.html)
    - class file [Albums](src/main/java/com/example/songr/domain/Album.java)
   - Controller file [AlbumRoutes](src/main/java/com/example/songr/routes/AlbumRoutes.java)
   
1. Songs: display a list of songs, and their album title and image
   - html file [Songs](src/main/resources/templates/songs.html)
   - class file [Songs](src/main/java/com/example/songr/domain/Song.java)
   - Controller file [SongRoutes](src/main/java/com/example/songr/routes/SongRoutes.java)
   
1. Album Songs: display a only the songs that is in the same album and you can access it by clicking on the album that you want to see
   - html file [albumSongs](src/main/resources/templates/albumSongs.html)
   - class file [Songs](src/main/java/com/example/songr/domain/Song.java)
   - Controller file [SongRoutes](src/main/java/com/example/songr/routes/SongRoutes.java)
   
## Usage

1. To use the Capitalize page you can write whatever you want in the url, for example:
   - http://localhost:8080/capitalize/write anything you want here
   
1. To use the Albums page just fill in all the data in the form and click add album
1. to add a new song you have to select a certain album then you will see a form to fill 

## Tests

1. in this file [IntegrationTest](src/test/java/com/example/songr/IntegrationTest.java) I created Integration Tests for the greeting page