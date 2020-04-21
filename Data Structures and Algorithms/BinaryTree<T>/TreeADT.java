import java.util.Iterator;

public interface TreeADT<T> extends Iterable<T>
{

    TreeNode<T> root();
    TreeNode<T> parent(TreeNode<T> node);

    int size();
    int numChildren(TreeNode<T> node);

    boolean isInternal(TreeNode<T> node);
    boolean isExternal(TreeNode<T> node);
    boolean isRoot(TreeNode<T> node);
    boolean isEmpty(TreeNode<T> node);

    //Iterable
    Iterator<T> iterator();
    Iterable<TreeNode<T>> getNodes();
    Iterable<TreeNode<T>> getChildren(TreeNode<T> node);

}
