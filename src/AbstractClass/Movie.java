package AbstractClass;

public abstract class Movie {
    String title;
    int duration;

    public Movie(String title, int duration) {
        this.duration = duration;
        this.title = title;
    }
    
    public abstract String getTitle();
    public abstract int getDuration();
}
class RomComMovie extends Movie {
    public RomComMovie(String title, int duration) {
        super(title, duration);
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    
}

class ThrillerMovie extends Movie {
    public ThrillerMovie(String title, int duration) {
        super(title, duration);
    }
    public int getDuration() {
        return duration;
    }
    public String getTitle() {
        return title;
    }
}

class HorrorMovie extends Movie {
    public HorrorMovie(String title, int duration) {
        super(title, duration);
    }
    public int getDuration() {
        return duration;
    }
    public String getTitle() {
        return title;
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
            System.out.println("Title of the movie : " + movie.getDuration());
            System.out.println("Duration of the movie : " + movie.getTitle());
            System.out.println();  
        }
    }
}
