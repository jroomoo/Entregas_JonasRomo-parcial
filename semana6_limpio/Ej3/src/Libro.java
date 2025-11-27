public class Libro {
    private String ISBN;
    private String title;
    public Libro(String iSBN, String title) {
        ISBN = iSBN;
        this.title = title;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void showLibro(){
        System.out.println("ISBN" + ISBN + title);
    }



    


}
