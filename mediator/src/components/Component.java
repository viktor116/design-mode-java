package components;

import mediator.Mediator;

/**
 * @author soybean
 * @date 2024/11/28 14:55
 * @description
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
