public class Level1 {

    public static int[] MadMax(int N, int[] Tele) {
        int mid = N / 2;

        boolean xchange = true;
        int x;

        while(xchange) {
            xchange = false;

            for(int i = 0; i < Tele.length - 1; i ++)
                if(Tele[i] > Tele[i+1]) {
                    x = Tele[i];
                    Tele[i] = Tele[i+1];
                    Tele[i+1] = x;

                    xchange = true;
                }
        }

        xchange = true;
        while(xchange) {
            xchange = false;

            for(int i = mid; i < Tele.length - 1; i ++)
                if(Tele[i] < Tele[i+1]) {
                    x = Tele[i];
                    Tele[i] = Tele[i+1];
                    Tele[i+1] = x;

                    xchange = true;
                }
        }

        return Tele;



    }

}


