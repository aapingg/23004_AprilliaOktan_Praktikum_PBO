package Tugas2;

public class BingoBingo {

    //konstruktor untuk BingoBingo
    public BingoBingo() {
        for (int i = 0; i <= 5; i++) {
            bbingo(i);
        }
    }

    //method untuk tampilan lirik BingoBingo
    private void bbingo(int clap) {
        String bingo = "BINGO";
        String clp = "(clap)";
        
        //tampilan baris pertama bagian lirik
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        //tampilan baris dengan "clap" yang sesuai
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < clap; k++) {
                System.out.print(clp + "-");
            }
            System.out.println(bingo.substring(clap));
        }

        //baris terakhir bagian lirik
        System.out.println("And Bingo was his name-o.\n");
    }
}
