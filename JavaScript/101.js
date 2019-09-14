/**
 * @no 101
 * @name Symmetric Tree
 */
let isSymmetric = (root) => {
    if (root)
        return !root.left && !root.right ? true : root.left && root.right ? recursion(root.left, root.right) : false;
    return true;
};

let recursion = (node1, node2) => {
    if (!node1 && !node2)
        return true;
    if (node1 && node2 && node1.val === node2.val)
        return recursion(node1.left, node2.right) && recursion(node1.right, node2.left);
    return false;
};
