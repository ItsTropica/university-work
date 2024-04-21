function checkEmptyInput (inputItem) {
    let length = inputItem.value.length;
    if (length == 0) {
        inputItem.style.background = "#ffb3b3";
    } 
    else {
        inputItem.style.background = "#e6f9ff";
    }
}

// having issues with form validation so i went to w3schools and used some of their code to see if it works
// https://www.w3schools.com/js/js_validation.asp

function validateForm() {
    var valid = true;
        // first name validation
    let x = document.forms["hospitalForm"]["fname"].value;
    if (x.length == 0) {
        valid = false;
        // understood and implemented the document.getElementyByID by using w3schools resources
        // https://www.w3schools.com/jsref/prop_html_innerhtml.asp
        document.getElementById("fnameError").innerHTML = "First name must be filled out";

    }
    else {
        document.getElementById("fnameError").innerHTML = "";
    }

        // surname validation
    let y = document.forms["hospitalForm"]["sname"].value;
    if (y == "") {
        valid = false;
        document.getElementById("snameError").innerHTML = "Surname must be filled out";

    }
    else {
        document.getElementById("snameError").innerHTML = "";
    }

        // birth place validation
    let z = document.forms["hospitalForm"]["birthPlace"].value;
    if (z == "") {
        valid = false;
        document.getElementById("birthPlaceError").innerHTML = "Birth place must be filled out";
  
    }
    else {
        document.getElementById("birthPlaceError").innerHTML = "";
    }

    // // address validation
    let a = document.forms["hospitalForm"]["address1"].value;
    if (a == "") {
        valid = false;
        document.getElementById("addressError").innerHTML = "Address must be filled out";
  
    }
    else {
        document.getElementById("addressError").innerHTML = "";
    }

    // // home phone number validation (need to figure out how to do it for numbers?)
    let b = document.forms["hospitalForm"]["hphone"].value;
    if (b == "") {
        valid = false;
        document.getElementById("hphoneError").innerHTML = "Home Phone Number must be filled out";

    }
    else {
        document.getElementById("hphoneError").innerHTML = "";
    }

    // postcode validation 
    let d = document.forms["hospitalForm"]["postcode"].value;
    if (d.length!= 4) {
        valid = false;
        document.getElementById("postcodeError").innerHTML = "Postcode must be 4 digits";
    }
    else {
        document.getElementById("postcodeError").innerHTML = "";
    }

    // home phone number validation
    let e = document.forms["hospitalForm"]["hphone"].value;
    if (e.length!= 10) {
        valid = false;
        document.getElementById("hphoneError").innerHTML = "Home Phone Number must be 10 digits";
    }
    else {
        document.getElementById("hphoneError").innerHTML = "";
    }

    // personal phone number validation
    let f = document.forms["hospitalForm"]["pphone"].value;
    if (f.length!= 10) {
        valid = false;
        document.getElementById("pphoneError").innerHTML = "Personal Phone Number must be 10 digits";
    }
    else {
        document.getElementById("pphoneError").innerHTML = "";
    }

    // medicare number
    let g = document.forms["hospitalForm"]["medicare"].value;
    if (g.length!= 12) {
        valid = false;
        document.getElementById("medicareError").innerHTML = "Medicare number must be 12 digits";
    }
    else {
        document.getElementById("medicareError").innerHTML = "";
    }

    // medicare ID number
    let h = document.forms["hospitalForm"]["medicareId"].value;
    if (h.length!= 1) {
        valid = false;
        document.getElementById("medicareIdError").innerHTML = "Medicare ID number must be 1 digit";
    }
    else {
        document.getElementById("medicareIdError").innerHTML = "";
    }

    // date of birth validation, was struggling with it for ages, found on stackoverflow a validation method using regular expression
    // https://stackoverflow.com/questions/19820257/javascript-date-validation-dd-mm-yyyy-age-checking
    var i = document.forms["hospitalForm"]["dob"].value;
    /*
    if i use the regular expression /^([0-9]{4})-([0-9]{2})-([0-9]{2})$/ the dobError messages goes away, this regular expression is yyy-mm-dd but if i change it to /^([0-9]{2})-([0-9]{2})-([0-9]{4})$/ it becomes dd-mm-yyyy but the error message still stays up, idk
    */
    var pattern = /^([0-9]{4})-([0-9]{2})-([0-9]{2})$/;
    if (i == null || i == "" || !pattern.test(i)) {
        document.getElementById("dobError").innerHTML = "Please enter your Date of Birth";
        valid = false;
    }
    else {
        document.getElementById("dobError").innerHTML = "";
    }

    // validation for title (e.g. mr, mrs, etc) not working
    if (isNoCheckboxSelected(hospitalForm.titleCheck)) {
        valid = false;
        document.getElementById("titleError").innerHTML = "Choose a title";
    }
    else {
        document.getElementById("titleError").innerHTML = "";
    }

    return valid;
}

// checking whether the user has selected a radio box, got this from week5-examples | example 6
function isNoCheckboxSelected(checkboxGroup) {
    for (var i = 0; i < checkboxGroup.length; i++) {
      if (checkboxGroup[i].checked) {
          return false;
      }
    }
  return true;
}