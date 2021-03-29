package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
    Album album = new Album("Gogol Bordello", "Seekers and Finders");
    album.addSong("seekers and finders", 4.6);
    album.addSong("american weeding", 3.9);
    album.addSong("start wearing purple", 2.9);
    album.addSong("Dont Panic", 4.9);
    album.addSong("sunshine", 3.9);

    albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("seekers and finders",playList);
        albums.get(0).addToPlaylist("america weeding", playList);
        albums.get(0).addToPlaylist(2,playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
            if (playList.size() == 0) {
                System.out.println("no songs");
                return;
            } else {
                System.out.println("Play music" + listIterator.toString());

            }
        }
    }

