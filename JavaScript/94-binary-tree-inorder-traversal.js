/**
 * @param {TreeNode} root
 * @return {number[]}
 */
let inorderTraversal = (root) => {
    let ans = [];
    recursion(root, ans);
    return ans;
};

let recursion = (node, ans) => {
    if (node) {
        if (node.left) recursion(node.left, ans);
        ans.push(node.val);
        if (node.right) recursion(node.right, ans);
    }
};
