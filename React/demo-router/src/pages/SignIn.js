import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import { useNavigate } from 'react-router-dom';




export default function SignIn(){

    const[email,setEmail] = useState("");
    const[password,setPassword]=useState("");
    const[isCorrect,setIsCorrect]=useState("Hidden");
    const navigate = useNavigate();
  
    const handler = (event) =>{
      if(event.target.name ==="email")
      {
        console.log(event.target.value);
        setEmail(event.target.value);
      }else{
        setPassword(event.target.value);
      } 
    }
  
    const submitHandler =(event)=>{
      if(email==="jana@gmail.com" && password==="123")
      {
       console.log("Login successful");
       navigate("/home");
      }else{
        event.preventDefault();
        document.getElementById("label").innerHTML=" <label style='color:red;' >Wrong email or Password</label>"
        setIsCorrect("show");
        console.log(isCorrect)
      }
    
    }
    return(
     <>
         <form>
                <h3>Sign In</h3>

                <div className="form-group">
                    <label>Email address</label>
                    <input type="email" name="email" value={email} className="form-control" onChange={handler} placeholder="Enter email" />
                </div>

                <div className="form-group">
                    <label>Password</label>
                    <input type="password" name="password" value={password} className="form-control" onChange={handler} placeholder="Enter password" />
                </div>

                <button type="submit" onClick={submitHandler} className="btn btn-primary btn-block">Submit</button>
                <p className="forgot-password text-right">
                    Forgot <a href="#">password?</a>
                </p>
            </form>
     </>
    );
  
  }