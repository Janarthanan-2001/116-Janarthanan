import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Addition(props){
  let result= parseInt(props.a) + parseInt(props.b);
  return <h1>Addition of {props.a} and {props.b} is {result}</h1>
}

ReactDOM.render(
 
    <Addition a="10" b="20"/>,
 
  document.getElementById('root')
);

