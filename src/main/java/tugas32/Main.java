/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas32;
import java.util.ArrayList;

/**
 *
 * @author
 * Aris Prabowo 
 * 10119914 - IF10K
 */
public class Main {
    public static void main(String[] args) {
       String[] judulFilm = {"Venom", "Little Foot", "Crazy Rich Asian", "Asih"};
       String[] genreFilm = {"Action, Horor, Scifi", "Animation", "Comedy", "Horor"};
       double[] ratingFilm = {8.5 , 9.0, 7.8, 6.0};
       int[] durationFilm = {120, 96, 119, 100};
       Film filmList[] = new Film[judulFilm.length];
       
       System.out.println("\n=====Daftar Film Sedang Tayang=====\n");
       for(var i=0;i<filmList.length;i++){
           filmList[i] = new Film();
           filmList[i].filmName = judulFilm[i];
           filmList[i].filmGenre = genreFilm[i];
           filmList[i].filmRating = ratingFilm[i];
           filmList[i].filmDuration = durationFilm[i];
           filmList[i].nowPlaying();
       }
    }
    
}
