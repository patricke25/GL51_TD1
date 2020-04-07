package gl51.service

import gl51.data.Picture

interface PictureService {
    // Récupère l'image
    Picture fetchPicture()
}