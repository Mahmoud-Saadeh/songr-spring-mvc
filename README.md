# Songr

In this Website there are 4 pages:

1. home page: there is a header with links to the other pages
    - html file [index](src/main/resources/static/index.html)
1. Greeting: a simple greeting
    - html file [greeting](src/main/resources/templates/greeting.html)
    - class file [Greeting](src/main/java/com/example/songr/Greeting.java)
1. Capitalize: takes a parameter and convert it to uppercase
    - html file [Capitalize](src/main/resources/templates/capitalize.html)
    - class file [Capitalize](src/main/java/com/example/songr/Capitalize.java)
1. Albums: display a list of albums and you will be able to add your albums
    - html file [Albums](src/main/resources/templates/albums.html)
    - class file [Albums](src/main/java/com/example/songr/Album.java)

## Usage

1. To use the Capitalize page you can write whatever you want in the url, for example:
   - http://localhost:8080/capitalize/write anything you want here
   
1. To use the Albums page just fill in all the data in the form and click add album