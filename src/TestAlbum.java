import javax.swing.*;
import java.awt.*;

public class TestAlbum {
    public static void main(String[] args) {

        String output="";

        Song s1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song s2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song s3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song s4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song s5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);

       Song allSongs[]=new Song[5];
       allSongs[0]=s1;
       allSongs[1]=s2;
       allSongs[2]=s3;
       allSongs[3]=s4;
       allSongs[4]=s5;

        Album title[] = new Album("Now thats what I call music 98", allSongs, "Universal Music",2016);

        JTextArea textArea = new JTextArea();
        Font font = new Font(Font.MONOSPACED, Font.PLAIN ,12 );
        textArea.setFont(font);


        output += String.format("%-12s%-18s%-13s"," Track Number "," Title "," Artist ");
        output += String.format("%-12d%-18s%-13s",s1);
        output += String.format("%-12d%-18s%-13s",s2);
        output += String.format("%-12d%-18s%-13s",s3);
        output += String.format("%-12d%-18s%-13s",s4);
        output += String.format("%-12d%-18s%-13s",s5);

        textArea.append(output);

        JOptionPane.showMessageDialog(null,output,"Album Information",JOptionPane.INFORMATION_MESSAGE);

        int trackRequest;

        trackRequest =Integer.parseInt(JOptionPane.showInputDialog("Which track would you like to play? "));

            for(int i=0;i<allSongs.length;i++){
                if(allSongs[i]!=null && allSongs[i] == trackRequest){
                    JOptionPane.showMessageDialog(null,trackRequest,"Playing Track",JOptionPane.INFORMATION_MESSAGE);
                }
            }

            String shuffle="";

            JOptionPane.showInputDialog("Would you like to shuffle the playlist yes or no");

            if(shuffle.equals("yes"))
                output += "\nShuffle playlist is as follows";

            //return randomMix;



    }
}
