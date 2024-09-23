package remotes;

import devices.Device;

/**
 * @author soybean
 * @date 2024/9/23 16:23
 * @description
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
