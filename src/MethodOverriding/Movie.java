package MethodOverriding;

public class Movie {
    String title;
    int duration;

    public Movie(String title, int duration) {
        this.duration = duration;
        this.title = title;
    }

    public void play() {
        System.out.println("Playing Movie: " + title);
    }
    public void displayGenre() {
        System.out.println("Genre: General Movie");
    }
}
class RomComMovie extends Movie {
    public RomComMovie(String title, int duration) {
        super(title, duration);
    }

    public void play() {
        System.out.println("Playing Romantic Comedy: " + title);
    }
    public void displayGenre() {
        System.out.println("Genre: Romantic Comedy");
    }
}

class ThrillerMovie extends Movie {
    public ThrillerMovie(String title, int duration) {
        super(title, duration);
    }

    public void play() {
        System.out.println("Playing Thriller Movie: " + title);
    }
    public void displayGenre() {
        System.out.println("Genre: Thriller");
    }
}

class HorrorMovie extends Movie {
    public HorrorMovie(String title, int duration) {
        super(title, duration);
    }

    public void play() {
        System.out.println("Playing Horror Movie: " + title);
    }
    public void displayGenre() {
        System.out.println("Genre: Horror");
    }
}

class Trial {
    public static void main(String[] args) {
        Movie[] movies = {
            new RomComMovie("Hridayam", 171),
            new ThrillerMovie("Ratchasan", 170),
            new HorrorMovie("Demonte Colony", 120),
        };

        for (Movie movie : movies) {
            movie.play();
            movie.displayGenre();
            System.out.println();  
        }
    }
}
