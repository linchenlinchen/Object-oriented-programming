import java.util.Date;

public class Library{
    
    public void startReading(Book book){
        ReadRecord record = new ReadRecord(book);
        book.readRecords.add(record);
        record.startDate = new Date();//当前时间
        record.state = 1;
    }
    
    public void finishReading(ReadRecord readRecord){
        readRecord.finishDate = new Date(); //当前时间
        readRecord.state = 2;
    }
}

