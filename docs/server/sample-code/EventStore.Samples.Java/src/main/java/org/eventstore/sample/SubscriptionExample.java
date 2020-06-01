package org.eventstore.sample;

import java.io.Closeable;
import akka.actor.ActorSystem;
import eventstore.j.*;
import eventstore.core.IndexedEvent;
import eventstore.akka.SubscriptionObserver;

public class SubscriptionExample {
    public static void main(String[] args) {
        final ActorSystem system = ActorSystem.create();
        final EsConnection connection = EsConnectionFactory.create(system);

        // #region subscription
        final Closeable closeable = connection.subscribeToStream("newstream", new SubscriptionObserver<IndexedEvent>() {
            @Override
            public void onLiveProcessingStart(Closeable subscription) {
                system.log().info("live processing started");
            }

            @Override
            public void onEvent(IndexedEvent event, Closeable subscription) {
                system.log().info(event.toString());
            }

            @Override
            public void onError(Throwable e) {
                system.log().error(e.toString());
            }

            @Override
            public void onClose() {
                system.log().error("subscription closed");
            }
        }, false, null);
        // #endregion subscription
    }
}
