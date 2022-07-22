import React from 'react'

export const Review = (props) => {
  return (
    <div>
        <p>Like Lakshmi Taxi service</p>
        <p><button onClick={props.handleClick} className='btn btn-info'>+</button></p>
        <p>Likes:{props.count}</p>
        {/* <p>DisLikes:{props.count}</p> */}
        <p>need to do some changes</p>
        <p><button onClick={props.handleDisClick} className='btn btn-danger'>-</button></p>
        <p>DisLikes:{props.disLike}</p>
    </div>
  )
}
