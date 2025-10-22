const templateGrid = document.getElementById('templateGrid');
const captionInput = document.getElementById('captionInput');
const createBtn = document.getElementById('createBtn');
const memeList = document.getElementById('memeList');

let selectedTemplate = null;
let memes = [];

templateGrid.addEventListener('click', (e) => {
  if (e.target.tagName === 'IMG') {
    document.querySelectorAll('.template-grid img').forEach(img => {
      img.classList.remove('selected');
    });
    e.target.classList.add('selected');
    selectedTemplate = e.target.getAttribute('data-value');
  }
});


function showMemes() {
  memeList.innerHTML = '';

  for (let i = 0; i < memes.length; i++) {
    const meme = memes[i];

    const memeDiv = document.createElement('div');
    memeDiv.classList.add('meme-item');

    const image = document.createElement('img');
    image.src = meme.template;
    memeDiv.appendChild(image);

    const caption = document.createElement('div');
    caption.classList.add('caption-text');
    caption.textContent = meme.caption;
    memeDiv.appendChild(caption);

    const buttonsDiv = document.createElement('div');
    buttonsDiv.classList.add('meme-actions');

    const editButton = document.createElement('button');
    editButton.textContent = 'Edit';
    editButton.onclick = function() {
      editMeme(i);
    };

    const deleteButton = document.createElement('button');
    deleteButton.textContent = 'Delete';
    deleteButton.onclick = function() {
      deleteMeme(i);
    };

    buttonsDiv.appendChild(editButton);
    buttonsDiv.appendChild(deleteButton);
    memeDiv.appendChild(buttonsDiv);

    memeList.appendChild(memeDiv);
  }
}


function createMeme() {
  const captionText = captionInput.value.trim();

  if (!selectedTemplate) {
    alert('Please select a template image!');
    return;
  }

  if (captionText === '') {
    alert('Please enter a caption!');
    return;
  }

  memes.push({
    template: selectedTemplate,
    caption: captionText
  });

  captionInput.value = '';
  showMemes();
}


function editMeme(index) {
  const newCaption = prompt('Edit your caption:', memes[index].caption);
  if (newCaption !== null) {
    memes[index].caption = newCaption.trim();
    showMemes();
  }
}


function deleteMeme(index) {
  const confirmDelete = confirm('Are you sure you want to delete this meme?');
  if (confirmDelete) {
    memes.splice(index, 1);
    showMemes();
  }
}

createBtn.addEventListener('click', createMeme);
showMemes();
