
public class App {
    public static void main(String[] args) throws InterruptedException {
        GameFrame frame = new GameFrame();
        while(true) {

            frame.panel.Update();
            Thread.sleep(1000/60);
        }
    }
}
