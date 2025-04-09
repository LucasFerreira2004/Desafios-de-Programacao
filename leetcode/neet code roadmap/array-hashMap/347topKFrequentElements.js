/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */

const nums = new Array(1,1,1,2,2,3);
const k = 2;

var topKFrequent = function(nums, k) {
    const numFrequence = new Map();
    for(const num in nums){
        if(!numFrequence.has(num)){
            numFrequence.set(num, 1);
            continue;
        }
        let frequence = numFrequence.get(num);
        numFrequence.set(num, frequence++);
    }

    for (const value in numFrequence.keys){
        
    }
};

console.log(topKFrequent(nums, k));
