import java.util.ArrayList;

public class Player {
    private String name;
    private Deck deck;
    private ArrayList <Piece> hand = new ArrayList<>();
    private Domino domino;
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void draw(Piece piece){
        this.hand.get(piece);
    }
    public ArrayList<Piece> gethand(){
        return this.hand; 
    }
}