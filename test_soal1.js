// test number 1
console.log("Soal Nomor 1");
const numbers = [1, 2, 4, 3, 10, 11, 20, 5, 100, 200];

for (let i = 0; i < numbers.length; i++) {
  if (numbers[i] === 5) console.log("Fizz");
  if (numbers[i] === 11) console.log("Buzz");
  if (numbers[i] === 5 && numbers[i] === 11) console.log("FizzBuzz");
}
console.log("==========================");

// test number 2
console.log("Soal Nomor 2");
const data = [1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1];

for (let i = 0; i < data.length; i++) {
  if (typeof data[i] === "string") {
    console.log(`index ke ${i} adalah string dengan data ${data[i]}`);
  }

  if (typeof data[i] === "number" && data[i] > 0) {
    console.log(`index ke ${i} adalah integer dengan data ${data[i]}`);
  }

  if (data[i] < 0) {
    console.log("Tidak bisa di validasi sistem");
  }
}
