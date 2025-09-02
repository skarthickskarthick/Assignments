const form = document.querySelector('form');

// ---------------------- Country & State Loader ----------------------
function loadcountries(country, state) {
    var data = {
        "India": ["Tamil Nadu", "Delhi", "Mumbai", "Bangalore"],
        "USA": ["New York", "California", "Texas"]
    };

    for (var c in data) {
        var option = document.createElement('option');
        option.text = c;
        option.value = c;
        country.add(option);
    }

    country.onchange = function () {
        state.innerHTML = '<option value="">-- Select State --</option>';
        var states = data[this.value];
        if (states) {
            for (var i = 0; i < states.length; i++) {
                var option = document.createElement('option');
                option.value = states[i];
                option.text = states[i];
                state.add(option);
            }
        }
    }
}
loadcountries(document.getElementById('country1'), document.getElementById('state1'));
loadcountries(document.getElementById('country2'), document.getElementById('state2'));

// ---------------------- Address Checkbox ----------------------
const checkbox = document.getElementById("checkadd");
checkbox.addEventListener("change", () => {
    if (checkbox.checked) {
        document.getElementById("country2").value = document.getElementById("country1").value;
        document.getElementById("country2").dispatchEvent(new Event("change"));
        document.getElementById("state2").value = document.getElementById("state1").value;

        document.getElementById("st2").value = document.getElementById("st1").value;
        document.getElementById("loc2").value = document.getElementById("loc1").value;
        document.getElementById("dist2").value = document.getElementById("dist1").value;
        document.getElementById("pin2").value = document.getElementById("pin1").value;
    } else {
        document.getElementById("country2").value = "";
        document.getElementById("state2").innerHTML = '<option value="">-- Select State --</option>';
        document.getElementById("st2").value = "";
        document.getElementById("loc2").value = "";
        document.getElementById("dist2").value = "";
        document.getElementById("pin2").value = "";
    }
});

// ---------------------- Input References ----------------------
const empid = document.querySelector('#empid');
const names = document.querySelector('#name');
const dob = document.querySelector('#dob');
const email = document.querySelector('#email');
const phone = document.querySelector('#phone');
const adno = document.querySelector('#adno');
const resume = document.querySelector('#resume');

// Present Address
const st1 = document.querySelector("#st1");
const loc1 = document.querySelector("#loc1");
const dist1 = document.querySelector("#dist1");
const pin1 = document.querySelector("#pin1");
const country1 = document.querySelector("#country1");
const state1 = document.querySelector("#state1");

// Permanent Address
const st2 = document.querySelector("#st2");
const loc2 = document.querySelector("#loc2");
const dist2 = document.querySelector("#dist2");
const pin2 = document.querySelector("#pin2");
const country2 = document.querySelector("#country2");
const state2 = document.querySelector("#state2");

// ---------------------- Submit Handler ----------------------
form.addEventListener('submit', (e) => {
    e.preventDefault();
    if (validate()) {
        alert("Data Submitted successfully");
    }
});

// ---------------------- Live Validation ----------------------
const inputs = document.querySelectorAll("input");
inputs.forEach(input => {
    input.addEventListener("input", () => {
        validateField(input);
    });
});

// ---------------------- Main Validate ----------------------
function validate() {
    let success = true;

    success = success && validateField(empid);
    success = success && validateField(names);
    success = success && validateField(dob);
    success = success && validateField(email);
    success = success && validateField(adno);
    success = success && validateField(phone);
    success = success && validateGender();
    success = success && validateResume(resume);

    success = success && validateField(st1);
    success = success && validateField(loc1);
    success = success && validateField(dist1);
    success = success && validateField(pin1);
    success = success && validateField(country1);
    success = success && validateField(state1);

    if (!checkbox.checked) {
        success = success && validateField(st2);
        success = success && validateField(loc2);
        success = success && validateField(dist2);
        success = success && validateField(pin2);
        success = success && validateField(country2);
        success = success && validateField(state2);
    }

    return Boolean(success);
}

// ---------------------- Field Validation ----------------------
function validateField(element) {
    let valid = true;

    if (element.id === "empid") {
        if (element.value.trim() === "") {
            errormessage(element, "Required field");
            valid = false;
        } else if (element.value.length < 5) {
            errormessage(element, "Invalid length (min 5)");
            valid = false;
        } else clearError(element);
    }

    if (element.id === "name") {
        if (element.value.trim() === "") {
            errormessage(element, "Required field");
            valid = false;
        } else if (!isAlphabetOnly(element.value.trim())) {
            errormessage(element, "Only alphabets allowed");
            valid = false;
        } else clearError(element);
    }

    if (element.id === "dob") {
        if (element.value.trim() === "") {
            errormessage(element, "Required field");
            valid = false;
        } else clearError(element);
    }

    if (element.id === "email") {
        if (element.value.trim() === "") {
            errormessage(element, "Required field");
            valid = false;
        } else if (!validateEmail(element.value.trim())) {
            errormessage(element, "Enter a valid email");
            valid = false;
        } else clearError(element);
    }

    if (element.id === "phone") {
        if (element.value.trim() === "") {
            errormessage(element, "Required field");
            valid = false;
        } else if (!isNumberOnly(element.value.trim())) {
            errormessage(element, "Only numbers allowed");
            valid = false;
        } else if (element.value.length !== 10) {
            errormessage(element, "Invalid number");
            valid = false;
        } else clearError(element);
    }

    if (element.id === "adno") {
        if (element.value.trim() === "") {
            errormessage(element, "Required field");
            valid = false;
        } else if (!isNumberOnly(element.value.trim())) {
            errormessage(element, "Only numbers allowed");
            valid = false;
        } else if (element.value.length !== 12) {
            errormessage(element, "Invalid number");
            valid = false;
        } else clearError(element);
    }

    if (element.tagName === "SELECT") {
        if (element.value.trim() === "") {
            errormessage(element, "Please select an option");
            valid = false;
        } else clearError(element);
    }

    if (["st1", "st2", "loc1", "loc2", "dist1", "dist2"].includes(element.id)) {
        if (element.value.trim() === "") {
            errormessage(element, "Required field");
            valid = false;
        } else clearError(element);
    }

    if (["pin1", "pin2"].includes(element.id)) {
        if (element.value.trim() === "") {
            errormessage(element, "Required field");
            valid = false;
        } else if (!isNumberOnly(element.value.trim())) {
            errormessage(element, "Only numbers allowed");
            valid = false;
        } else if (element.value.length !== 6) {
            errormessage(element, "Invalid pin code (6 digits)");
            valid = false;
        } else clearError(element);
    }

    return valid;
}

// ---------------------- Error Helpers ----------------------
function errormessage(element, message) {
    const errortag = element.parentElement.querySelector(".error");
    if (errortag) {
        errortag.innerText = message;
        element.classList.add("error-border");
    }
}
function clearError(element) {
    const errortag = element.parentElement.querySelector(".error");
    if (errortag) {
        errortag.innerText = "";
        element.classList.remove("error-border");
    }
}

// ---------------------- Utility Functions ----------------------
function isAlphabetOnly(str) {
    for (let i = 0; i < str.length; i++) {
        let ch = str[i].toLowerCase();
        if (ch === ' ') continue;
        if (ch < 'a' || ch > 'z') return false;
    }
    return str.length > 0;
}
function isNumberOnly(str) {
    for (let i = 0; i < str.length; i++) {
        let ch = str[i];
        if (ch < '0' || ch > '9') return false;
    }
    return str.length > 0;
}
const validateEmail = (email) => /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);

// ---------------------- Resume Validation ----------------------
function validateResume(element) {
    let valid = true;
    const file = element.files[0];

    if (!file) {
        errormessage(element, "Please upload a file");
        valid = false;
    } else {
        const fileSizeKB = file.size / 1024;
        const fileType = file.type;

        if (fileType !== "application/pdf") {
            errormessage(element, "Only PDF files are allowed");
            valid = false;
        } else if (fileSizeKB < 50 || fileSizeKB > 1024) {
            errormessage(element, "File size must be 50KB to 100KB");
            valid = false;
        } else clearError(element);
    }
    return valid;
}

// ---------------------- Gender Validation ----------------------
function validateGender() {
    let valid = true;
    const genderRadios = document.querySelectorAll('input[name="gender"]');
    const genderError = document.getElementById("gender-error");

    let isChecked = false;
    genderRadios.forEach(radio => {
        if (radio.checked) isChecked = true;
    });

    if (!isChecked) {
        genderError.innerText = "Please select a gender";
        valid = false;
    } else genderError.innerText = "";

    return valid;
}
