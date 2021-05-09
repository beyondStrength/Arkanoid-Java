
public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("sun.java2d.opengl", "true");
        GameFrame frame = new GameFrame();
        while(true) {

            frame.panel.Update();
            Thread.sleep(1000/60);
        }
    }
}
