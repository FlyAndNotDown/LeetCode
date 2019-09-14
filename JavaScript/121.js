/**
 * @no 121
 * @name Best Time to Buy and Sell Stock
 */
let maxProfit = (prices) => {
    let ans = 0;

    for (let i = 0 ; i < prices.length; i++) {
        let arr = [];
        for (let j = i + 1; j < prices.length; j++)
            arr.push(prices[j] - prices[i]);

        let max = 0;
        for (let j = 0; j < arr.length; j++)
            if (arr[j] > max) max = arr[j];

        ans = max > ans ? max : ans;
    }

    return ans;
};
