package listeners;

import java.io.File;

/**
 * @author soybean
 * @date 2025/2/19 16:00
 * @description
 */
public interface EventListener {
    void update(String eventType, File file);
}
