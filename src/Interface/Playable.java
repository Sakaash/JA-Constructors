package Interface;

import java.util.Scanner;

public interface Playable {
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable {
    boolean isPlaying;
    public void play() {
        if(isPlaying) {
            System.out.println("MP3Player is already playing!");
        } else {
            isPlaying = true;
            System.out.println("MP3Player is now playing!!!");
        }
    }
    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("MP3Player has been paused!");
        } else {
            System.out.println("MP3Player is already paused!!!");
        }
    }
    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("MP3Player has been stopped!");
        } else {
            System.out.println("MP3Player is already stopped!!!");
        }
    }
}

class CDPlayer implements Playable {
    boolean isPlaying;
    public void play() {
        if(isPlaying) {
            System.out.println("CDPlayer is already playing!");
        } else {
            isPlaying = true;
            System.out.println("CDPlayer is now playing!!!");
        }
    }
    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("CDPlayer has been paused!");
        } else {
            System.out.println("CDPlayer is already paused!!!");
        }
    }
    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("CDPlayer has been stopped!");
        } else {
            System.out.println("CDPlayer is already stopped!!!");
        }
    }
}

class StreamingPlayer implements Playable {
    boolean isPlaying;
    public void play() {
        if(isPlaying) {
            System.out.println("StreamingPlayer is already playing!");
        } else {
            isPlaying = true;
            System.out.println("StreamingPlayer is now playing!!!");
        }
    }
    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("StreamingPlayer has been paused!");
        } else {
            System.out.println("StreamingPlayer is already paused!!!");
        }
    }
    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("StreamingPlayer has been stopped!");
        } else {
            System.out.println("StreamingPlayer is already stopped!!!");
        }
    }
}

class MusicPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        while (true) {
            System.out.println("Choose a Music Player:");
            System.out.println("1. MP3 Player");
            System.out.println("2. CD Player");
            System.out.println("3. Streaming Player");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            if(choice>=1 && choice<=3) {
                break;
            } else {
                System.out.println("Please enter the right choice!!!");
            }
        }
        Playable player = null;
        switch (choice) {
            case 1 -> player = new MP3Player();
            case 2 -> player = new CDPlayer();
            case 3 -> player = new StreamingPlayer();
        }
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("Control Options");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Exit");
            System.out.println("Enter the choice : ");

            int action = scanner.nextInt();
            switch (action) {
                case 1 -> player.play();
                case 2 -> player.pause();
                case 3 -> player.stop();
                case 4 -> {
                    System.out.println("Exiting playback control");
                   exit = true;
                }
                default -> System.out.println("Invalid Option!");
            }

        }
        scanner.close();
    }
}