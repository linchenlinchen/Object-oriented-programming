import java.util.ArrayList;
import java.util.List;

public class Book{
    public String title;
    public int pages;
    //1. norval
    //2. acdemic
    public int bookType;
    public List<ReadRecord> readRecords = new ArrayList<ReadRecord>();

    //估计的阅读时间
    public Double getEstTime(){
        if(bookType==1){ //小说每页1分钟
            return pages * 1.0;
        }else if(bookType==2){ //学术书籍每页1.5分钟
            return pages * 1.5;
        }else throw new RuntimeException("Unknown type");
    }
}