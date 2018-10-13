package MachineWithSongs;

public class MainMachine {

    public static void main(String[] args) {
        Coins coin = new Coins();

        Machine machine = new Machine();

        Coins coinCounter = new Coins();

        coin.setCoin(7);
        machine.checkCoin(coin);
        coin.setCoin(5);
        machine.checkCoin(coin);
        coin.setCoin(5);
        machine.checkCoin(coin);

    }

}
