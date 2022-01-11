import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Cols(props){

  let x=parseInt(props.English);
  let y=parseInt(props.Maths);
  let z=parseInt(props.Science);
  let rst = (x + y + z)/3;

  if(rst>90 && rst<=100)
  {
    return <h1>A grade</h1>
  }
  else if(rst>80 && rst<=90)
  {
    return <h1>B grade</h1>
  }
  else if(rst>70 && rst<=80)
  {
    return <h1>c grade</h1>
  }
  else if(rst>60 && rst<=70)
  {
    return <h1>D grade</h1>
  }
  else{
    return <h2>Your fail</h2>
  }
}
ReactDOM.render(
 
    <Cols English="80" Maths ="70" Science="70" />,
 
  document.getElementById('root')
);

