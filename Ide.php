<!DOCTYPE html>
<html>
<head>
  <title>Calculator</title>
</head>
<body>
  <input id="display" type="text"><br>
  <button onclick="buttonClick('7')">7</button>
  <button onclick="buttonClick('8')">8</button>
  <button onclick="buttonClick('9')">9</button>
  <button onclick="buttonClick('+')">+</button><br>
  <button onclick="buttonClick('4')">4</button>
  <button onclick="buttonClick('5')">5</button>
  <button onclick="buttonClick('6')">6</button>
  <button onclick="buttonClick('-')">-</button><br>
  <button onclick="buttonClick('1')">1</button>
  <button onclick="buttonClick('2')">2</button>
  <button onclick="buttonClick('3')">3</button>
  <button onclick="buttonClick('*')">*</button><br>
  <button onclick="buttonClick('0')">0</button>
  <button onclick="buttonClick('.')">.</button>
  <button onclick="buttonClick('=')">=</button>
  <button onclick="buttonClick('/')">/</button><br>
  <button onclick="clearCalculator()">Clear</button>
  <script src="calculator.js"></script>
</body>
</html>
