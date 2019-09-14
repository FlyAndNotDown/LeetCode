/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */

/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var levelOrderBottom = function(root) {
    let result = [];
    iteration(root, 1, result);
    return result.reverse();
};

/**
 * @param {TreeNode} root 
 * @param {number} level 
 * @param {number[][]} result 
 */
var iteration = function(root, level, result) {
    if (!root) return;
    
    if (level > result.length) {
        result.push([]);
    }

    result[level - 1].push(root.val);
    iteration(root.left, level + 1, result);
    iteration(root.right, level + 1, result);
};