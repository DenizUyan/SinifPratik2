public class Main {
    public static void main(String[] args) {
        Fighter Deniz = new Fighter("Deniz",20,100,80,80);
        Fighter Ceren = new Fighter("Ceren", 1,20,40,70);
        Ring go = new Ring(Deniz,Ceren,40,80);
        go.run();
    }
}