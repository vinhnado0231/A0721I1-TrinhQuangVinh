function fibonacci(n: number): number {
    if (n === 1 || n === 2)
    {
        return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

let n=5;
let sum=0;
for(let i=0;i<Number(n);i++){
    sum+=fibonacci(i+1);
}
console.log(sum);