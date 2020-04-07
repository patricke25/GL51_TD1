package gl51.service

import gl51.data.Picture

interface PictureResizeService {
    //Change la dimension de l'image pour qu'elle soit en 1024*1024
    Picture resize()
}