import java.util.ArrayList;
import java.util.random;

public class Deck {
    private ArrayList<Domino> dominozinho;
    private Random random;
    public Deck(){
        this.dominozinho = new ArrayList<Domino>();
        this.random = new random();
        this.populate();
    }    
    public void populate(){
        for(int i=0; i<7; i++){
            for(int j=i; j<7; j++){
                this.dominozinho.add(new Domino(i, j));
            }
        }
    }
    public void entrPeca(){
        dominozinho.remove(random.get(Piece piece))
    }
  
}