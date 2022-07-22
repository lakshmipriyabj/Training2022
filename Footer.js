import React from 'react'
import { AddDriver } from './AddDriver';


export const Footer = ({designer,email}) => {
    const {mail,text} = email;
  return (
    <div>
       <hr></hr>
       <p>Designed By {designer}</p>
       <p><a href={'mailTo:'+mail}>{text}</a></p>
       <AddDriver></AddDriver>
    </div>
  )
}
