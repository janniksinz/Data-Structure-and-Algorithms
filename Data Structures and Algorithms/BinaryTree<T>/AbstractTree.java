import java.util.Iterator;

public abstract class AbstractTree<T> implements TreeADT<T>
{

    int i  = 1000000000;
    double d = 5.7;
    long s = 1000000000;

    @Override
    public int numChildren(TreeNode<T> node) {      //how?
        //while
        return 0;
    }

    @Override //done - has children
    public boolean isInternal(TreeNode<T> node) {return numChildren(node) == 0;}

    @Override //done - has no children
    public boolean isExternal(TreeNode<T> node) {return numChildren(node) != 0;}

    @Override //done - no parent
    public boolean isRoot(TreeNode<T> node) {return node.getParent() == null;}


    //done
    public boolean isEmpty() {
        return size()==0;
    }

    //Abstract
    abstract public Iterator<T> iterator();

    abstract public Iterable<TreeNode<T>> getNode();
    abstract public Iterable<TreeNode<T>> getNodes();
    abstract public Iterable<TreeNode<T>> getChildren(TreeNode<T> node);

    abstract public int size();

    abstract public TreeNode<T> root();
    /*// solange parent vorhanden, getParent
    while(node.getParent()!= null){
        node=node.getParent();
    }
    // return node without parent
    return node;
    */
    @Override
    public TreeNode<T> parent(TreeNode<T> node)
    {
        // if parent -> return parent
        if (node.getParent()!= null){
            return node.getParent();
        } else {return null;}
    }


}
