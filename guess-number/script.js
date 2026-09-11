const form = document.querySelector("#guess-form");
const input = document.querySelector("#guess");
const message = document.querySelector("#message");
const attemptsOutput = document.querySelector("#attempts");
const restartButton = document.querySelector("#restart");

let target = Math.floor(Math.random() * 10);
let attempts = 0;

form.addEventListener("submit", (event) => {
  event.preventDefault();

  const number = Number.parseInt(input.value, 10);

  if (Number.isNaN(number) || number < 0 || number > 9) {
    showMessage("Введи ціле число від 0 до 9.", "error");
    input.focus();
    return;
  }

  attempts += 1;
  attemptsOutput.textContent = attempts;

  if (number < target) {
    showMessage("Загадане число більше!", "hint");
  } else if (number > target) {
    showMessage("Загадане число менше!", "hint");
  } else {
    showMessage(`Правильно! Це число ${target}.`, "success");
    input.disabled = true;
    form.querySelector("button").disabled = true;
    restartButton.hidden = false;
  }

  input.value = "";
  input.focus();
});

restartButton.addEventListener("click", () => {
  target = Math.floor(Math.random() * 10);
  attempts = 0;
  attemptsOutput.textContent = attempts;
  input.disabled = false;
  form.querySelector("button").disabled = false;
  restartButton.hidden = true;
  showMessage("Введи число та натисни кнопку.");
  input.focus();
});

function showMessage(text, type = "") {
  message.textContent = text;
  message.className = type ? `message message--${type}` : "message";
}
