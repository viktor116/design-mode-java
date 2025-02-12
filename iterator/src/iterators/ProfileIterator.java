package iterators;

import profile.Profile;
/**
 * @author soybean
 * @date 2024/11/22 17:38
 * @description
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
