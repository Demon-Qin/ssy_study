// console.log(formatDate());

// /*
//     方法：日期格式化
//     格式要求：今天是：2021年11月26日 00:18:29 星期五
// */
// function formatDate() {
//     var date = new Date();
//     var year = date.getFullYear(); // 年
//     var month = date.getMonth() + 1; // 月
//     var day = date.getDate(); // 日
//     var week = date.getDay(); // 星期几
//     var hour = date.getHours(); // 时
//     hour = hour < 10 ? '0' + hour : hour; // 如果只有一位，则前面补零
//     var minute = date.getMinutes(); // 分
//     minute = minute < 10 ? '0' + minute : minute; // 如果只有一位，则前面补零
//     var second = date.getSeconds(); // 秒
//     second = second < 10 ? '0' + second : second; // 如果只有一位，则前面补零
//     var result = `今天是: ${year}年${month}月${day}日 ${hour}:${minute}:${second} ${weekArr[week]}`;
//     return result;
// }
// 方式一：获取 Date 对象的时间戳（最常用的写法）
const timestamp1 = +new Date();
console.log(timestamp1); // 打印结果举例：1637857395154

// 方式二：获取 Date 对象的时间戳（较常用的写法）
const timestamp2 = new Date().getTime();
console.log(timestamp2); // 打印结果举例：1637857410115

// 方式三：获取 Date 对象的时间戳
const timestamp3 = new Date().valueOf();
console.log(timestamp3); // 打印结果举例：1637857416726

// 方式4：获取 Date 对象的时间戳
const timestamp4 = new Date() * 1;
console.log(timestamp4); // 打印结果举例：1637857424126

// 方式5：获取 Date 对象的时间戳
const timestamp5 = Number(new Date());
console.log(timestamp5); // 打印结果举例：1637857424126