import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Game
{
    public enum TAG{
        HORROR,
        ACTION,
        RPG,
        OPEN_WORLD,
        ADVENTURE,
        SIMULATION,
        FPS
    }

    private String name;
    private int ID;
    private String description;
    private String developer;
    private String publisher;
    private double price;
    private boolean released;
    private LocalDate releaseDate;
    private LocalDateTime lastUpdate;
    private int reviewScore;
    private int playerCount;
    private int maxPlayerCount;

    private ArrayList<TAG> tags;
    private ArrayList<String> operatingSystems;
    private ArrayList<String> categories;

    /*
    ========== CONSTRUCTORS ==========
    */

    public Game(){
        name = "";
        description = "";
        developer = "";
        publisher = "";
        price = 0.00;
        released = false;
        releaseDate = null;
        lastUpdate = null;
        reviewScore = 0;
        playerCount = 0;
        ID = 0;
        maxPlayerCount = 0;
        tags = new ArrayList<>();
        operatingSystems = new ArrayList<>();
        categories = new ArrayList<>();
    }

    public Game(String name, String description, String developer, String publisher, double price, boolean released, TAG tag, String OS, String category){
        this.name = name;
        this.description = description;
        this.developer = developer;
        this.publisher = publisher;
        this.price = price;
        this.released = released;
        tags = new ArrayList<>();
        tags.add(tag);
        operatingSystems = new ArrayList<>();
        operatingSystems.add(OS);
        categories = new ArrayList<>();
        categories.add(category);
    }

    /*
    ========== GETTERS ==========
    */

    public ArrayList<String>getCategories(){
        return categories;
    }

    public ArrayList<String>getOperatingSystems(){
        return operatingSystems;
    }

    public ArrayList<TAG> getTags(){
        return tags;
    }

    public String getPublisher(){
        return publisher;
    }

    public String getDeveloper(){
        return developer;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public boolean isReleased(){
        return released;
    }

    public LocalDate getReleaseDate(){
        return releaseDate;
    }

    public LocalDateTime getLastUpdate(){
        return lastUpdate;
    }

    public int getReviewScore(){
        return reviewScore;
    }

    public int getPlayerCount(){
        return playerCount;
    }

    public int getMaxPlayerCount(){
        return maxPlayerCount;
    }

    /*
    ========== SETTERS ==========
    */

    public void setMaxPlayerCount(int count){
        maxPlayerCount = count;
    }

    public void setReviewScore(int score){
        reviewScore = score;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDeveloper(String developer){
        this.developer = developer;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setReleased(boolean a){
        released = a;
    }

    public void setReleaseDate(LocalDate date){
        releaseDate = date;
    }

    public void setLastUpdate(LocalDateTime last){
        lastUpdate = last;
    }

    public void setPlayerCount(int count){
        playerCount = count;
    }

    public void setTags(TAG tag){
        tags.add(tag);
    }

    public void setOperatingSystems(String os){
        operatingSystems.add(os);
    }

    public void setCategories(String category){
        categories.add(category);
    }

    /*
    ========== HELPERS ==========
    */
}
