/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const filteredArray=arr.filter((ele,index)=>fn(ele,index));
    return filteredArray;
};