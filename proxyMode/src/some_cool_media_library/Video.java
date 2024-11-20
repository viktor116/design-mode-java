package some_cool_media_library;

/**
 * @author soybean
 * @date 2024/10/12 17:22
 * @description
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
