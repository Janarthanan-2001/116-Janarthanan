import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class Toggleimg extends React.Component
{
  constructor()
  {
    super();
    this.toggleHandler = this.toggleHandler.bind(this);
    this.image = true;
  }
  toggleHandler()
  {
    this.image = !this.image;
    console.log(this.image)
    if(this.image)
    {
      document.getElementById("img").innerHTML="<img src ='/student/public/nat.png ></img>";
      console.log(this.image);
    }
    else
    {
      document.getElementById("img").innerHTML= "<img src='/student/public/nat1.png' ></img>";
      console.log(this.image);
    }
  }
  render()
  {
    return(
      <>
        <div id='img'></div>
        <div>
          <button onClick={this.toggleHandler}>Button</button>
        </div>
      </>
    );
  }
}
ReactDOM.render(<Toggleimg  />  , document.getElementById('root'));
