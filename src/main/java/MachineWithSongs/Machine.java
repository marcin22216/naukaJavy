package MachineWithSongs;

public class Machine {

    public void checkCoin(Coins coin)
    {
        System.out.println("Wrzuc 5 zl, to zagram Ci piosenke");

        if (coin.getCoin() < 5 || coin.getCoin() > 5)
        {
            System.out.println("Wrzuciles inna monete, Wrzuc 5 zl");

        }
        else
        {
            System.out.println("zagram Ci piosenke!");

            int licznikMonet = coin.getCoinCounter() + 5;
            coin.setCoinCounter(licznikMonet);

            System.out.println("Automat zebral:" + coin.getCoinCounter() + "pieniedzy!");
        }
    }
}
