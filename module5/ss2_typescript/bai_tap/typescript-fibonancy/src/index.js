function fibonacci(n) {
    if (n === 1 || n === 2) {
        return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
var n = 10;
var sum = 0;
for (var i = 0; i < Number(n); i++) {
    sum += fibonacci(i + 1);
}
console.log(sum);
