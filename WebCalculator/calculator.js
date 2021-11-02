function calculateResult() {
  let number1 = parseInt(validate(document.getElementById("number1").value));
  let number2 = parseInt(validate(document.getElementById("number2").value));
  let operator = document.getElementById("operator").value;
  alert("Calculated result is: " + operate(number1, number2, operator));
}

function operate(number1, number2, operator) {
  if (operator == "add") {
    return number1 + number2;
  } else if (operator == "subtract") {
    return number1 - number2;
  } else if (operator == "multiply") {
    return number1 * number2;
  } else if (operator == "divide") {
    if (number2 == 0) {
      alert("Cannot divide by zero");
    }
    return number1 / number2;
  }
}

function validate(value) {
  if (value == null || value == "") {
    alert("Required Field");
    return 0;
  } else if (isNaN(value)) {
    alert("Must be a Number Field");
    return 0;
  } else return value;
}

// function validate(number1, number2) {
//   if (number1 == null && number2 == null) {
//     alert("Required Field");
//     return 0;
//   } else if (isNaN(value)) {
//     alert("Invalid Field");
//     return 0;
//   } else if (number2 == 0) {
//     alert("Cannot divide by zero");
//   } else return number1, number2;
// }
