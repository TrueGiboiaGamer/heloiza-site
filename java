function checkAnswers() {
    const correctAnswers = {
        q1: 'c',
        q2: 'b',
        q3: 'c'
    };

    let score = 0;
    const form = document.getElementById('quiz-form');
    const resultDiv = document.getElementById('result');

    for (let question in correctAnswers) {
        const selectedOption = form.querySelector(`input[name=${question}]:checked`);
        if (selectedOption && selectedOption.value === correctAnswers[question]) {
            score++;
        }
    }

    resultDiv.textContent = `Você acertou ${score} de 3 perguntas.`;
}