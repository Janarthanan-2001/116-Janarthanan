import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class FindGrade extends React.Component
{
  constructor(props)
  {
    super(props);
    this.state = {a:'', b:'',result:''}
    this.handlerGrade = this.handlerGrade.bind(this);
  }

  handlerGrade(result)
  {
    var a= document.getElementById("a").value;
    var b=document.getElementById("b").value;
    a=parseInt(a);
    b=parseInt(b);
    result = a + b/2;
     if(result>90 && result<=100)
      {
        return <h1>A grade</h1>
      }
      else if(result>80 && result<=90)
      {
        return <h1>B grade</h1>
      }
      else if(result>70 && result<=80)
      {
        return <h1>c grade</h1>
      }
      else if(result>60 && result<=70)
      {
        return <h1>D grade</h1>
      }
      else{
        return <h2>Your fail</h2>
      }
  }

  render()
  {
    return(
      <>
    
      </>
    );
   
  }
}



ReactDOM.render(
 
    <Cols English="80" Maths ="70" Science="70" />,
 
  document.getElementById('root')
);