import javafx.scene.control.Tab;

public class Main {
    public static void main(String[] args) {
        Table t1 = new Table(8,8);
        Piece p2 = new Piece("\u001b[31mX", "X", false,1,2);
        Service service = new Service(t1);
        service.startGame();
    }
}
