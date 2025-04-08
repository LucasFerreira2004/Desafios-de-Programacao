/**
 * @param {number[]} nums
 * @return {number}
 */
const nums = new Array(100, 4, 200, 1,3,2);

var longestConsecutive = function(nums) {
    let set = new Set(nums);
    let maxSequence = 0;

    for(let num of set){
        if(set.has(num-1)) continue;
        let sequence = 1;
        while(set.has(num + sequence)){
            sequence++;
        }
        if (sequence > maxSequence) maxSequence = sequence;
    }

    return maxSequence;
};

console.log(longestConsecutive(nums));
