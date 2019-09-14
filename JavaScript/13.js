/**
 * @no 13
 * @name Roman to Integer
 */
var romanToInt = function(s) {
    let i = 0, result = 0, add = 1;

    while (i < s.length) {
        add = 1;
        switch (s[i]) {
            case 'M':
                result += 1000; break;
            case 'D':
                result += 500; break;
            case 'L':
                result += 50; break;
            case 'V':
                result += 5; break;
            case 'C':
                switch (s[i + 1]) {
                    case 'M':
                        result += 900; add = 2; break;
                    case 'D':
                        result += 400; add = 2; break;
                    default:
                        result += 100; break;
                }
                break;
            case 'X':
                switch (s[i + 1]) {
                    case 'C':
                        result += 90; add = 2; break;
                    case 'L':
                        result += 40; add = 2; break;
                    default:
                        result += 10; break;
                }
                break;
            case 'I':
                switch (s[i + 1]) {
                    case 'X':
                        result += 9; add = 2; break;
                    case 'V':
                        result += 4; add = 2; break;
                    default:
                        result += 1; break;
                }
                break;
            default:
                break;
        }
        i += add;
    }

    return result;
};

console.log(romanToInt('MCMXCIV'));