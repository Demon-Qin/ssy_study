// function 函数名([形参1,形参2...形参N]){  // 备注：语法中的中括号，表示“可选”
// 	语句...
// }
function fun1(a, b) {
    return a + b
}
console.log(fun1(3, 4))

// var 变量名  = function([形参1,形参2...形参N]){
// 	语句....
// }
//举例

var fun2 = function () {
    console.log("我是匿名函数中封装的代码")
}
fun2()

//   var 变量名/函数名  = new Function('形参1', '形参2', '函数体');
var fun3 = new Function('a', 'b', 'console.log("我是函数内部的内容");  console.log(a + b);');
fun3(1, 2); // 调用函数，打印结果为3


function fn1() {
    console.log('我是函数体里面的内容1');
}

function fn2() {
    console.log('我是函数体里面的内容2');
}

fn1(); // 调用函数

fn2.call(); // 调用函数

//通过对象的方法来调用
var obj = {
    a: '松山院',
    fn2: function () {
        console.log('好好学习，天天向上!')
    },
}

obj.fn2() // 调用函数

//立即执行函数
(function () {
    console.log('我是立即执行函数');
})();

//通过构造函数来调用
function Fun3() {
    console.log('好好学习，天天向上!')
}

new Fun3();

function getMaxValue() {
    var max = arguments[0];
    // 通过 arguments 遍历实参
    for (var i = 0; i < arguments.length; i++) {
        if (max < arguments[i]) {
            max = arguments[i];
        }
    }
    return max;
}

console.log(getMaxValue(1, 3, 7, 5)); //输出结果：7