package cn.xuchunh.algorithms.bst;

/**
 * Created by XuChunH on 2016/6/16.
 */
public class Node<K extends Comparable, V> {
    Node<K, V> left;
    Node<K, V> right;
    Node<K, V> parent;

    K key;
    V value;
}
