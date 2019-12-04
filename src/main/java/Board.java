import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Board {
    private List<BoardObserver> players;
    List<Card> cardList;

    public Board(){
        players = new ArrayList<>();
    }

    public void addPlayer(BoardObserver boardObserver){
        players.add(boardObserver);
    }

    public void removePlayer(BoardObserver boardObserver){
        players.remove(boardObserver);
    }

    private void notifyPlayer(Player player){
        for(BoardObserver boardObserver : players){
            boardObserver.update(player);
        }
    }

    public Player winner(List<Player> playerList){
        playerList.sort(Comparator.comparingInt(Player::getHandValue));
        return playerList.get(playerList.size()-1);
    }

    public void setCardsOnBoard(List<Card> cardList){
        this.cardList=cardList;
    }

    public void playerDrawCard(Player player){
        notifyPlayer(player);
    }
}
