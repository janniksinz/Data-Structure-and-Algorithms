public interface BinaryTree<T> extends TreeADT<T>
{

    //get the side nodes
    TreeNode<T> left (TreeNode<T> node);
    TreeNode<T> right (TreeNode<T> node);

    //get the other side back
    TreeNode<T> sibling (TreeNode<T> node);

}
