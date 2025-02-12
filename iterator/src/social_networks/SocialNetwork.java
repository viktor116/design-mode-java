package social_networks;

import iterators.ProfileIterator;

/**
 * @author soybean
 * @date 2024/11/22 17:42
 * @description
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
