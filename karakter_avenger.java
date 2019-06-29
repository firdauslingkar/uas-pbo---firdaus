/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author firdaus
 */
public class karakter_avenger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        captain_america ca = new captain_america();
        ca.setnamaAvenger("Captain America");
        ca.setkarakter1("\n" + "Captain America adalah salah satu tentara super yang menjadi anggota Avenger yang berperan sebagai pemimpin tim.");
        System.out.println("Nama Avenger        :" + ca.getnamaAvenger());
        System.out.println("Karakter Avenger    :" + ca.getkarakter1());
        
        iron_man im = new iron_man();
        im.setnamaAvenger("Ironman");
        im.setkarakter2("\n" + "Iron Man memiliki armor bertenaga yang memberinya kekuatan dan daya tahan super, terbang, dan sederet senjata.");
        System.out.println("Nama Avenger        :" + im.getnamaAvenger());
        System.out.println("Karakter Avenger    :" + im.getkarakter2());
        
        thor t = new thor();
        t.setnamaAvenger("Thor");
        t.setkarakter3("\n" + 
                "Karakter thor berdasarkan pada dewa mitologi Norse dengan nama yang sama" +
                "adalah dewa petir dan memegang sebuah palu, yang memberikannya kemampuan" +
                "terbang dan mengendalikan cuaca.");
        System.out.println("Nama Avenger        :" + t.getnamaAvenger());
        System.out.println("Karakter Avenger    :" + t.getkarakter3());
        
        hulk h = new hulk();
        h.setnamaAvenger("Hulk");
        h.setkarakter4("\n" + "Hulk terkenal dengan fisiknya sangat kuat dan hampir tak terkalahkan.");
        System.out.println("Nama Avenger        :" + h.getnamaAvenger());
        System.out.println("Karakter Avenger    :" + h.getkarakter4());
        
        dr_strange ds = new dr_strange();
        ds.setnamaAvenger("Doctor Strange");
        ds.setkarakter5("\n" + 
                "Strange adalah seorang pesulap berlatih yang menarik kekuatannya dari entitas mistik " +
                "seperti Agamotto, Cyttorak, Ikonn, Oshtur, Raggadorr, dan Watoomb, yang " +
                "meminjamkan energinya untuk mantra.");
        System.out.println("Nama Avenger        :" + ds.getnamaAvenger());
        System.out.println("Karakter Avenger    :" + ds.getkarakter5());
        
        black_panter bp = new black_panter();
        bp.setnamaAvenger("Black Panter");
        bp.setkarakter6("\n" +
                "Black Panther adalah gelar seremonial yang diberikan kepada kepala Suku Panther " +
                "dari negara maju di Afrika, Wakanda. Selain memerintah negara, dia juga kepala " +
                "berbagai sukunya (secara kolektif disebut sebagai Wakandas).");
        System.out.println("Nama Avenger        :" + bp.getnamaAvenger());
        System.out.println("Karakter Avenger    :" + bp.getkarakter6());
        
        spiderman s = new spiderman();
        s.setnamaAvenger("Spiderman");
        s.setkarakter("\n" +
                "Saat memasuki usia remajanya, Parker mengikuti sebuah acara untuk tugas " +
                "sekolahnya tentang cara penanganan limbah dari laboratorium nuklir. Parker yang " +
                "saat itu baru berusia 15 tahun saat ia digigit oleh laba-laba yang mengandung radiasi" +
                "yang membuatnya memiliki kemampuan layaknya laba-laba." +
                "Setelah Peter Parker di gigit laba-laba genetik, dia telah mendapat kemampuan layaknya laba-laba.");
        System.out.println("Nama Avenger        :" + s.getnamaAvenger());
        System.out.println("Karakter Avenger    :" + s.getkarakter7());
        
        winter_soldier ws = new winter_soldier();
        ws.setnamaAvenger("Winter Soldier");
        ws.setkarakter8("\n" + 
                "Winter Soldier dikenal sebagai seorang mata - mata sekaligus pembunuh berdarah " +
                "dingin asal Russia yang sering terlibat berbagai insiden nasional maupun internasional. " +
                "Belakangan diketahui, Winter Soldier ternyata adalah Bucky Barnes, sahabat karib " +
                "Steve Rogers alias Captain America yang pada masa perang dunia kedua diduga telah tewas.");
        System.out.println("Nama Avenger        :" + ws.getnamaAvenger());
        System.out.println("Karakter Avenger    :" + ws.getkarakter8());
    }
    
}
