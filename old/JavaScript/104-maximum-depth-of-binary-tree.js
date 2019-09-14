/**
 * @param {TreeNode} node
 * @return {number}
 */
let maxDepth = (node) => node ? Math.max(maxDepth(node.left), maxDepth(node.right)) + 1 : 0;
