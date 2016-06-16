package cn.xuchunh.algorithms.bst;

/**
 * Created by XuChunH on 2016/6/16.
 */
public class Operator {

    @SuppressWarnings("unchecked")
    public Node search(Node node, Comparable key) {
        if (node == null || node.key == key) {
            return node;
        }
        if (key.compareTo(node.key) < 0) {
            return search(node.left, key);
        } else {
            return search(node.left, key);
        }
    }

    @SuppressWarnings("unchecked")
    public Node interativeSearch(Node node, Comparable key) {
        while (node != null && node.key.compareTo(key) != 0) {
            if(key.compareTo(node.key) < 0){
                node = node.left;
            }else{
                node = node.right;
            }
        }
        return node;
    }

    @SuppressWarnings("unchecked")
    public void insert(BSTree tree, Node node){
        Node temp = null;
        Node x = tree.root;
        while(x != null){
            temp = x;
            if(node.key.compareTo(x.key) < 0){
                x = x.left;
            }else {
                x = x.right;
            }
        }
        node.parent = temp;
        if(temp == null){
            tree.root = node;
        }else if(node.key.compareTo(temp.key) < 0){
            temp.left = node;
        }else {
            temp.right = node;
        }
    }

}
