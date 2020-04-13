package gl51.picture.service.impl

import gl51.picture.data.Picture
import gl51.picture.service.PictureCloudTransfertService
import gl51.picture.service.PictureResizeService
import gl51.picture.service.PictureThumbnailService

import javax.inject.Inject

class PictureCloudTransfertServiceImpl implements PictureCloudTransfertService{

    @Inject PictureResizeService resizeService
    @Inject PictureThumbnailService thumbnailService

    @Override
    int transfert(){
        Picture pic, thumbnail
        thumbnail = thumbnailService.makeThumbnail()
        pic = resizeService.resize()
        // Envoie de pic et thumbnail sur le cloud
    return 0
    }

}
