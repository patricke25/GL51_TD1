package gl51.picture.service

import gl51.picture.data.Picture

interface PictureService {
    // Récupère l'image
    Picture fetchPicture()
}