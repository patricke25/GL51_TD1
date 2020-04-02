package gl51.picture.service.Impl

import gl51.picture.data.Picture
import gl51.picture.service.PictureResizeService
import gl51.picture.service.PictureService

import javax.inject.Inject

class PictureResizeServiceImpl implements PictureResizeService {


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
