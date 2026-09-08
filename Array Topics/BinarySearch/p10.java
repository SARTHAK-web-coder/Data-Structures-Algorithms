import java.util.*;
// #981	Time Based Key-Value Store
// Example 1:

// Input
// ["TimeMap", "set", "get", "get", "set", "get", "get"]
// [[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
// Output
// [null, null, "bar", "bar", null, "bar2", "bar2"]

// Explanation
// TimeMap timeMap = new TimeMap();
// timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
// timeMap.get("foo", 1);         // return "bar"
// timeMap.get("foo", 3);         // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
// timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
// timeMap.get("foo", 4);         // return "bar2"
// timeMap.get("foo", 5);         // return "bar2"

public class p10 {
    // Design a time-based key-value data structure that can store multiple values
    // for the same key at different time stamps and retrieve the key's value at a
    // certain timestamp.

    // Implement the TimeMap class:

    // TimeMap() Initializes the object of the data structure.
    // void set(String key, String value, int timestamp) Stores the key key with the
    // value value at the given time timestamp.
    // String get(String key, int timestamp) Returns a value such that set was
    // called previously, with timestamp_prev <= timestamp. If there are multiple
    // such values, it returns the value associated with the largest timestamp_prev.
    // If there are no values, it returns "".
    public static void main(String[] args) {
        System.out.println("look in leetcode (981 Time Based Key-Value Store)");
    }
}

// Stores timestamp and value together
class pair {
    int timestamp;
    String value;

    // Constructor initializes timestamp and value to access using get function at
    // perticular value

    pair(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}

class TimeMap {
    private HashMap<String, ArrayList<pair>> map;
    // The problem is that ArrayList takes only one type:
    // ArrayList<Type>

    // not:
    // ArrayList<Type1, Type2> ❌

    // So you use TimeValue class for strong and accessing the timestampe and value.
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            map.get(key).add(new pair(timestamp, value));
        } else {
            ArrayList<pair> arr = new ArrayList<>();
            arr.add(new pair(timestamp, value));
            map.put(key, arr);
        }
    }

    public String get(String key, int timestamp) {
        ArrayList<pair> list = map.get(key);
        if (list == null) {
            return "";
        }
        int left = 0;
        int right = list.size() - 1;
        String ans = "";
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid).timestamp == timestamp) {
                ans = list.get(mid).value;
                return ans;
            } else if (list.get(mid).timestamp < timestamp) {
                ans = list.get(mid).value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
/*
 * TimeMap Approach:
 * 
 * 1. Create a pair class to store timestamp and value together.
 * Example: (1, "bar"), (4, "bar2")
 * 
 * 2. Use HashMap:
 * key -> ArrayList<pair>
 * This allows each key to store multiple timestamp-value pairs.
 * 
 * 3. set():
 * - If key already exists, add the new pair to its list.
 * - Otherwise, create a new ArrayList and store it in the map.
 * 
 * 4. get():
 * - First find the list belonging to the given key using map.get(key).
 * - Use binary search because timestamps are stored in sorted order.
 * - Find the largest timestamp that is <= the requested timestamp.
 * - If an exact timestamp is found, return its value.
 * - After binary search, 'right' represents the largest valid timestamp.
 * - If right == -1, no valid timestamp exists, so return "".
 * 
 * Time Complexity:
 * set() -> O(1)
 * get() -> O(log n)
 * 
 * Space Complexity:
 * O(n)
 */