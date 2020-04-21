import java.util.Iterator;

public abstract class AbstractBinaryTree<T> extends AbstractTree<T>
                                            implements BinaryTree<T>
{

    /*
    public TreeNode<T> sibling(TreeNode<T> currentNode)
    {
        TreeNode<T> parent = parent(currentNode);
        if (parent==null) {
            return null;
        }else{
            if (parent.getLeft()==currentNode){
                return parent.getRight();
            } else {
                return parent.getLeft();
            }
        }

    }
    */
    //add the first Element
    abstract public TreeNode<T> addRoot(T element);
    //add Left
    abstract public TreeNode<T> addLeft(TreeNode<T> parent, T element);
    //add Right
    abstract public TreeNode<T> addRight(TreeNode<T> parent, T element);
    //set new Element
    abstract public T set(TreeNode<T> node, T newElement);
    //attach a subtree
    abstract public void attach(TreeNode<T> leaf, LinkedBinaryTree<T> leftSubTree, LinkedBinaryTree<T> rightSubTree);
    //remove
    abstract public T remove(TreeNode<T> node);




}

