import React, { useState } from 'react';

import Data from './Data/Data';

export default function App(){

  const {questions} = Data;

  const [currentQuestion, setCurrentQuestion] = useState(0);

  const [showScore, setShowScore] = useState(false);

  const[score, setScore] = useState(0);

  const handleAnswerOptionClick =  (isCorrect) => {
    if(isCorrect)
    {
      setScore(score + 1);
    }
    // const nextQuestion = currectQuestion + 1;
    // if(nextQuestion < questions.length)
    // {
    //   setCurrectQuestion(nextQuestion);
    // } 
    // else {
    //   setShowScore(true);
    // }
  };

  const habdleNectQuestionButton = () => {
    const nextQuestion = currentQuestion + 1;
    if(nextQuestion < questions.length)
    {
      setCurrentQuestion(nextQuestion);
    }
    else{
      setShowScore(true);
    }
  };
  
  // const finishHandler = () => {
  //   if (currentQuestion === Data.length - 1) {
  //   setFinish(true);
  //   }
  //   };

  const startOver = () => {
    setCurrentQuestion(0);
    setScore(0);
    };

  return(
    <div>   
      <h1 className='head'>Welcome to Quiz program..!!</h1>
      <div className='app'>
        {showScore ? (
          <div className='score-section'>
            
              <h4>Your scored :{score} Out of : {questions.length}</h4>
           
            <div className='restart-section'>
            <button onClick={() => startOver()}>restart</button>
            </div>
          </div>
        ) : (
          <>
            <div className='question-section'>
              
              <div className='question-text'>
                {questions[currentQuestion].questionNo}.
                {questions[currentQuestion].questionText}
                <div className='next-question'>
                  <button onClick={ () => habdleNectQuestionButton()}>Next</button>
                </div>
              </div>
            </div>
            <div className='answer-section'>
              {questions[currentQuestion].answerOptions.map((answerOption) => (
                <button onClick={ () => handleAnswerOptionClick(answerOption.isCorrect)}>
                  {answerOption.answerText}
                </button>
              ))}
            </div>
          
          </>
          
        )}
        
      </div>
    </div>
  );

}