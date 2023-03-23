// Define variables for the calculator
let num1 = 0;
let num2 = 0;
let operator = "";

// Function to perform arithmetic operations
function calculate() {
  let result = 0;
  switch(operator) {
    case "+":
      result = num1 + num2;
      break;
    case "-":
      result = num1 - num2;
      break;
    case "*":
      result = num1 * num2;
      break;
    case "/":
      result = num1 / num2;
      break;
    default:
      result = 0;
  }
  return result;
}

// Function to handle button clicks
function buttonClick(value) {
  if (isNaN(value)) {
    // If value is an operator
    if (value === "=") {
      // Calculate result and display it
      num2 = parseFloat(document.getElementById("display").value);
      document.getElementById("display").value = calculate();
      num1 = 0;
      num2 = 0;
      operator = "";
    } else {
      // Set operator and save first number
      operator = value;
      num1 = parseFloat(document.getElementById("display").value);
      document.getElementById("display").value = "";
    }
  } else {
    // If value is a number, add it to the display
    document.getElementById("display").value += value;
  }
}

// Function to clear the calculator
function clearCalculator() {
  num1 = 0;
  num2 = 0;
  operator = "";
  document.getElementById("display").value = "";
}
