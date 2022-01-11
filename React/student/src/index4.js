import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class App extends React.Component{

  constructor(props){
    super(props);
    this.a = parseInt("30");
    this.b = parseInt("20");
    // this.a="30";
    // this.b="40";
  
  }
  render(){
    
    return <>
    <h1>Addition = {this.a + this.b}</h1>
    <h1>Subtraction = {this.a - this.b}</h1>
    <h1>Multiplication = {this.a * this.b}</h1>
    <h1>Division = {this.a / this.b}</h1>
    
    </>

  }

}
ReactDOM.render(<App  />  , document.getElementById('root'));
