/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.mod5;

/**
 *
 * @author aditya
 */
public class JURNALMOD5 {

  public static void main(String[] args) {
        SayaTubeVideo video1 = new SayaTubeVideo("Review Black Panther oleh Aditya khawandi putra");
        SayaTubeVideo video2 = new SayaTubeVideo("Review Parasite oleh Aditya khawandi putra");
        SayaTubeVideo video3 = new SayaTubeVideo("Review Avengers: Endgame (2019) oleh Aditya khawandi putra");
        SayaTubeVideo video4 = new SayaTubeVideo("Review Knives Out (2019)  oleh Aditya khawandi putra");
        SayaTubeVideo video5 = new SayaTubeVideo("Review Us (2019) oleh Aditya khawandi putra");
        SayaTubeVideo video6 = new SayaTubeVideo("Review Gone Girl  oleh Aditya khawandi putra");
        SayaTubeVideo video7 = new SayaTubeVideo("Review The Da Vinci Code oleh Aditya khawandi putra");
        SayaTubeVideo video8 = new SayaTubeVideo("Review Train To Busan oleh Aditya khawandi putra");
        SayaTubeVideo video9 = new SayaTubeVideo("Review World War Z Coming oleh Aditya khawandi putra");
        SayaTubeVideo video10 = new SayaTubeVideo("Review Pee Mak oleh Aditya khawandi putra");
        video1.increasePlayCount(25000000);
        video2.increasePlayCount(25000000);
        video3.increasePlayCount(25000000);
        video4.increasePlayCount(25000000);
        video5.increasePlayCount(25000000);
        video6.increasePlayCount(25000000);
        video7.increasePlayCount(25000000);
        video8.increasePlayCount(25000000);
        video9.increasePlayCount(25000000);
        video10.increasePlayCount(25000000);


        SayaTubeUser username = new SayaTubeUser("Aditya khawandi putra");
        username.addVideo(video1);
        username.addVideo(video2);
        username.addVideo(video3);
        username.addVideo(video4);
        username.addVideo(video5);
        username.addVideo(video6);
        username.addVideo(video7);
        username.addVideo(video8);
        username.addVideo(video9);
        username.addVideo(video10);

        username.printAllVideoPlaycount();
        System.out.println("Total playcount : "+username.getTotalVideoPlayCount());
    }
    
}
