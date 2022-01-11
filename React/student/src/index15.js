import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';


//working with forms

class StudentForm extends React.Component{
  constructor(props){
    super(props);
    this.state = {fname:'',lname:'',Email:'',pwd:'',DOB:'',
                  phNumber:'',age:'',gender:'',cuntry:'',};
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event){
    //this.setState({value: event.target.value});
    const target = event.target;
    const value = target.name.value ;
    const name = target.name;

    console.log(name +" "+ value);
    this.setState({[name]:value});
  }

  handleSubmit(event){
    alert('Are you sure you want to submit your country? ');
    event.preventDefault();
  }


  render(){
    return(
      <div className='form-group'>
        <form onSubmit={this.handleSubmit}>
          <h3>Sign Up</h3>
          <div className='form-group'>
            <label>First Name </label>
            <input name="fname" type="text" value={this.state.fname} onChange={this.handleChange} placeholder="First name"/>
          </div>
          
          
          <div className='form-group'>
            <label>Last Name  </label>
            <input name="lname" type="text" value={this.state.lname} onChange={this.handleChange} placeholder="Last name"/>
          </div>
          
          
          <div className='form-group'>
            <label>Email</label>
            <input name='Email'  type="email" value={this.state.Email} onChange={this.handleChange} placeholder="Email"/>
          </div>
            
          
          <div className='form-group'>
            <label>Password </label>
            <input name='pwd'  type="password" value={this.state.pwd} onChange={this.handleChange} placeholder="passwprd"/>
          </div>
         
          
          <div className='form-group'>
            <label>Date Of Birth </label>
            <input name='DOB'  type="date" value={this.state.DOB} onChange={this.handleChange} placeholder="Date og birth"/> 
          </div>
          
          
          <div className='form-group'>
            <label> Phone number </label>
            <input name='phNumber'  type="number" value={this.state.phNumber} onChange={this.handleChange} placeholder="phone number"/>
          </div>
          
          
          <div className='form-group'>
            <label>Age </label>
            <input name='age'  type="number" value={this.state.age} onChange={this.handleChange} placeholder="age"/>
          </div>
          
          
          <div className='form-group'>
            <label>Gender </label> 
            <select name='gender' value={this.state.gender} onChange={this.handleChange} >
              <option value='Male'>MALE</option>
              <option value='Female'>FEMALE</option>
              <option value='Others'>OTHERS</option>
            </select>
          </div>
          
          
          <div className='form-group'>
            <label>Please select your country </label>
            <select name='cuntry' value={this.state.cuntry} onChange={this.handleChange} >
              <option value='USA'>USA</option>
              <option value='INDIA'>INDIA</option>
              <option value='UK'>UK</option>
              <option value='BALI'>BALI</option>
            </select>
          </div>
         
         <button type="submit" className="btn btn-primary btn-block">Sign Up</button>
                <p className="forgot-password text-right">
                    Already registered <a href="#">sign in?</a>
                </p>
        </form>
      </div>
    );
  }
}

ReactDOM.render(  
  <StudentForm /> ,
document.getElementById('root')
);