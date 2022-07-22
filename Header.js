import React from 'react'
import { NavBar } from './NavBar';
import { Image } from './Image';
import logo from './images/taxicon.jpeg';
const links=[
            {"link":'/home','text':'Home-Tour'},
            {"link":'/about','text':'About Us'},
            {"link":'/client','text':'Client'}
]
export const Header = ({heading}) => {
  return (
    <header>
    <div style={{height:'600px'}}>
      <div className='col-mid-6'>
        <h1>{heading}</h1>
        <Image imgRef={logo} altText={'company logo'}></Image>
        </div>
        <div className='col-mid-6'>
        <NavBar data={links}></NavBar>
        </div>
    </div>
    </header>
  )
}
// export const Header = (props) => {
//   return (
//     <div>
//         <h1>{props.heading}</h1>
//         {/* <h1>Lakshmi Taxi Service</h1> */}
//         <NavBar></NavBar>

//     </div>
//   )


