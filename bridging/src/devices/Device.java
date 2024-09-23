package devices;

/**
 * @author soybean
 * @date 2024/9/23 16:18
 * @description
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
