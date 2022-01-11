import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class Calculator extends React.Component
{
  constructor()
  {
    super();
    this.handlerCalculator = this.handlerCalculator.bind(this);
    
    this.state={a:"",b:"",cals:'',ans:""}
  }
  handlerCalculator(cals)
  {
    var ans;
    var a= document.getElementById("a").value;
    var b=document.getElementById("b").value;
    a=parseInt(a);
    b=parseInt(b);
    switch(cals)
    {
      case "add":
        ans=a+b;
         break;
      case "sub":
        ans=a-b;
        break;
      case "mult":
        ans=a*b;
        break;
      case "div":
        ans=a/b;
        break;
      default:
        return;
    }
   this.setState({
      a:a,
      b:b,
      ans:ans,
      cals:cals
   });
  }  

  render()
  {
    return(
    <>
   <table>
     <tr>
   <h2>Ans : {this.state.a} {this.state.cals} {this.state.b} = {this.state.ans} </h2>
   </tr>
   <tr>
     <label>Enter value : </label>
    <input  id="a" type="text" defaultValue={this.state.a}/></tr>
   <tr> 
   <label>Enter value : </label>
   <input  id="b" type="text" defaultValue={this.state.b}/></tr>
   </table>
   <button id="inr" onClick={()=>this.handlerCalculator("add")} >Add</button><br /><br />
   <button id="inr" onClick={()=>this.handlerCalculator("sub")} >Sub</button><br /><br />
   <button id="inr" onClick={()=>this.handlerCalculator("mult")} >Mult</button><br /><br />
   <button id="inr" onClick={()=>this.handlerCalculator("div")} >Div</button>
   </>
    )
  }
}
ReactDOM.render(
  <Calculator />,
  document.getElementById("root")
);