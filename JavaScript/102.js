/**
 * @no 102
 * @name Binary Tree Level Order Traversal
 */
let levelOrder = (root) => {
    let ans = [];
    recursion(root, ans, 0);
    return ans;
};

let recursion = (node, ans, depth) => {
    if (node) {
        if (depth === ans.length) ans.push([]);
        ans[depth].push(node.val);
        if (node.left) recursion(node.left, ans, depth + 1);
        if (node.right) recursion(node.right, ans, depth + 1);
    }
};
