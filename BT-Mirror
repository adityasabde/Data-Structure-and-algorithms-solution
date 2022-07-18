static node mirrorify(node root)
{
    if (root == null)
    {
        return null;
         
    }
 
    // Create new mirror node from original tree node
    node mirror = createNode(root.val);
    mirror.right = mirrorify(root.left);
    mirror.left = mirrorify(root.right);
    return mirror;
}
