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

    const aws = new Array(k);
    for (let i = 0; i<k; i++){
        
    }

    // for (const key in numFrequence.keys){
    //     const frequence = numFrequence.get(key);
        
    // }
   
};

class MaxHeap{
    constructor(num){
        let center=num;
        let left;
        let right;
    }

    set insertNum(num){
        if (num < right) return;
        if (num > right && num < center){
            right = num
        }
        if (num > center && num < left){
            const inter = center;
            center = num;
            left
        }
        if(num > left){
            const inter = center;

        }

        
    }
}


console.log(topKFrequent(nums, k));
