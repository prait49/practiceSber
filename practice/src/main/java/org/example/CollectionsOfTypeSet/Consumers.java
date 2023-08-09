package org.example.CollectionsOfTypeSet;

import java.util.*;

public class Consumers {
    private Set<Consumer> consumerSet;

    public Consumers() {
        consumerSet = new HashSet<>();
    }

    public Consumers(List<List<Consumer>> consumerLists) {
        consumerSet = new HashSet<>();
        for (List<Consumer> consumers : consumerLists) {
            consumerSet.addAll(consumers);
        }
    }

    public void addConsumer(Consumer consumer) {
        consumerSet.add(consumer);
    }

    public List<Consumer> getConsumers() {
        return new ArrayList<>(consumerSet);
    }
}