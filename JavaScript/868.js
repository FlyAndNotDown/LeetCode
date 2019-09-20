/**
 * @no 868
 * @name Binary Gap
 */
const binaryGap = function(n) {
    const binary = n.toString(2);
    let result = 0, last = null;
    for (let i = 0; i < binary.length; i++) {
        if (binary[i] == '1') {
            if (last !== null) {
                result = Math.max(result, i - last);
            }
            last = i;
        }
    }
    return result;
};

binaryGap(22);