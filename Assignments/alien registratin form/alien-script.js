

    const form = document.getElementById("alienForm");

    form.addEventListener("submit", (e) => {
      e.preventDefault(); 
      let valid = true;

     
      document.querySelectorAll(".error").forEach(err => err.textContent = "");

     
      const planet = document.getElementById("planetName").value.trim();
      const planetError = document.getElementById("planetError");
      if (!(/[aeiouAEIOU]/.test(planet) && /[0-9]/.test(planet))) {
        planetError.textContent = "Must contain at least one vowel and one digit.";
        valid = false;
      }

      
      const antenna = document.getElementById("antennaCount").value.trim();
      const antennaError = document.getElementById("antennaError");
      if (antenna === "" || antenna % 2 !== 0) {
        antennaError.textContent = "Only even numbers allowed.";
        valid = false;
      }

      
      const alienId = document.getElementById("alienId").value.trim();
      const alienIdError = document.getElementById("alienIdError");
      const alienPattern = /^ZOR-[A-Z]{2}_[0-9]{4}@UFO$/;
      if (!alienPattern.test(alienId)) {
        alienIdError.textContent = "Format: ZOR-XY_9999@UFO";
        valid = false;
      }


      const phrase = document.getElementById("phrase").value.trim();
      const phraseError = document.getElementById("phraseError");
const emojiOrPunc = /[\p{Extended_Pictographic},!.,?]/u;

if (!emojiOrPunc.test(phrase)) {
  phraseError.textContent = "Must include at least one emoji or punctuation.";
  valid = false;
}

      const date = document.getElementById("date").value;
      const dateError = document.getElementById("dateError");
      const today = new Date();
      const chosenDate = new Date(date);
      if (!date || chosenDate < today.setHours(0, 0, 0, 0)) {
        dateError.textContent = "Date cannot be in the past.";
        valid = false;
      }

    
      if (valid) {
        alert("🛸 Alien Registered Successfully!");
        form.reset();
      }
    });
