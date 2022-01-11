import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function MyCalculatorWithHook(props){


  const[first,setFirst] = useState('');
  const[second,setSecond] = useState('');
  const[result,setResult] = useState(0);

  const SetFirstValue = (event) =>{
    setFirst(event.target.value);
  }
  const SetSeconfValue = (event) =>{
    setSecond(event.target.value);
  }

  const handleAddResult = () =>{
    
    setResult(parseInt(first) + parseInt(second));
  }
  const handleSubResult = () =>{
    setResult(parseInt(first) - parseInt(second));
  }
  const handleMulResult = () =>{
    setResult(parseInt(first) * parseInt(second));
  }
  const handleDivResult = () =>{
    setResult(parseInt(first) / parseInt(second));
  }

  return(
    <>
      <p> Answer of {first} and {second} = {result}</p>

    <table>
      <tr>
        <label>Enter value : </label>
        <input  id="a" type="text" onChange={SetFirstValue} /></tr>
      <tr> 
      <label>Enter value : </label>
       <input  id="b" type="text"  onChange={SetSeconfValue}/></tr>
    </table>
    
    <div> 
      <button onClick={handleAddResult}>Addition</button>
    </div>
    <div>
     <button onClick={handleSubResult}>Subtraction</button>
    </div> 
    <div>
     <button onClick={handleMulResult}>Multiplication</button>
    </div>
    <div>
     <button onClick={handleDivResult}>Divition</button>
    </div>
   </>
  );

}

ReactDOM.render(  
  <MyCalculatorWithHook  /> ,
document.getElementById('root')
);