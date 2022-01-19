
const Data = {
    questions : [
        {
            questionNo:'1',
            questionText: 'Which of the following is the correct name of React.js?',
			answerOptions: [
				{ answerText: 'a) React', isCorrect: false },
				{ answerText: 'b) React.js', isCorrect: false },
				{ answerText: 'c) ReactJS', isCorrect: false },
				{ answerText: 'd) All of the above', isCorrect: true },
			],
            explanation:'React.js is a free, open-source front-end JavaScript library used for building user interfaces or UI components. It is also known as React or ReactJS.'
        },
        {
            questionNo:'2',
            questionText: 'What of the following is used in React.js to increase performance?',
			answerOptions: [
				{ answerText: 'a) Original DOM', isCorrect: false },
				{ answerText: 'b) Virtual DOM', isCorrect: true },
				{ answerText: 'c) Both A and B.', isCorrect: false },
				{ answerText: 'd) None of the above.', isCorrect: false },
			],
            explanation:'Virtual DOM is used in React.js to increase performance.'
        },
        {
            questionNo:'3',
            questionText: 'Which of the following acts as the input of a class-based component?',
			answerOptions: [
				{ answerText: 'a) Class', isCorrect: false },
				{ answerText: 'b) Factory', isCorrect: false },
				{ answerText: 'c) Render', isCorrect: false },
				{ answerText: 'd) Props', isCorrect: true },
			],
            explanation:'"props" is the correct answer.'
        },
        {
            questionNo:'4',
            questionText: 'How many numbers of elements a valid react component can return?',
			answerOptions: [
				{ answerText: 'a) 1', isCorrect: true },
				{ answerText: 'b) 2', isCorrect: false },
				{ answerText: 'c) 4', isCorrect: false },
				{ answerText: 'd) 5', isCorrect: false },
			],
            explanation:'In react component, we can return only one element.'
        },
        {
            questionNo:'5',
            questionText: 'Does React.js create a VIRTUAL DOM in the memory?',
			answerOptions: [
				{ answerText: 'a) TRUE', isCorrect: true },
				{ answerText: 'b) FALSE', isCorrect: false },
				{ answerText: 'c) Can be true or false', isCorrect: false },
				{ answerText: 'd) Cannot say', isCorrect: false },
			],
            explanation:' A is the correct option as React.js creates a VIRTUAL DOM in the memory.'
        }
    ]
}

export default Data;
