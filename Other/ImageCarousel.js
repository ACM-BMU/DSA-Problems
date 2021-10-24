

import image from "./Placeholder.png"
import './Business_Segment.css';
import "react-responsive-carousel/lib/styles/carousel.min.css"; // requires a loader
import { Carousel } from 'react-responsive-carousel';

import React, { Component } from 'react'

export default class ImageCarousel extends Component {
    render() {
        return (
            <div id="Carousel">
            <Carousel  showArrows={false} showStatus={false} emulateTouch swipeable infiniteLoop autoPlay interval={3000} >
                <div id="containerImageCarousel">
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div> 
                </div>
                <div id="containerImageCarousel">
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div> 
                </div>
                <div id="containerImageCarousel">
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div>
                <div className="placeholderImageCarousel" ><img src={image} alt=""/></div> 
                </div>
            </Carousel>
            </div>
        )
    }
}




