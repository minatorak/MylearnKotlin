package InReal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Photo extends  Entitys{
    public String id;
    public int width;
    public int height;
    private String url;

    public String getDateTime(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm")
                .format(DateFormat.DATE_FIELD);
    }

    public String getId() {
        return id;
    }

    public Integer getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getUrl() {
        return url;
    }
}
