package static_final;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public String getBookTitle(){
        return bookTitle;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public String getCategory(){ // изначально не прописывала паблик, потом дописала (помог ИИ) далее сама все сделала
        return category;
    }


    public void setBookTitle( String newBookTittle){
        this.bookTitle = newBookTittle;
    }

    public void setAuthor( String newAuthor){
        this.author = newAuthor;
    }
    public void setYear( int newYear){
        this.year = newYear;
    }

    public void setCategory( String newCategory){
        this.category = newCategory;
    }







}
