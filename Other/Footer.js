import "./Footer.css";
import React, { Component } from 'react'
import {FaTelegram, FaFacebookF, FaTwitter, FaCopyright } from "react-icons/fa";

export default class Footer extends Component {
    render() {
        return (
                <div className="footerContainer">
                <div id="newsletterTextFooter">Newsletter</div>
                <div id="emailContainer">
                <input id='inputEmailFooter'
                  type="email"
                  name="email"
                  placeholder="    Your Email"/>
                  <button id="telegramSubmitButton"><FaTelegram id="telegramIconFooter"/>
                  </button>
                </div>
                <div className="optionsFooterContainer">
                 <p id="homeOptionsFooter"><a href="www.google.com">Home</a></p>
                    <p id="experienceOptionsFooter"><a href="www.google.com">Experience</a></p>
                    <p id="newsOptionsFooter"><a href="www.google.com">News</a></p>
                    <p id="aboutUsOptionsFooter"><a href="www.google.com">AboutUs</a></p>
                    <p id="jobsOptionsFooter"><a href="www.google.com">Jobs</a></p>
                    <p id="contactUsOptionsFooter"><a href="www.google.com">Contact Us</a></p>
                </div>
                <div id="socialmediaFooter">
                    <a href="www.google.com"><FaFacebookF id="facebookIconFooter"/></a>
                    <a href="www.google.com"><FaTwitter id="twitterIconFooter"/></a>
                </div>
                <p id="copyrightTextFooter">
                    <FaCopyright/> Copyright 2019 - Lift Media
                </p>
            </div>
            
        )
    }
}






