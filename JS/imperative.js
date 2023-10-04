const numbers = [1,2,3,4,5,6,7,8,9,0]
var result = []

for(let i = 0; i<numbers.length; i++){
    if(numbers[i] > 5){
        result.push(numbers[i])
    }
}
console.log(result);
console.log(numbers);