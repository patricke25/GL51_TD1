package gl51.service

import gl51.data.Picture

interface PictureThumbnailService {
    //Crée un Thumbanil de l'image chargée
    Picture makeThumbnail()
}