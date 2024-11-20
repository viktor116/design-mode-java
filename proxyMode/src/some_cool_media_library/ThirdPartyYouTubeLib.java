package some_cool_media_library;

import java.util.HashMap;

/**
 * @author soybean
 * @date 2024/10/12 17:21
 * @description
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
