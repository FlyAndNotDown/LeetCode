/**
 * @no 104
 * @name Maximum Depth of Binary Tree
 */
let maxDepth = (node) => node ? Math.max(maxDepth(node.left), maxDepth(node.right)) + 1 : 0;