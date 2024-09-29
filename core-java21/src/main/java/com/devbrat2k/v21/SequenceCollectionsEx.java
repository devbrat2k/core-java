package com.devbrat2k.v21;

public class SequenceCollectionsEx {

}

/**
 * The new interfaces created under the sequenced collections initiative represent collections with a defined encounter order.
 * The order will have a well-defined first element, second element, and so forth, up to the last element.
 * The newly added interfaces provide a uniform API to access these elements in a sequence, or in the reverse order.
 *
 * All popular and commonly used collection classes now implement the java.util.SequencedCollection,
 * java.util.SequencedSet or java.util.SequencedMap interfaces as well, according to the corresponding collection type.
 * The new interfaces have additional methods to support sequential access to the elements.
 * For example, SequencedCollection has the following methods:
 *
 * interface SequencedCollection<E> extends Collection<E> {
 *  SequencedCollection<E> reversed(); //// new method

     // methods promoted from Deque
 *   void addFirst(E);
 *   void addLast(E);
 *   E getFirst();
 *   E getLast();
 *   E removeFirst();
 *   E removeLast();
 */
