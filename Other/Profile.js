import React, { Component } from 'react';
import {FaCamera, FaPhoneAlt, FaPencilAlt, FaUserAlt, FaPlus, FaFacebookF, FaGoogle} from 'react-icons/fa';
import {ImLocation} from 'react-icons/im';
import "./Profile.css";


export default class Profile extends Component {
    state = {
        divcontainer:false,
    }
    
    constructor() {
        super();
        this.state = {
          contacteditDetails: false,
          contacteditDetails: false
          
        };
        this.hideComponent = this.hideComponent.bind(this);
        this.inputOpenFileRef = React.createRef();
      }
      hideComponent(name) {
        switch (name) {
          case "contacteditDetails":
            this.setState({ contacteditDetails: !this.state.contacteditDetails });
            break;
            case "fromEditDetails":
            this.setState({ fromEditDetails: !this.state.fromEditDetails });
            break;
            case "aboutYourselfEdit":
            this.setState({ aboutYourselfEdit: !this.state.aboutYourselfEdit });
            break;
            case "languageEditDetails":
            this.setState({ languageEditDetails: !this.state.languageEditDetails });
            break;
            case "productsServicesEdit":
            this.setState({ productsServicesEdit: !this.state.productsServicesEdit});
            break;
            case "educationEditDetails":
            this.setState({ educationEditDetails: !this.state.educationEditDetails});
            break;
            case "certificateEditDetails":
            this.setState({ certificateEditDetails: !this.state.certificateEditDetails});
            break;
        }
    }

    showOpenFileDlg = () => {
        this.inputOpenFileRef.current.click()
    }
    render() {
        const { contacteditDetails, 
                fromEditDetails, 
                aboutYourselfEdit,
                languageEditDetails,
                productsServicesEdit,
                educationEditDetails,
                certificateEditDetails } = this.state;
        

        return (
        <div className="leftColumnProfilePage">
            <div className="profileBox">
                <div className="profileImageContainer">
                    <img src ="https://lsgigger.logicspice.com/public/img/front/user-img.png" id="userProfileImage" alt="User Profile"/> 
                </div>
                <div className="addNewImage">
                <input ref={this.inputOpenFileRef} accept="image/gif, image/jpeg, image/png" id="profile_image" type="file" style={{ display: "none" }}/>
                <div onClick={this.showOpenFileDlg} value="Select a File" ><FaCamera id= "cameraIcon"/></div>
                </div>
                <h2>Your Name</h2>
                <label><FaPhoneAlt id="phoneIcon"/>Contact</label>
                <div id="pencilEditIconContainer" onClick={() => this.hideComponent("contacteditDetails")}>{contacteditDetails?null:<FaPencilAlt/>}</div>
             {contacteditDetails && <div className="displaynone" id="div_contactn">
                    <input class="form-control" placeholder="Contact Number" autocomplete="off" minlength="10" maxlength="10" id="contactid" name="contact" type="text"/>
                    <div class="upbtn"><button type="button" className="cancelbtn" id="cntsuccbtn" onClick={() => this.hideComponent("contacteditDetails")}>Cancel</button> 
                    <button type="button" class="succbtn" id="succbtnbtn">Update</button></div>
                </div>}
                <div className="previewLink">
                <a href="#" className="previewPublicMode">
                Preview Public Mode
                </a>
                </div>
                <div className="userBasicInfo">
                    <ul style={{listStyleType:"none"}}>
                        <li style={{textAlign:"left"}}>
                            <FaUserAlt/> Member since<span>Date</span>
                        </li>
                        <li style={{textAlign:"left"}}>
                            <ImLocation /> From<span onClick={() => this.hideComponent("fromEditDetails")}>{fromEditDetails?null:<FaPencilAlt/>}</span>
                        </li>
                    </ul>
                    {fromEditDetails && <div className="selectCountryContainer">
                        <div className="selectYourCountry" style={{width: "16.6rem"}}>
                            <select class="form-control required error" id="countrynameid" name="countryname">
                            <option selected="selected" value="">
                            Select country
                            </option>
                            </select>
                        </div>
                        <div className="placeInfoContainer">
                            <div className="cityNameContainer" style={{display:"inline"}}>
                            <input style={{width:"5rem", display:"inline", marginRight:"0.7rem"}} className="form-control" placeholder="City" autocomplete="off" id="city_id" maxlength="20" name="city" type="text" required/>
                            </div>
                            <div classname="zipcodeContainer" style={{display:"inline"}}>
                            <input style={{width:"5rem", display:"inline",marginLeft:"0.7rem", marginRight:"0.7rem"}} className="form-control" placeholder="Zipcode" autocomplete="off" id="zipcode_id" maxlength="10" name="zipcode" type="text" required/>
                            </div>
                            <div class="upbtn"><button type="button" className="cancelbtn" id="cntsuccbtn" onClick={() => this.hideComponent("fromEditDetails")}>Cancel</button>  
                            <button type="button" class="succbtn" id="succbtnbtn">Add</button>
                            </div>
                        </div>
                    </div>}
                </div>
            </div>
            {/* Profile Box ends here */}
            <div className="userProfileDetailsContainer">
                <div className="userProfileDetails">
                  <div>
                  <h3>About Yourself</h3><div style={{display:"inline" , float:"right", color:"#CECECF"}} onClick={() => this.hideComponent("aboutYourselfEdit")}>{aboutYourselfEdit?null:<FaPencilAlt/>}</div>
                    {aboutYourselfEdit && <div className="aboutYourselfTextArea">
                       <textarea className="textAboutYourself" placeholder="Tell us about yourself" autocomplete="off" rows="4" id="descriptionid" name="description" cols="50" required></textarea>
                       <div class="upbtn"><button type="button" className="cancelbtn" id="cntsuccbtn" onClick={() => this.hideComponent("aboutYourselfEdit")}>Cancel</button>  
                       <button type="button" class="succbtn" id="succbtnbtn">Add</button>
                       </div>
                    </div>}
                  </div>
                </div>
                <div className="userProfileDetails">
                    <div>
                        <h3>Languages</h3><div style={{display:"inline", float:"right", color:"#CECECF"}} onClick={() => this.hideComponent("languageEditDetails")}>{languageEditDetails?null:<FaPlus/>}</div>
                    </div>
                    {languageEditDetails && <div>
                    <div className="addLanguageContainer">
                    <input class="form-control" placeholder="Add language" autocomplete="off" id="language_nameid" name="language_name" type="text" required/>
                    </div>
                    <div className="languageLevelSelect">
                    <select style={{width: "16.6rem"}} class="form-control" id="language_levelid" name="language_level" required>
                    <option selected="selected" value="">Language level</option>
                    <option value="Basic">Basic</option>
                    <option value="Conversational">Conversational</option>
                    <option value="Fluent">Fluent</option>
                    </select>
                       <div class="upbtn"><button type="button" className="cancelbtn" id="cntsuccbtn" onClick={() => this.hideComponent("languageEditDetails")}>Cancel</button>  
                       <button type="button" class="succbtn" id="succbtnbtn">Add</button>
                       </div>
                    </div>
                    </div>}
                </div>
                <div className="userProfileDetails">
                <div><h3>Linked Accounts</h3></div>
                <div className="socialMediaAccounts">
                    <ul className="linkedAccounts" style={{listStyleType:"none", textAlign:"left"}}>
                        <li><a href="#"><FaFacebookF/> Facebook</a></li>
                        <li><a href="#"><FaGoogle/> Google</a></li>
                    </ul>
                </div>
                </div>
                <div className="userProfileDetails">
                    <div>
                        <h3>Products & Services</h3><div style={{display:"inline", float:"right", color:"#CECECF"}} onClick={() => this.hideComponent("productsServicesEdit")}>{productsServicesEdit?null:<FaPlus/>}</div>
                    </div>
                    {productsServicesEdit && <div className="addProductName">
                    <input class="form-control" placeholder="Add Product/Service" autocomplete="off" id="product_nameid" name="product_name" type="text" required/>
                    <button onClick={this.showOpenFileDlg} id="addProductsServicesButtonId" type="button">Add Images</button>
                    <div class="upbtn"><button type="button" className="cancelbtn" id="cntsuccbtn" onClick={() => this.hideComponent("productsServicesEdit")}>Cancel</button>  
                       <button type="button" class="succbtn" id="succbtnbtn">Add</button>
                       </div>
                    </div>}
                </div>
                <div className="userProfileDetails">
                    <div>
                        <h3>Education</h3><div style={{display:"inline", float:"right", color:"#CECECF"}} onClick={() => this.hideComponent("educationEditDetails")}>{educationEditDetails?null:<FaPlus/>}</div>
                    </div>
                    {educationEditDetails && <div className="educationProfileContainer">
                        <div className="selectCollegeCountry">
                        <select style={{width:"16.5rem"}} class="form-control required" id="country_nameid" name="country_name">
                        <option selected="selected" value="">Country of college/university</option>
                        </select>
                        </div>
                        <div>
                        <input class="form-control required" placeholder="College/university name" autocomplete="off" id="university_nameid" name="university_name" type="text"/>
                        </div>
                        <div>
                            <div style={{display:"inline", marginRight:"0.5rem", float:"left"}}>
                            <select style={{display:"inline", width:"7.5rem"}}  class="form-control required" id="qual_nameid" name="qual_name">
                            <option selected="selected" value="">Qualifications</option>
                            <option value="B.A.">B.A.</option>
                            <option value="B.Arch.">B.Arch.</option>
                            <option value="B.E.">B.E.</option>
                            <option value="B.Sc.">B.Sc.</option>
                            <option value="LLB">LLB</option>
                            <option value="LLM">LLM</option>
                            <option value="M.A.">M.A.</option>
                            <option value="M.D.">M.D.</option>
                            <option value="M.Sc.">M.Sc.</option>
                            <option value="Ph.D">Ph.D</option>
                            <option value="Police clearance">Police clearance</option>
                            </select>
                            </div>
                            <div style={{display:"inline", marginRight:"-1rem", float:"right"}}>
                            <input style={{display:"inline", width:"6rem"}} class="form-control" placeholder="In stream" autocomplete="off" id="stream_nameid" name="stream_name" type="text" required/>
                            </div>
                        </div>
                        <div>
                            <select style={{width:"16.5rem"}} class="form-control required" id="yearid" name="year"><option selected="selected" value="">Year of education</option><option value="2021">2021</option><option value="2020">2020</option><option value="2019">2019</option><option value="2018">2018</option><option value="2017">2017</option><option value="2016">2016</option><option value="2015">2015</option><option value="2014">2014</option><option value="2013">2013</option><option value="2012">2012</option><option value="2011">2011</option><option value="2010">2010</option><option value="2009">2009</option><option value="2008">2008</option><option value="2007">2007</option><option value="2006">2006</option><option value="2005">2005</option><option value="2004">2004</option><option value="2003">2003</option><option value="2002">2002</option><option value="2001">2001</option><option value="2000">2000</option><option value="1999">1999</option><option value="1998">1998</option><option value="1997">1997</option><option value="1996">1996</option><option value="1995">1995</option><option value="1994">1994</option><option value="1993">1993</option><option value="1992">1992</option><option value="1991">1991</option><option value="1990">1990</option><option value="1989">1989</option><option value="1988">1988</option><option value="1987">1987</option><option value="1986">1986</option><option value="1985">1985</option><option value="1984">1984</option><option value="1983">1983</option><option value="1982">1982</option><option value="1981">1981</option><option value="1980">1980</option><option value="1979">1979</option><option value="1978">1978</option><option value="1977">1977</option><option value="1976">1976</option><option value="1975">1975</option><option value="1974">1974</option><option value="1973">1973</option><option value="1972">1972</option><option value="1971">1971</option><option value="1970">1970</option><option value="1969">1969</option><option value="1968">1968</option><option value="1967">1967</option><option value="1966">1966</option><option value="1965">1965</option><option value="1964">1964</option><option value="1963">1963</option><option value="1962">1962</option><option value="1961">1961</option></select>
                        </div>
                        <div class="upbtn"><button type="button" className="cancelbtn" id="cntsuccbtn"  onClick={() => this.hideComponent("educationEditDetails")}>Cancel</button>  
                       <button type="button" class="succbtn" id="succbtnbtn">Add</button>
                       </div>
                    </div>}

                </div>
                <div className="userProfileDetails">
                    <div>
                        <h3>Certificates</h3><div style={{display:"inline", float:"right", color:"#CECECF"}} onClick={() => this.hideComponent("certificateEditDetails")}>{certificateEditDetails?null:<FaPlus/>}</div>
                    </div>
                    {certificateEditDetails && <div>
                    <div>
                    <input class="form-control" placeholder="Certificate or award" autocomplete="off" id="certificate_nameid" name="certificate_name" type="text" required/>
                    </div>
                    <div>
                    <input class="form-control" placeholder="Certified from (e.g. Adobe)" autocomplete="off" id="certificate_fromid" name="certificate_from" type="text" required/>
                    </div>
                    <div>
                        <select style={{width:"16.5rem"}} class="form-control required" id="yearcertid" name="year"><option selected="selected" value="">Year of certification</option><option value="2021">2021</option><option value="2020">2020</option><option value="2019">2019</option><option value="2018">2018</option><option value="2017">2017</option><option value="2016">2016</option><option value="2015">2015</option><option value="2014">2014</option><option value="2013">2013</option><option value="2012">2012</option><option value="2011">2011</option><option value="2010">2010</option><option value="2009">2009</option><option value="2008">2008</option><option value="2007">2007</option><option value="2006">2006</option><option value="2005">2005</option><option value="2004">2004</option><option value="2003">2003</option><option value="2002">2002</option><option value="2001">2001</option><option value="2000">2000</option><option value="1999">1999</option><option value="1998">1998</option><option value="1997">1997</option><option value="1996">1996</option><option value="1995">1995</option><option value="1994">1994</option><option value="1993">1993</option><option value="1992">1992</option><option value="1991">1991</option><option value="1990">1990</option><option value="1989">1989</option><option value="1988">1988</option><option value="1987">1987</option><option value="1986">1986</option><option value="1985">1985</option><option value="1984">1984</option><option value="1983">1983</option><option value="1982">1982</option><option value="1981">1981</option><option value="1980">1980</option><option value="1979">1979</option><option value="1978">1978</option><option value="1977">1977</option><option value="1976">1976</option><option value="1975">1975</option><option value="1974">1974</option><option value="1973">1973</option><option value="1972">1972</option><option value="1971">1971</option><option value="1970">1970</option><option value="1969">1969</option><option value="1968">1968</option><option value="1967">1967</option><option value="1966">1966</option><option value="1965">1965</option><option value="1964">1964</option><option value="1963">1963</option><option value="1962">1962</option><option value="1961">1961</option></select>
                    </div>
                    <div class="upbtn"><button type="button" className="cancelbtn" id="cntsuccbtn" onClick={() => this.hideComponent("certificateEditDetails")}>Cancel</button>  
                       <button type="button" class="succbtn" id="succbtnbtn">Add</button>
                       </div>
                   </div>}
                </div>
            </div>
        </div>
        )
    }
} 
