/**
 * @no 535
 * @name Encode and Decode TinyURL
 */
const db = [];

/**
 * Encodes a URL to a shortened URL.
 *
 * @param {string} longUrl
 * @return {string}
 */
const encode = function(longUrl) {
    db.push(longUrl);
    return db.length - 1;
};

/**
 * Decodes a shortened URL to its original URL.
 *
 * @param {string} shortUrl
 * @return {string}
 */
const decode = function(shortUrl) {
    return db[parseInt(shortUrl)];
};
