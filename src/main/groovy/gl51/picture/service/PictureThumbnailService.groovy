package gl51.picture.service

import gl51.picture.data.Picture

interface PictureThumbnailService {
    //Crée un Thumbanil de l'image chargée
    Picture makeThumbnail()
}