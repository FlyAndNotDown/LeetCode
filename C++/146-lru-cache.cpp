class LRUCache {
private:
    int capacity;
    map<int, int> hashMap;
    list<int> keyList;
public:
    explicit LRUCache(int capacity) {
        this->capacity = capacity;
    }

    int get(int key) {
        if (this->hashMap.find(key) != this->hashMap.end()) {
            this->keyList.remove(key);
            this->keyList.push_front(key);
            return this->hashMap[key];
        } else return -1;
    }

    void put(int key, int value) {
        if (this->hashMap.find(key) != this->hashMap.end()) {
            this->keyList.remove(key);
            this->keyList.push_front(key);
            this->hashMap[key] = value;
        } else {
            if (this->keyList.size() < this->capacity) {
                this->keyList.push_front(key);
                this->hashMap[key] = value;
            } else {
                int backKey = this->keyList.back();
                this->keyList.pop_back();
                this->keyList.push_front(key);
                this->hashMap.erase(backKey);
                this->hashMap[key] = value;
            }
        }
    }
};
