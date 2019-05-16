import java.util.Date;

public class ReadRecord{

    public Date startDate;
    public Date finishDate;
    public Book book;
    //1. reading
    //2. finished
    public int state;

    public ReadRecord(Book book){
        this.book = book;
    }
}