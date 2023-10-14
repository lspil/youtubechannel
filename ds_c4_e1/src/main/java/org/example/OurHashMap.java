package org.example;

public class OurHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 50;

    private Entry<K, V>[] table = new Entry[DEFAULT_CAPACITY];

    private static class Entry<K, V> {

        private final K key;
        private V value;

        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    public void put(K k, V v) {
        if (k == null) {
            throw new RuntimeException("Key cannot be null");
        }

        int hash = k.hashCode();
        int index = hash % DEFAULT_CAPACITY;

        Entry<K, V> entry = new Entry<>(k, v);

        if (table[index] == null)  {
            table[index] = entry;
        } else {
            Entry<K, V> current = table[index];

            while (current.next != null) {
                if (current.key.equals(k)) {
                    current.value = v;
                    return;
                }
                current = current.next;
            }

            current.next = entry;
        }
    }

    public V get(K k) {
        if (k == null) {
            throw new RuntimeException("Key cannot be null");
        }

        int hash = k.hashCode();
        int index = hash % DEFAULT_CAPACITY;

        Entry<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(k)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }
}
