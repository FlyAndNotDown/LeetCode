/**
 * @no 107
 * @name Binary Tree Level Order Traversal II
 */
var levelOrderBottom = function(root) {
    let result = [];
    iteration(root, 1, result);
    return result.reverse();
};

var iteration = function(root, level, result) {
    if (!root) return;
    
    if (level > result.length) {
        result.push([]);
    }

    result[level - 1].push(root.val);
    iteration(root.left, level + 1, result);
    iteration(root.right, level + 1, result);
};