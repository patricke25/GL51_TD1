package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureCloudTransfertService
import gl51.service.PictureResizeService
import gl51.service.PictureThumbnailService

import javax.inject.Inject

@Singleton
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
