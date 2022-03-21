public class Boo {
public Boo(int i) {}
public Boo (String s) {}
public Boo(String s, int i) { }
}

class SonOfBoo extends Boo {

public SonOfBoo(int i, int y, int x) {
super(y, "star");
}
}