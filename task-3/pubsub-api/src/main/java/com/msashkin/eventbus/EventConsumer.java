package com.msashkin.eventbus;

import java.util.Collection;

public interface EventConsumer<T> extends RunnableEventConsumer {

    ConsumerConfiguration getConfiguration();

    int getPartitionsCount();

    void addEventListener(EventListener<T> listener);

    void removeEventListener(EventListener<T> listener);

    void setEventListeners(Collection<EventListener<T>> listeners);
}
