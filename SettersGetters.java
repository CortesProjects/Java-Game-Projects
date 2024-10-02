public class SettersGetters {
    private String playerName;
    private int playerHealth;
    private int playerMana;
    private int playerMoney;
    private int playerExp;
    private int test;

    public void setCharacter (String playerName, int playerHealth, int playerMana, int playerMoney, int playerExp) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerMana = playerMana;
        this.playerMoney = playerMoney;
        this.playerExp = playerExp;
    }
    

    public String getName () {
        return "You " + playerName;
    }
    
    public String getStats () {
        return "Health: " + playerHealth + " Mana: " + playerMana + " Money: " + playerMoney + " Exp: " + playerExp; 
    }
}