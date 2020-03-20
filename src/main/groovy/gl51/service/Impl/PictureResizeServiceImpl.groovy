package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureResizeService
import gl51.service.PictureService

import javax.inject.Inject

@Singleton
class PictureResizeServiceImpl implements PictureResizeService {
/*
    Cette classe gére le redimensionnement au format 1024*1024
 */

    @Inject PictureService pictureService

    @Override
    Picture resize(){
        Picture pic = pictureService.fetchPicture()
        pic.setPixels_x(1024)
        pic.setPixels_y(1024)
        //resize picture file ....
        pic.setPictureFile()
        return pic
    }
}
