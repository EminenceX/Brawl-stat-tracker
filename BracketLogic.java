package tournament;

/**
 *
 * @author Kyle
 */
public class BracketLogic {
    Records r = new Records();
    String[] characters = new String[2];
    String userName1;
    String userName2;
    int i = 0;
    
    public void runCharacterSelect(){
        CharacterSelect itemLoader = new CharacterSelect();
        itemLoader.setVisible(true);
        itemLoader.toFront();
    }
    
    public void setCharacter(String character){
        characters[0] = character;
        System.out.println(characters[i]);
        i++;
    }
    
    
    
    public void setUserName1(String userName){
        userName1 = userName;
        
    }
    
    public void setUserName2(String userName){
        userName2 = userName;
        
    }
    
    public void player1Wins(){
        System.out.println(userName1);
        System.out.println(userName2);
        System.out.println(characters[0]);
        System.out.println(characters[1]);
        r.increaseWins(userName1, characters[0]);
        r.increaseLoss(userName2, characters[1]);
        
        i = 0;
    }
    
    public void player2Wins(){
        r.increaseWins(userName2, characters[1]);
        r.increaseLoss(userName1, characters[0]);
        i = 0;
    }
    
}
