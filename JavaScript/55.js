/**
 * @no 55
 * @name Jump Game
 */
let canJump = (steps) => {
    let ok = new Int8Array(steps.length);
    for (let i = steps.length - 1; i >= 0; i--)
        judgeCanJump(steps, ok, i);
    return ok[0] === 1;
};

let judgeCanJump = (steps, ok, i) => {
    if (steps.length - 1 === i) ok[i] = 1;
    else {
        let can = false;
        for (let j = 0; j < i + 1 + steps[i] && j < steps.length; j++)
            if (ok[j] === 1) can = true;
        if (can) ok[i] = 1;
    }
};
