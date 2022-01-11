import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Calculator(props){
  let add= parseInt(props.a) + parseInt(props.b);
  let sub= parseInt(props.a) - parseInt(props.b);
  let mul= parseInt(props.a) * parseInt(props.b);
  let div= parseInt(props.a) / parseInt(props.b);
  return <h1>Addition of {props.a} and {props.b} is {add}, subtraction is {sub}, multiplication is {mul}, division is {div}</h1>
  
}
ReactDOM.render(
 
    <Calculator a="10" b="20"/>,
 
  document.getElementById('root')
);

