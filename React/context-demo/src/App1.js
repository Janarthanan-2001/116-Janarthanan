import './App.css';
import React from 'react';

//creating context using contextAPI

const ThemeContext = React.createContext('white');


class App extends React.Component{
  render(){
    //return <Toolbar theme="black" />
    return (<ThemeContext.Provider value='black'>
      <Toolbar />
    </ThemeContext.Provider>
    );
  }
}

function Toolbar(props){
  return(
    <div>
      <ThemedButton />
    </div>
  );
}

class ThemedButton extends React.Component{
  static contextType = ThemeContext;
  render(){
    return <button style={{backgroundColor:this.context, color:"white",padding:"15px 30px"}}>ClickMe</button>
  }
}


export default App;