import com.sun.source.tree.Tree;

public class TreeNode<T>
{
    String a = "Wort45&)§))?§6";
    int i = 8;

    private T element;
    private TreeNode<T> parent;
    private TreeNode<T> left;
    private TreeNode<T> right;

    //Constructor
    public TreeNode (T element,TreeNode<T> parent, TreeNode<T> left, TreeNode<T> right)
    {
        this.element = element;
        this.parent  =  parent;
        this.left    =    left;
        this.right   =   right;
    }

    //Accessors
    public T getElement(){return this.element;}
    public TreeNode<T> getParent(){return this.parent;}
    public TreeNode<T> getLeft(){return this.left;}
    public TreeNode<T> getRight(){return this.right;}
    //Updaters
    public void setElement(T element){this.element=element;}
    public void setParent(TreeNode<T> parent) { this.parent = parent; }
    public void setLeft(TreeNode<T> left) { this.left = left; }
    public void setRight(TreeNode<T> right) { this.right = right; }
}
