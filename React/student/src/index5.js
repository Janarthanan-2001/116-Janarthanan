import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//class based components in React
//working with handlers

class Cals extends React.Component{

  constructor(props){
    super(props);  
    
    this.state = {a : parseInt(props.a), b : parseInt(props.b), result:0};    

    this.myHandler = this.myHandler.bind(this);
    this.myHandler1 = this.myHandler1.bind(this);
    this.myHandler2 = this.myHandler2.bind(this);
    this.myHandler3 = this.myHandler3.bind(this);
  }
    
  myHandler(){
    //how do we change the state
    //this.state.isOn = false;
    // this.setState( i => (
    //   {isOn: !i.isOn}
    // ));
    //let rst=this.a + this.b;
    this.setState( i => (
     {result:i.a + i.b }
     
    ));

  }
  myHandler1(){
    this.setState( i => (
      {result : i.a - i.b }
      
     ));
  }
  myHandler2(){
    this.setState( i => (
      {result : i.a * i.b }
      
     ));
     
  }
  myHandler3(){
    this.setState( i => (
      {result : i.a / i.b }
      
     ));
     
  }

  render(){
   

    return <>
    
    <h1>The Results is : {this.state.result}</h1>
      <button onClick={this.myHandler} > Add</button>
      <button onClick={this.myHandler1} >  sub</button>
      <button onClick={this.myHandler2} >  mul</button>
      <button onClick={this.myHandler3} >  div</button>
    </>
  }
}
ReactDOM.render(<Cals  a="20" b="10"  />  , document.getElementById('root'));