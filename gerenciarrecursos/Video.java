package gerenciarrecursos;

public class Video{
    private int likes = 0;
    private int dislikes = 0;
    private int views = 0;
    
    public synchronized void imprimeVideo() {
    	System.out.println("|Views:" + "\t" + views +"\t" + "|Likes:" + "\t" + likes + "\t" + "|Dislikes:" + "  " + dislikes + "|");
    }
   
    public void removeLikes(int likes){
        this.likes -= likes;
    }
    
    public void removeViews(int views){
        this.views -= views;
    }
    
    public void removeDislikes(int dislikes){
        this.dislikes -= dislikes;
    }
    
    public void addLikes(int likes){
        this.likes += likes;
    }
    
    public void addDislikes(int dislikes){
        this.dislikes += dislikes;
    }
    
    public void addViews(int views){
        this.views += views;
    }
    
    public int getLikes() {
        return this.likes;
    }

    public int getDislikes() {
        return this.dislikes;
    }

    public int getViews() {
        return this.views;
    }
}
